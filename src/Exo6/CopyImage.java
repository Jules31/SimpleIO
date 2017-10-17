package Exo6;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.*;


public class CopyImage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir l'url de votre photo");
        String urlSaisi = sc.nextLine();
        String urlPhoto = new String(urlSaisi);
        try {
            URL url = new URL(urlPhoto);

            InputStream in = new BufferedInputStream(url.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1 != (n = in.read(buf))) {
                out.write(buf, 0, n);
            }
        }
            catch (MalformedURLException e){
                e.printStackTrace();
            }
            catch(IOException e){
                e.printStackTrace();
        }


    }
}
