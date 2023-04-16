public class Revisador {
    public static void main(String[] args) {
        String texto = "Tres Anillos para los Reyes Elfos bajo el cielo. Siete para los Señores Enanos en palacios de piedra. Nueve para los Hombres Mortales condenados a morir. Uno para el Señor Oscuro, sobre el trono obscuro en la Tierra de Mordor donde se extienden las Sombras. Un Anillo para gobernarlos a todos. Un Anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas en la Tierra de Mordor donde se extienden las sombras.";

        String[] palabras = texto.split(" ");
        Procesador p = new Procesador();

        for (int i = 0; i < palabras.length; i++) {
            if (p.procesado1(palabras[i])) {
                System.out.println(palabras[i]);
            }
            if (p.procesado2(palabras[i])) {
                System.out.println(palabras[i]);
            }
            if (p.procesado3(palabras[i])) {
                System.out.println(palabras[i]);
            }
        }


        /*int inicio = 0;
        int fin = palabras.length - 1;

        boolean contiene1 = false;
        boolean contiene2 = false;
        boolean contiene3 = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            String palabraActual = palabras[medio];
            System.out.println(palabraActual);

            if (p.procesado1(palabraActual)) {
                System.out.println(palabraActual);
                contiene1 = true;
                fin = medio - 1;
            } else if (p.procesado2(palabraActual)) {
                System.out.println(palabraActual);
                contiene2 = true;
                fin = medio - 1;
            } else if (p.procesado3(palabraActual)) {
                System.out.println(palabraActual);
                contiene3 = true;
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
*/
        
    }
}
