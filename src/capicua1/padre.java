package capicua1;

import java.io.*;

public class padre {
    public static void main(String[] args) throws IOException {

        File f=new File(".out\\production\\pruebas");
        ProcessBuilder pb=new ProcessBuilder("java","capicua1.hijo");
        pb.directory(f);
        File fichero=new File("Fic.txt");
        pb.redirectInput(ProcessBuilder.Redirect.from(fichero));
        Process p=pb.start();

       /* try{
            InputStream is=p.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        */



        try{
            InputStream in=p.getErrorStream();
            BufferedReader brer=new BufferedReader(new InputStreamReader(in));
            String line;
            while((line=brer.readLine())!=null){
                System.out.println("Error > : " + line);
            }
        }catch (IOException io){
            io.printStackTrace();

            int exitVal;
            try{
                exitVal=p.waitFor();
                System.out.println("Valor salida : "+ exitVal);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }


    }
}
