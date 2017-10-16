package exo3;
import java.util.Scanner;
import java.io.File;



public class Extension {

    public static void main (String[] args){
        System.out.println("Saisissez le chemin :");
        Scanner sc  = new Scanner(System.in);

        System.out.println("Saisissez l'extension :");
        String extension = new Scanner(System.in).nextLine();
        String path = sc.nextLine();
        File directory = new File(path);
        File[] files;


    }
}
