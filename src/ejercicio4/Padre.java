package ejercicio4;

import java.io.*;

public class Padre {
    public static void main(String[] args) throws IOException {

        File f=new File(".\\out\\production\\pruebas");
        ProcessBuilder pb=new ProcessBuilder("java");
        pb.directory(f);
        Process p=pb.start();


        try{
            InputStream is=p.getErrorStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println("Error> " +linea);
            }catch(IOException i){
            i.printStackTrace();

            }

          int exitVal;
        try{
            exitVal=p.waitFor();
            System.out.println("VALOR DE SALIDA :" + exitVal);
            switch(exitVal) {
                case (0):
                    System.out.println("Salida correcta");
                    break;
                case (1):
                    System.out.println("falta un parametro");
                    break;
                case (2):
                    System.out.println("parametro no numerico");
                    break;
                case (3):
                    System.out.println("parametro menor que 0");
                    break;
            }

        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
