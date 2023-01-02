package ejercicio2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ej2Padre {

    public static void main(String[] args) throws IOException {

        File directorio = new File(".\\out\\production\\pruebas");
        ProcessBuilder pb = new ProcessBuilder("java", "ejercicio2.ej2Hijo");
        pb.directory(directorio);
        Process p = pb.start();


        OutputStream os = p.getOutputStream();
        os.write("10\n".getBytes());
        os.write("15\n".getBytes());
        os.flush();


        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1)
                System.out.print((char) c);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("valor salida: " + exitVal);

        } catch (InterruptedException in) {
            in.printStackTrace();
        }

        try{
            InputStream is=p.getErrorStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println("Error> " +linea);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
