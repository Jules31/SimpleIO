package Exo2;
import java.io.File;
import java.util.Scanner;


public class List {

    public static void main(String[] args) {

            Scanner f = new Scanner(System.in);
            System.out.println("Entrez le chemin d'accès :");
            File file = new File(f.nextLine());
            listDirectory(file);
    }

    public static void listDirectory(File file){

        String [] listDirectory;
        int i;
        listDirectory=file.list();
        for(i=0;i<listDirectory.length;i++){
            System.out.println(listDirectory[i]);
        }
    }
}
