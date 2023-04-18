import java.util.ArrayList;
import java.util.Arrays;


public class Corrector {

    public static void main(String[] args) {
        String cadena = "Tres Anillos para los Reyes Elfos bajo el cielo. Siete para los Señores Enanos en palacios de piedra. Nueve para los Hombres Mortales condenados a morir. Uno para el Señor Oscuro, sobre el trono obscuro en la Tierra de Mordor donde se extienden las Sombras. Un Anillo para gobernarlos a todos. Un Anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas en la Tierra de Mordor donde se extienden las sombras.";
        boolean encontrado = false;
        int inicio = 0;
        int fin = cadena.length() - 1;
        Procesador p = new Procesador();
        String primerError = null;

        System.out.println("#################### Buscando primer error ###########################");
        while (inicio <= fin) {
            //int medio = (inicio + fin) / 2;
            System.out.println("Dividiendo arreglo ala mitad para hacer busqueda binaria");
            boolean ladoIzq = p.procesado1(mitadIzquierda(cadena));
            boolean ladoDerecho = p.procesado1(mitadDerecha(cadena));


            if (ladoIzq) {
                encontrado = true;
               System.out.println("La palabra esta contenida en la mitad izquierda: " + mitadIzquierda(cadena));
                //agregar un filtro que sepa que solo se contiene una palabra para termianr la bsuqueda
                if (esUnicaPalabra(mitadIzquierda(cadena))) {
                    System.out.println(mitadIzquierda(cadena));
                     primerError = mitadIzquierda(cadena);
                    encontrado = true;
                    break;
                }
                cadena= mitadIzquierda(cadena);
                
            } else if (ladoDerecho) {
                    
                    System.out.println("La palabra esta contenida  en la mitad derecha: " + mitadDerecha(cadena));
                    //agregar un filtro que sepa que solo se contiene una palabra para termianr la bsuqueda
                    if (esUnicaPalabra(mitadDerecha(cadena))) {
                        System.out.println(mitadDerecha(cadena));
                         primerError = mitadDerecha(cadena);
                        encontrado = true;
                        break;
                    }
                    cadena = mitadDerecha(cadena);
                    
                
                
                
            }else {
                System.out.println("No se encuentra la palabra");
                break; 
        }


        if (!encontrado) {
            System.out.println("La palabra no se encontró en la cadena.");
        }
    }
    
    //Busca el segundo error con busqueda binaria
     cadena = "Tres Anillos para los Reyes Elfos bajo el cielo. Siete para los Señores Enanos en palacios de piedra. Nueve para los Hombres Mortales condenados a morir. Uno para el Señor Oscuro, sobre el trono obscuro en la Tierra de Mordor donde se extienden las Sombras. Un Anillo para gobernarlos a todos. Un Anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas en la Tierra de Mordor donde se extienden las sombras.";
         encontrado = false;
         inicio = 0;
         fin = cadena.length() - 1;
         String segundoError  = null;
         System.out.println("#################### Buscando segundo error ###########################");
        while (inicio <= fin) {
            //int medio = (inicio + fin) / 2;
            System.out.println("Dividiendo arreglo ala mitad para hacer busqueda binaria");
            boolean ladoIzq = p.procesado2(mitadIzquierda(cadena));
            boolean ladoDerecho = p.procesado2(mitadDerecha(cadena));


            if (ladoIzq) {
                encontrado = true;
               System.out.println("La palabra esta contenida en la mitad izquierda: " + mitadIzquierda(cadena));
                //agregar un filtro que sepa que solo se contiene una palabra para termianr la bsuqueda
                if (esUnicaPalabra(mitadIzquierda(cadena))) {
                    System.out.println(mitadIzquierda(cadena));
                     segundoError = mitadIzquierda(cadena);
                    encontrado = true;
                    break;
                }
                cadena= mitadIzquierda(cadena);
                
            } else if (ladoDerecho) {
                    
                    System.out.println("La palabra esta contenida  en la mitad derecha: " + mitadDerecha(cadena));
                    //agregar un filtro que sepa que solo se contiene una palabra para termianr la bsuqueda
                    if (esUnicaPalabra(mitadDerecha(cadena))) {
                        System.out.println(mitadDerecha(cadena));
                         segundoError = mitadDerecha(cadena);
                        encontrado = true;
                        break;
                    }
                    cadena = mitadDerecha(cadena);
                    
                
                
                
            }else {
                System.out.println("No se encuentra la palabra");
                break; 
        }


        if (!encontrado) {
            System.out.println("La palabra no se encontró en la cadena.");
        }
    }

    //Busca el tercer error con busqueda binaria
    cadena = "Tres Anillos para los Reyes Elfos bajo el cielo. Siete para los Señores Enanos en palacios de piedra. Nueve para los Hombres Mortales condenados a morir. Uno para el Señor Oscuro, sobre el trono obscuro en la Tierra de Mordor donde se extienden las Sombras. Un Anillo para gobernarlos a todos. Un Anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas en la Tierra de Mordor donde se extienden las sombras.";
    encontrado = false;
    inicio = 0;
    fin = cadena.length() - 1;
    String tercerError = null;
    System.out.println("#################### Buscando tercer error ###########################");
   while (inicio <= fin) {
       //int medio = (inicio + fin) / 2;
       System.out.println("Dividiendo arreglo ala mitad para hacer busqueda binaria");
       boolean ladoIzq = p.procesado3(mitadIzquierda(cadena));
       boolean ladoDerecho = p.procesado3(mitadDerecha(cadena));


       if (ladoIzq) {
           encontrado = true;
          System.out.println("La palabra esta contenida en la mitad izquierda: " + mitadIzquierda(cadena));
           //agregar un filtro que sepa que solo se contiene una palabra para termianr la bsuqueda
           if (esUnicaPalabra(mitadIzquierda(cadena))) {
               System.out.println(mitadIzquierda(cadena));
                tercerError = mitadIzquierda(cadena);
               encontrado = true;
               break;
           }
           cadena= mitadIzquierda(cadena);
           
       } else if (ladoDerecho) {
               
               System.out.println("La palabra esta contenida  en la mitad derecha: " + mitadDerecha(cadena));
               //agregar un filtro que sepa que solo se contiene una palabra para termianr la bsuqueda
               if (esUnicaPalabra(mitadDerecha(cadena))) {
                   System.out.println(mitadDerecha(cadena));
                    tercerError = mitadDerecha(cadena);
                   encontrado = true;
                   break;
               }
               cadena = mitadDerecha(cadena);
               
           
           
           
       }else {
           System.out.println("No se encuentra la palabra");
           break; 
   }


   
  }
  if (!encontrado) {
    System.out.println("La palabra no se encontró en la cadena.");
}
    System.out.println("Los errores son los siguientes :");
    System.out.println("1.-"+primerError);
    System.out.println("2.-"+segundoError);
    System.out.println("3.-"+tercerError);


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

    public static String mitadIzquierda(String str) {
        String[] palabras = str.split("\\s+");
        int mitad = palabras.length / 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mitad; i++) {
            sb.append(palabras[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static String mitadDerecha(String str) {
        String[] palabras = str.split("\\s+");
        int mitad = palabras.length / 2;
        StringBuilder sb = new StringBuilder();
        for (int i = mitad; i < palabras.length; i++) {
            sb.append(palabras[i]).append(" ");
        }
        return sb.toString().trim();
    }



}