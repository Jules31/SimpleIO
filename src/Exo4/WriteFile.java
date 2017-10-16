package Exo4;
import java.io.File;
import java.util.Scanner;

public class WriteFile {
    static File file = new File("file.txt");

    public static void main(String[] args) {
        String typing = "";
        Scanner scan = new Scanner(System.in);
        while (!typing.equals("quit")) {
            typing = scan.nextLine();

        }
    }
}