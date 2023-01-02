package palindromo;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class padre {
    public static void main(String[] args) throws IOException {


        String cadena = "";
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una cadena a procesar: ");
        cadena = sc.nextLine();
        File f=new File(".\\out\\production\\pruebas");
        ProcessBuilder pb=new ProcessBuilder("java","palindromo.hijo");
        pb.directory(f);

        Process p=pb.start();

        cadena+="/n";

        OutputStream os = p.getOutputStream();
        os.write(cadena.getBytes());
        os.flush();

        //exitval

        //errorstream


    }
}
