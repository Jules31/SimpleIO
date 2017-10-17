package Exo7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salaire {
    public static void main (String[] args) {

    }

}

abstract class Employe {
    String nom;
    String prenom;
    int age;
    String date;

    public Employe(String nom, String prenom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    double calculerSalaire() {
        return 0;
    }

    String getNom() {
        return ("L'employé " + nom + " " + prenom);
    }
}

class Vendeur extends Employe{
    int salary;
    public Vendeur (String nom, String prenom, int age, String date, int salary){
        super(nom, prenom, age, date);
        this.salary=salary;
    }
    double calculerSalaire() {
        return (salary*0.2)+400;
    }
    String getNom() {
        return ("Le vendeur " + nom + " " + prenom);
    }
}

class Representant extends Employe{
    int salary;
    public Representant (String nom, String prenom, int age, String date, int salary){
        super(nom, prenom, age, date);
        this.salary=salary;
    }
    double calculerSalaire() {
        return (salary*0.2)+800;
    }
    String getNom() {
        return ("Le representant " + nom + " " + prenom);
    }
}

class Technicien extends Employe{
    int salary;
    public Technicien (String nom, String prenom, int age, String date, int salary){
        super(nom, prenom, age, date);
        this.salary=salary;
    }
    double calculerSalaire() {
        return (salary*5);
    }
    String getNom() {
        return ("Le technicien " + nom + " " + prenom);
    }
}

class Manutentionnaire extends Employe{
    int salary;
    public Manutentionnaire (String nom, String prenom, int age, String date, int salary){
        super(nom, prenom, age, date);
        this.salary=salary;
    }
    double calculerSalaire() {
        return (salary*65);
    }
    String getNom() {
        return ("Le Manutentionnaire " + nom + " " + prenom);
    }
}

interface aRisque{
    int prime = 200;
}

class TechARisque extends Employe implements aRisque{
    int salary;
    public TechARisque (String nom, String prenom, int age, String date, int salary){
        super(nom, prenom, age, date);
        this.salary=salary;
    }
    double calculerSalaire() {
        return (salary*5)+prime;
    }
    String getNom() {
        return ("Le technicien à risque " + nom + " " + prenom);
    }
}

class ManuARisque extends Employe implements aRisque{
    int salary;
    public ManuARisque (String nom, String prenom, int age, String date, int salary){
        super(nom, prenom, age, date);
        this.salary=salary;
    }
    double calculerSalaire() {
        return (salary*65)+prime;
    }
    String getNom() {
        return ("Le manutentionnaire à risque " + nom + " " + prenom);
    }
}

class Personnel{
    List<Employe> liste = new ArrayList<Employe>();

    void ajouterEmploye(Employe e){
        liste.add(e);
    }
    void calculerSalaires(){
        for (Employe e:liste){
            System.out.println(e.getNom() + " est payé " + e.calculerSalaire());
        }

    }
    double salaireMoyen(){
        double somme = 0;
        for (Employe e:liste){
            somme+= e.calculerSalaire();
        }
        return somme/liste.size();
    }
}

