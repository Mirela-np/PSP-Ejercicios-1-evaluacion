package Ejercicio2Examen;

import java.io.*;

public class Padre {

    public static void main(String[] args) throws IOException {

        File fi=new File(".\\out\\production\\pruebas");
    //    ProcessBuilder pb=new ProcessBuilder("java","Ejercicio2Examen.Hijo");
    //    ProcessBuilder pb=new ProcessBuilder("java","Ejercicio2Examen.Hijo","2","3","-1");
    //    ProcessBuilder pb=new ProcessBuilder("java","Ejercicio2Examen.Hijo","2","3","1");
        ProcessBuilder pb=new ProcessBuilder("java","Ejercicio2Examen.Hijo","2","hola","3","-1","ana");
        pb.directory(fi);
        Process p=pb.start();

        try{
            InputStream is=p.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
                String linea;
                while((linea=br.readLine())!=null){
                    System.out.println(linea);
            }

        }catch(IOException io){
            io.printStackTrace();
        }

        int exitVal;
        try{
            exitVal=p.waitFor();
            System.out.println("valor salida :" + exitVal);
            switch (exitVal){
                case(0):
                    System.out.println("se han enviado cadenas de texto como argumentos");
                    break;
                case(2):
                    System.out.println("numeros positivos");
                    break;
                case(3):
                    System.out.println("hay algun negativo");
                    break;
                case(-1):
                    System.out.println("no se ha enviado ningun argumento");
                    break;
            }
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

    }
}
