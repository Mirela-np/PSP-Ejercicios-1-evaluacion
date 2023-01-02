package palindromoFichero;

import java.io.File;
import java.io.IOException;

public class padre {
    public static void main(String[] args) throws IOException, IOException {

        System.out.println("La cadena está en el fichero Datos.txt");

        File directorio = new File(".\\out\\production\\pruebas");
        ProcessBuilder pb = new ProcessBuilder("java", "palindromoFichero.hijo");

        // se establece el directorio donde se encuentra el ejecutable
        pb.directory(directorio);

        //Salida a consola
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        //La cadena está en un fichero
        File fichero = new File("Datos.txt");
        pb.redirectInput(ProcessBuilder.Redirect.from(fichero));

        //salida de error a fichero
        File fErr = new File("Ferror.txt");
        pb.redirectError(fErr);

        // se ejecuta el proceso
        Process p = pb.start();

        // COMPROBACION DE ERROR - 0 bien - 1 mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

