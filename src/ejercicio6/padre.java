package ejercicio6;

import java.io.*;
import java.util.Scanner;

public class padre {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce una cadena");
        String cadena=sc.nextLine();

        File f=new File(".\\out\\production\\pruebas");
        ProcessBuilder pb=new ProcessBuilder("java","ejercicio6.hijo",cadena);
        pb.directory(f);
        Process p=pb.start();

        try{
                InputStream is=p.getErrorStream();
                BufferedReader br=new BufferedReader(new InputStreamReader(is));
                String linea;
                while((linea=br.readLine())!=null)
                    System.out.println("Error > :"+ linea);



    }catch(IOException e){
            e.printStackTrace();
        }
        int exitVal;
        try{
            exitVal=p.waitFor();
            System.out.println("valor salida " + exitVal);
            switch(exitVal){
                case(0):
                    System.out.println("Salida correcta");
                    break;
                case(1):
                    System.out.println("Salida incorrecta");
                    break;
            }

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        try{
            FileOutputStream fos=new FileOutputStream("fic2.txt");
            PrintWriter pw=new PrintWriter(fos);

            InputStream is=p.getInputStream();
            BufferedReader brer=new BufferedReader(new InputStreamReader(is));

            String liner;
            while((liner=brer.readLine())!=null) {
                pw.println(liner);
            }
            brer.close();
            pw.close();

        }catch(Exception ee){
            ee.printStackTrace();




        }
        }






}
