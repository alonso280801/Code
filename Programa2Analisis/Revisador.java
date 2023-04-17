import java.util.Arrays;

public class Revisador {
    public static void main(String[] args) {
        String texto = "Tres Anillos para los Reyes Elfos bajo el cielo. Siete para los Señores Enanos en palacios de piedra. Nueve para los Hombres Mortales condenados a morir. Uno para el Señor Oscuro, sobre el trono obscuro en la Tierra de Mordor donde se extienden las Sombras. Un Anillo para gobernarlos a todos. Un Anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas en la Tierra de Mordor donde se extienden las sombras.";
        Procesador p = new Procesador();
        System.out.println(p.procesado2(texto));


        String[] palabras = texto.split(" ");
        
        //Arrays.sort(palabras); // Ordena el arreglo de palabras

        //Busca el primer error con el metodo procesado1
        int inicio = 0;
        int fin = palabras.length - 1;
    
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
    
            if (p.procesado1(palabras[medio])) {
                System.out.println("medio "+ palabras[medio]);
                break;
                
            }
            else if (p.procesado1(palabras[inicio])) {
                System.out.println("inicio "+palabras[inicio]);
                break;
            }
            else if (p.procesado1(palabras[fin])) {
                System.out.println("fin "+palabras[fin]);
                break;
            }
            //derecha
            else {
                inicio = medio + 1;
            }
        }

         //Busca el segundo error con el metodo procesado1
         inicio = 0;
         fin = palabras.length - 1;
     
         while (inicio <= fin) {
             int medio = (inicio + fin) / 2;
     
             if (p.procesado3(palabras[medio])) {
                 System.out.println("medio "+ palabras[medio]);
                 break;
                 
             }
             else if (p.procesado3(palabras[inicio])) {
                 System.out.println("inicio "+palabras[inicio]);
                 break;
             }
             else if (p.procesado3(palabras[fin])) {
                 System.out.println("fin "+palabras[fin]);
                 break;
             }
             //izquierda
             else {
                fin = medio - 1;
             }
         }
    
        
    }
}
