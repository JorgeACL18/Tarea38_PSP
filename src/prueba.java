import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Scanner;


public class prueba {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            String texto = sc.nextLine().trim();
            md.update(texto.getBytes());

            byte[] resumen = md.digest();

            String hex = HexFormat.of().formatHex(resumen);
            System.out.println(hex);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}
