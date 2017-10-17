package Exo1;

import java.io.File;
import java.util.Scanner;

public class Chemin {
    public static void main (String[] args){

        System.out.println("Entrez votre chemin d'accès: ");
        Scanner sc  = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);

        if (file.isFile()){                                                             //renvoie si le chemin existe ou non
            System.out.println("Le chemin d'accès existe et il s'agit d'un fichier");
        }
        if(file.exists()&& file.isDirectory()){
            System.out.println("Le chemin d'accès existe et il s'agit d'un répertoire");
        }


    }
}
