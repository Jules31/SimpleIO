package Exo5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {
        FileInputStream read = null;
        FileOutputStream write = null;
        try {
            Scanner pathSource = new Scanner(System.in);
            System.out.println("Chemin du fichier à copier :");
            String pathS = pathSource.nextLine();
            Scanner pathDestination = new Scanner(System.in);
            System.out.println("Chemin du fichier copié :");
            String pathD = pathDestination.nextLine();

            read = new FileInputStream(new File(pathS));
            write = new FileOutputStream(new File(pathD));
            byte[] buf = new byte[8];
            int i = 0;
            while ((i = read.read(buf)) >= 0) {
                write.write(buf);
                buf = new byte[8];
            }
            System.out.println("Copie terminée !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (read != null)
                    read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (write != null)
                    write.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}