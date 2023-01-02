package ejercicio1;

import java.io.*;

public class ej1Padre {

    public static void main(String[] args) throws IOException {

        File dir=new File(".\\out\\production\\pruebas");
        ProcessBuilder pb=new ProcessBuilder("java","ejercicio1.ej1Hijo","MIA");
        pb.directory(dir);
        Process p=pb.start();



        try{
            InputStream is=p.getInputStream();
            int c;

            while((c=is.read())!=-1)
                System.out.print((char)c);

            is.close();
        }catch(IOException io){
            io.printStackTrace();
        }

        int exitVal;
        try{
        exitVal=p.waitFor();
            System.out.println("valor salida :"+ exitVal);


    }catch(InterruptedException in){
            in.printStackTrace();
        }

        }
}
