package ejercicio6;
//6. Partiendo del ejercicio anterior, realiza los cambios necesarios para que la cadena introducida
// por teclado se almacene en un fichero de texto, no mostrándolo en pantalla.
public class hijo {
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

