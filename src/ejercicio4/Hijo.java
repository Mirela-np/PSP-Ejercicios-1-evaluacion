package ejercicio4;

/*
Realiza un programa Java que admita argumentos desde main() y devuelva con System.exit() los siguientes valores:
- si el numero de argumentos es <1 debe devolver 1
- si el argumentos es una cadena debe devolver 2
- si el argumento es un numero menor que 0 debe devolver 3
- en cualquier otra situación debe devolver 0
Realiza un segundo programa Java que ejecute el anterior. Ese segundo programa debe mostrar por pantalla lo que pasa dependiendo del valor devuelto al ejecutar el programa anterior.
 */

public class Hijo {
    public static void main(String[] args) {

        // Si argumentos menor que 1
       if(args.length<1){
           System.exit(1);
       }

       // Si es un string
       String a=args[0];   // esta linea no la entiendo ->> Asigna el primer argumento a una variable de tipo String para luego
    //                                                      intentar pasarla a entero y saber si es una cadena o entero
       int n=0;
       try{
           n=Integer.parseInt(a);
       }catch(NumberFormatException nf){
           System.exit(2);
       }

       // Si llegó hasta aquí es porque no saltó la excepción anterior y es un número entero
       if(n<0){
           System.exit(3);
       }

       // Si llegó hasta aquí es un entero mayor de 0
       System.exit(0);

    }
}
