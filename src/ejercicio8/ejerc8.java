package ejercicio8;

import java.io.File;
import java.io.IOException;

public class ejerc8 {

    public static void main(String[] args) throws IOException, InterruptedException {


        File dir = new File(".\\out\\production\\pruebas");
        ProcessBuilder pb = new ProcessBuilder("java", "ejLectura.Hijo");
        pb.directory(dir);

        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
   // esta heredando la salida por consola = introduce una cadena
        //hay que crear previamente la carpeta con el texto a leer
        //la cadena esta en fichero.txt
       //File fic=new File("Fichero.txt");
        pb.redirectInput(ProcessBuilder.Redirect.from(new File("Fichero.txt")));

        pb.redirectError(ProcessBuilder.Redirect.to(new File("Error.txt")));

        Process p=pb.start();

        int exitVal;
        exitVal=p.waitFor();
        System.out.println("El valor de salida es :"+ exitVal);




    }
}
