package ejLectura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hijo {
    public static void main(String[] args) {
        try(
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader bt=new BufferedReader(is);){

            String texto;
            System.out.println("Introduce una cadena");
            texto=bt.readLine();
            System.out.println("el texto introducido es : " + texto);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
