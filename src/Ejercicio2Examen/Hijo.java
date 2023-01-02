package Ejercicio2Examen;

/*
Realiza un programa Java que admita uno o más argumentos desde main() y devuelva
los siguientes códigos de salida, además de realizar las siguientes funcionalidades:

a. Si no le han enviado ningún argumento, el proceso deberá devolver -1

b. SI entre los argumentos existe una o más cadenas, deberá concatenarlas y
mostrarlas por pantalla con el siguiente formato: cadenaN-cadenaN-1-…cadena2-cadena1.
Además, deberá finalizar el proceso con código 0.

c. Si los argumentos son todos enteros positivos, deberá mostrar por pantalla la
suma de todos ellos y devolver como valor de salida 2. En caso de que exista
algún número negativo, mostrará su suma igualmente, pero el valor de salida
a devolver será 3.

Escribe otro programa Java que ejecute el anterior. Este segundo programa deberá
mostrar por pantalla un mensaje explicativo de cada caso, en función del resultado
obtenido, dependiendo del valor devuelto al ejecutar el programa anterior (4 ptos)
 */

public class Hijo {
    public static void main(String[] args) {
        String cadena = "";
        int resultado = 0;
        int contador = 0;

        if (args.length == 0) {                         //si no se le envia ningunargumento, salida -1
            System.exit(-1);

        } else {
            try {
                for (int i = 0; i < args.length; i++) {
                    resultado += Integer.parseInt(args[i]);     //se leen los argumentos y se pasan a enteros
                    if (Integer.parseInt(args[i]) < 0) {        // si los enteros son negativos, se añaden al contador
                        contador++;
                    }
                }
                System.out.println("la suma es :" + resultado);     // se muestra la suma
                if (contador > 0) {         // si hubo numeros negtivos salida 3
                    System.exit(3);
                } else {
                    System.exit(2);   // en caso contrario, salida 2
                }
            } catch (Exception ex) {
                ex.printStackTrace();

                int aux;
                for (int j = args.length - 1; j >= 0; j--) {
                    try {
                        aux = Integer.parseInt(args[j]);
                    } catch (NumberFormatException e){
                        cadena = cadena.concat(args[j]+"-");    // concatenamos la cadena e orden inverso
                    }
                }
                System.out.println(cadena);
                System.exit(0);

            }
        }
    }
}
