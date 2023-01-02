package capicua1;

//Escribe un programa en Java que reciba números por entrada estándar y visualice por pantalla si son o no capicúas
// o si no se ha recibido ningún parámetro.
// Escribe otro programa para que lo invoque como subproceso y almacene la salida del proceso hijo en un fichero de texto.

import java.util.Scanner;

public class hijo {
    public static void main(String[] args) {
        System.out.println("Introduce un numero mayor que 10");
        Scanner sc=new Scanner(System.in);
        String cadena=sc.nextLine();
        StringBuilder sb=new StringBuilder(cadena);
        String cadenaInversa=sb.reverse().toString();
        if(cadena.equals(cadenaInversa)){
            System.out.println("es capicua");
        }else{
            System.out.println("no es capicua");
        }

        if(cadena.length()==0){
            System.out.println("no se han introducido argumentos");
        }
;

    }
}
