package exo3;
import java.io.File;
import java.util.Scanner;



public class Extension {

    public static void main (String[] args){
        Scanner f = new Scanner(System.in);
        System.out.println("Entrez le chemin d'accès :");
        File file = new File(f.nextLine());

        listDirectory(file);
    }

    public static void listDirectory(File file){

        String [] listDirectory;
        Scanner t = new Scanner(System.in);
        System.out.println("Saissisez l'extension du fichier :");
        String type = t.nextLine();
        int i;
        listDirectory=file.list();
        for(i=0;i<listDirectory.length;i++){
            if(listDirectory[i].endsWith(type)){

                System.out.println(listDirectory[i].replaceFirst(type,""));
            }

        }
    }
    }

