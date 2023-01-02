package mayusculas;
//scribe una clase Mayusculas que haga lo siguiente:
//Cree un proceso hijo.
//El proceso padre y el proceso hijo se comunicaran de forma bidireccional usando streams.
//El proceso padre leera el texto por la entrada estándar, lo tranformara todo a mayúsculas y lo imprimirá por su salida estándar.
//El padre imprimirá en pantalla lo que recibe del hijo a través del InputStream del mismo.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hijo {

    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        try {
            String lectura = null;
            while (!(lectura = br.readLine()).equals("*")) {
                System.out.println(lectura.toUpperCase());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

