package Exo6;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Image {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez l'url de l'image :");
        String url = scan.nextLine();
        System.out.println("Saisissez le nom de l'image à enregistrer :");
        String name = scan.nextLine();

        try {
            BufferedImage imgURL =  ImageIO.read(new URL(url));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
