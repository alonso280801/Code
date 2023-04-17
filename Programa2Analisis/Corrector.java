import java.util.ArrayList;
import java.util.Arrays;


public class Corrector {

    public static void main(String[] args) {
        String cadena = "Tres Anillos para los Reyes Elfos bajo el cielo. Siete para los Señores Enanos en palacios de piedra. Nueve para los Hombres Mortales condenados a morir. Uno para el Señor Oscuro, sobre el trono obscuro en la Tierra de Mordor donde se extienden las Sombras. Un Anillo para gobernarlos a todos. Un Anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas en la Tierra de Mordor donde se extienden las sombras.";
        boolean encontrado = false;
        int inicio = 0;
        int fin = cadena.length() - 1;
        Procesador p = new Procesador();

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            System.out.println("Dividiendo arreglo ala mitad para hacer busqueda binaria");
            boolean ladoIzq = p.procesado1(cadena.substring(inicio, medio));

            if (ladoIzq) {
                encontrado = true;
               System.out.println("La palabra esta contenida en la mitad izquierda: " + cadena.substring(inicio, medio));
                //agregar un filtro que sepa que solo se contiene una palabra para termianr la bsuqueda
                if (esUnicaPalabra(cadena.substring(inicio, medio))) {
                    System.out.println(cadena.substring(inicio, medio));
                    encontrado = true;
                    break;
                }
                fin = medio - 1;
                
            } else {
                boolean ladoDerecho = p.procesado1(cadena.substring(medio + 1, fin + 1));

                if (ladoDerecho) {
                    
                    System.out.println("La palabra esta contenida  en la mitad derecha: " + cadena.substring(medio + 1, fin + 1));
                    //agregar un filtro que sepa que solo se contiene una palabra para termianr la bsuqueda
                    if (esUnicaPalabra(cadena.substring(medio + 1, fin + 1))) {
                        System.out.println(cadena.substring(medio + 1, fin + 1));
                        encontrado = true;
                        break;
                    }
                    inicio = medio + 1;
                    
                } else if (p.procesado1(cadena.substring(medio + 1)) ) {
                    fin = medio - 1;
                } else {
                    inicio = medio + 1;
                }
            }
        }

        if (!encontrado) {
            System.out.println("La palabra no se encontró en la cadena.");
        }
    }

    //Metodo auxiliar
    public static boolean esUnicaPalabra(String str) {
        // Verificar si la cadena es null o vacia
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        // Remover cualquier espacio en blanco al principio o al final de la cadena
        str = str.trim();
        
        // Verificar si la cadena tiene algun espacio en blanco
        if (str.indexOf(' ') != -1) {
            return false;
        }
        
        return true;
    }
}


