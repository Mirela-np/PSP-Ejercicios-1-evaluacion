package ejercicio1;


//crea un programa que reciba desde los argumentos del main un nombre y los visualice
// por pantalla exit 1 para una visualizacion correcta, -1 para una incorrecta

public class ej1Hijo {

    public static void main(String[]args){

        if(args.length!=1){
            System.out.println("Argumentos incorrectos");
            System.exit(-1);
        }
        System.out.printf("Nombre :%s %n:",args[0]);
        System.exit(1);
    }
}

