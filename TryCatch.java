/**TryCatch.java
 * Programa para refactorizar Ejercicio05_02_XX
 * @author GAD
 * @param String dado por el usuario;
 * @return Verifica su posible cambio a un int o float y da el resultado o error según corresponde;
 */
import java.util.Scanner;
public class TryCatch {
    public static int pedirNumeroConMensaje(Scanner sc, String mensaje, int min, int max, String mensajeError) {
        int numero = -1;
        boolean control;
        do {
            control = false;
            System.out.print(mensaje);
            String numeroString = sc.nextLine();
            try {
                numero = Integer.parseInt(numeroString);
                control = true;
            } catch (NumberFormatException e) {
                System.out.println(mensajeError);
                control = false;
            }
            if (control && (numero < min || numero > max)) {
                System.out.println(mensajeError);
                control = false;
            }
        } while (!control);
        return numero;
    } 
    public static float pedirFloatConMensaje(Scanner sc, String mensaje, float min, float max, String mensajeError) {
        float numeroFloat = 0.0f;
        boolean control;
        do {
            control = false;
            System.out.print(mensaje);
            String numeroString = sc.nextLine();
            try {
                numeroFloat = Float.parseFloat(numeroString);
                control = true;
            } catch (Exception e) {
                System.out.println(mensajeError);
                control = false;
            }
            if (control && (numeroFloat < min || numeroFloat > max)) {
                System.out.println(mensajeError);
                control = false;
            }
        } while (!control);
        return numeroFloat;
    }
}
