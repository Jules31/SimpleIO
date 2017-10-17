package Exo4;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class WriteFile {


    public static void main(String[] args) {
        try {
            String line = "";
            File file = new File("file.txt"); //
            file.createNewFile();
            FileWriter FileWriter = new FileWriter(file);
            while (!line.equals("quit")) {
                Scanner li = new Scanner(System.in);
                line = li.nextLine();
                if (!line.equals("quit")) {
                    FileWriter.write(line + "\n");  //  dans le fichier
                } else {
                    FileWriter.close(); //ferme le fichier
                }
            }

        } catch (Exception e) {
        }
    }
}