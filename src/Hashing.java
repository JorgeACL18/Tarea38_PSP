import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Scanner;

public class Hashing {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            System.out.println("Ingresa una contraseña:");
            String contra1 = sc.nextLine().trim();
            md.update(contra1.getBytes());
            byte[] variable1 = md.digest();
            String hex1 = HexFormat.of().formatHex(variable1);

            System.out.println("Contraseña guardada. Vuelva a iniciar sesión escribiendo su contraseña otra vez");
            String contra2 = sc.nextLine().trim();
            md.update(contra2.getBytes());
            byte[] variable2 = md.digest();
            String hex2 = HexFormat.of().formatHex(variable2);

            if (hex1.equals(hex2)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("ERROR: Acceso denegado");
            }

            sc.close();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
