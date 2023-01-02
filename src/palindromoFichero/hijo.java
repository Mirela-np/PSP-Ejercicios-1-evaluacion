package palindromoFichero;

//Modifica el ejercicio 7 para que al ejecutar el programa ,la entrada al proceso se obtenga a partir de un fichero de texto.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hijo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        String cadena=br.readLine();

        if(cadena.length()==0){
            System.out.println("la cadena esta vacia");
        }else{
            StringBuilder sb=new StringBuilder(cadena);
            String cadenaInversa=sb.reverse().toString();
            if((cadena.compareTo(cadenaInversa))==0){
                System.out.println("es un palindromo");

            }else{
                System.out.println("no es un palindromo");
            }
        }
        isr.close();

    }
}

