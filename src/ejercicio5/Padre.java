package ejercicio5;

import java.io.*;
import java.util.Scanner;

public class Padre {

    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.println("introduce una cadena");
        String cadena=sc.nextLine();
         File f=new File(".\\out\\production\\pruebas");
         ProcessBuilder pb=new ProcessBuilder("java","ejercicio5.Hijo",cadena);
         pb.directory(f);
         Process p=pb.start();

         try(
             InputStream is=p.getErrorStream();
             BufferedReader br=new BufferedReader(new InputStreamReader(is));){
             String linea;
             while((linea=br.readLine())!=null){
                 System.out.println("Error >" + linea);

             }
         }catch(Exception e){
             e.printStackTrace();
         }

         int exitVal;
         try{
             exitVal=p.waitFor();
             System.out.println("valor salida : " + exitVal);
         }catch(InterruptedException ie){
             ie.printStackTrace();

        }

         try(
             InputStream ins=p.getInputStream();
             BufferedReader buf=new BufferedReader(new InputStreamReader(ins));){
             String liner;
             while((liner=buf.readLine())!=null)
                 System.out.println(liner);


         }catch(IOException io){
             io.printStackTrace();
         }
    }
}
