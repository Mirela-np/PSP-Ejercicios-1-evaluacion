package aleatorios;

// Cree un proceso hijo que esta encargado de generar números aleatorios.
// Para su creación puede utilizarse cualquier lenguaje de proramacion generando el ejecutable correspondiente
// .Este proceso hijo escribira en su salia estándar un numero aleatorio del 0 al 10 cada vez que reciba una petición por parte del padre.
//El proceso padre lee líneas de la entrada estándar y por cada línea que lea solicitara al hijo que le envie
// un numero aleatorio, lo leera y lo imprimirá en pantalla.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hijo {
    public static void main(String[] args) {
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);

        try{
            String linea=null;
            while((linea= br.readLine())!=null){
                System.out.println((int) (Math.random() * 11));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
