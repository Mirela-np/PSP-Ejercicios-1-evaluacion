package ejercicio7;
//7. Crea un programa Java que lea cadenas desde la entrada estándar hasta escribir un *
// .A continuación crea otro programa que ejecute el anterior.

import java.util.Scanner;

public class hijo {
    public static void main(String[] args) {



    Scanner sc=new Scanner(System.in);
    String cadena="";
try{
    while(!cadena.equals("*")){
        System.out.println("Introduce una cadena;*para salir");
        cadena=sc.nextLine();
        System.out.println("la cadena introducida es " + cadena);
    }

}catch(Exception e){
    e.printStackTrace();
}

}
}
