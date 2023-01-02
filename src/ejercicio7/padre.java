package ejercicio7;

import java.io.*;
import java.util.Scanner;

public class padre {
    public static void main(String[] args) throws IOException {


        Scanner sc=new Scanner(System.in);
        String cadena="";
        File f=new File(".\\out\\production\\pruebas");
        ProcessBuilder pb=new ProcessBuilder("java","ejercico7.hijo");
        Process p=pb.start();

        PrintStream s=new PrintStream(p.getOutputStream());
        do{
            System.out.println("introduzca una cadena");
            cadena=sc.nextLine();
            s.println(cadena);
            s.flush();
        }while(!cadena.equals("*"));
        s.close();

        InputStream is=p.getInputStream();
        int c;
        while((c=is.read())!=-1) {
            System.out.println((char) c);
            is.close();
        }

        int exitVal;

        try {
            exitVal = p.waitFor();
            System.out.println("valor salida" + exitVal);

        }catch(InterruptedException ie){
            ie.printStackTrace();


            try{
                InputStream ins=p.getErrorStream();
                BufferedReader brer=new BufferedReader(new InputStreamReader(ins));
                String linea;
                while((linea=brer.readLine())!=null) {
                    System.out.println("Error> " + linea);
                }
                }catch(IOException io){
                io.printStackTrace();

                }
            }



        }




    }

