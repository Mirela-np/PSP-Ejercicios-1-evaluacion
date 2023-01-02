package palindromo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//8. Realiza un programa Jva que lea una cadena desde la entrada estándar y visualice en pantalla si
// la cadena es o no un palíndromo o si la cadena esta vacia(lo longitud es 0).
//Realiza un segundo programa Java que ejecute el anterior, debe leer la cadena desde el teclado y mostrar la salida por pantalla.
// Transforma este ejercicio para que
// la cadena se obtenga de un fichero de texto y se envie la salida de error a un fichero.

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
