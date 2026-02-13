/**Atajos.java / estaPermitido
 * Funciones varias para ejercicios varios.
 * @author GAD
 * @param lo que pida el programa;
 * @return lo que de la función.
 */
import java.util.ArrayList;
public class Atajos {
    public boolean palabraPermitida(String palabra, ArrayList permitidos){
        return (permitidos.contains(palabra));
    }    
}
