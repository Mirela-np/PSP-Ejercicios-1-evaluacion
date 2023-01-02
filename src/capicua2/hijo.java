package capicua2;

import java.util.Scanner;

//Escribe un programa en Java que reciba números por entrada estándar y visualice por pantalla si son o no capicúas o
// si no se ha recibido ningún parámetro.
// Escribe otro programa para que lo invoque como subproceso y almacene la salida del proceso hijo en un fichero de texto.
public class hijo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String cadena;
        int num,aux,resto;
        int inverso=0;

        System.out.println("Introduce un numero mayor que 10");
         cadena=sc.nextLine();
         num=Integer.parseInt(cadena);
         aux=num;
         while(aux!=0) {
             resto = aux % 10;
             inverso = inverso * 10 + resto;
             aux = aux / 10;
         }
         if(num==inverso){
             System.out.println("es capicua");
         }else{
             System.out.println("no es capicua");
         }

         if(cadena.length()==0){
             System.out.println("no hay argumentos");
         }



    }
}
