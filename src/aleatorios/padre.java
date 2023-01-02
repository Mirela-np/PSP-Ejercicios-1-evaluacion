package aleatorios;

import java.io.*;
import java.util.Scanner;

public class padre {
    public static void main(String[] args) {

        String linea;

        try{
            File f=new File(".\\out\\production\\pruebas");
            ProcessBuilder pb=new ProcessBuilder("java", "aleatorios.hijo");
            pb.directory();
            Process p=pb.start();

            InputStream is=p.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));

            PrintStream ps=new PrintStream(p.getOutputStream());
            //BufferedReader bre=new BufferedReader(new InputStreamReader(System.in));
            Scanner sc=new Scanner(System.in);
            String liner;
            while((liner=sc.nextLine()).compareTo("fin")!=0){
                ps.println(liner);
                ps.flush();

                if((linea=br.readLine())!=null){
                    System.out.println(linea);
                }
            }
            System.out.println("finalizando");
            p.destroy();

        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
