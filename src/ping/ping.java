package ping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//Implemente un programa Java que lance subprocesos en el que realice comandos ping a IPs solicitadas por teclado al usuario
public class ping {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String ipLeida = "";
        ProcessBuilder pb = new ProcessBuilder("");
        Process p = null;
        try {
            do {
                System.out.println("Introduzca IP para PING:");
                ipLeida = sc.nextLine();
                if (!ipLeida.equals("fin")) {
                    p = pb.command("CMD", "/C", "PING", ipLeida).start();
                    BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

                    String line;
                    while ((line = br.readLine()) != null)
                        System.out.println(line);
                }
            } while (!ipLeida.equals("fin"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


