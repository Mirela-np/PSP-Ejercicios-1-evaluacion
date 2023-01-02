package mayusculas;

import java.io.*;

public class padre {

    public static void main(String[] args) {


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      //asociamos la entrada estandar(teclado) al is
            File directorio = new File(".\\out\\production\\pruebas");
            ProcessBuilder pb = new ProcessBuilder("java", "mayusculas.hijo");
            pb.directory(directorio);

            Process hijo = pb.start();

            BufferedReader brHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));   //estoy conectando con los que el hijo escriba
            PrintStream ps = new PrintStream(hijo.getOutputStream());    //enviar datos al hijo

            System.out.println("Introduzca cadenas:");
            String lectura, respuesta;
            while (!(lectura = br.readLine()).equals("*")) {
                ps.println(lectura);        //le mandamos al hijo lo que acabamos de leer
                ps.flush();
                if ((respuesta = brHijo.readLine()) != null)   //comprobamos si el hijo envia algo
                    System.out.println(respuesta);
            }
            System.out.println("Fin del proceso");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

