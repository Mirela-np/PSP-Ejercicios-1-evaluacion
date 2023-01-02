package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//1.6 Escribe un programa Java que lea dos números desde la entrada estándar y visualice su suma.
// Controlar que lo introducido por teclado sean dos números.
// Haz otro programa Java para ejecutar el anterior. Realiza el ejercicio 7.

public class ej2Hijo {

    public static void main(String[] args) throws IOException {
        try (
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);) {

            System.out.println("introduzca un numero ");
            int num1 = Integer.parseInt(br.readLine());

            System.out.println("introduzca un numero ");
            int num2 = Integer.parseInt(br.readLine());

            int suma = num1 + num2;
            System.out.print("la suma es " +suma);
            is.close();
        } catch (NumberFormatException nr) {
            nr.getStackTrace();
        }
    }
}
