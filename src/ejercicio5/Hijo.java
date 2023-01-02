package ejercicio5;



//.Crea un programa Jva que visualice 5 veces la cadena que se le envia desde los argumentos de
    //    main.Si no se le envia ninguna cadena que muestre un mensaje indicándolo y que finalice el programa con System.exit().
   //     A continuación crea un segundo programa de Java que introduzca por teclado una cadena y
//     ejecute el programa anterior para visualizar 5 veces esa cadena.

public class Hijo {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Tienes que introducir  una cadena");
            System.exit(1);
        }
        for(int i=0;i<5;i++){
            System.out.println(i+1+" ." + args[0]);
        }

    }
}
