package Exo2;
import java.io.File;
import java.util.Scanner;


public class List {

    public static void main(String[] args) {
        System.out.println("Entrez votre chemin d'accès: ");
        Scanner sc = new Scanner(System.in);}

    public void listFiles(String path){
        File directory = new File(path);
        File[] files;
        files = directory.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}