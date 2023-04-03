import java.util.ArrayList;
import java.util.Scanner;

public class EnsambladoraDeNaves {
    public static void main(String[] args) {
        // Definimos los componentes disponibles
        SistemaPropulsion[] opcionesPropulsion = {
            new SistemaPropulsion("Viaje intercontinental", "Muy rápido y eficiente.", 10,10,10,10),
            new SistemaPropulsion("Viaje interplanetario", "Velocidad media y eficiencia moderada.", 75,10,10,10),
            new SistemaPropulsion("Viaje intergaláctico", "Velocidad luz y eficiencia ilimitada.", 200,10,10,10)
        };
        Blindaje[] opcionesBlindaje = {
            new Blindaje("Simple", "Protege contra golpes ligeros.", 25,2,2),
            new Blindaje("Reforzado", "Protege contra golpes moderados.", 50,4,3),
            new Blindaje("Fortaleza", "Protege contra golpes severos.", 100,8,5)
        };
        Cabina[] opcionesCabina = {
            new Cabina("1 piloto", "Cómoda para un solo piloto.", 15,5,7),
            new Cabina("Tripulación pequeña", "Permite llevar a un pequeño grupo de tripulantes.", 50,10,9),
            new Cabina("Ejército", "Capacidad para transportar a una gran cantidad de soldados.", 200,10,11)
        };
        Armas[] opcionesArmas = {
            new Armas("Láser simple", "Arma de ataque efectiva a corto alcance.", 30,3,7,1),
            new Armas("Misiles de plasma", "Arma de ataque a media y larga distancia.", 75,6,10,4),
            new Armas("Láser destructor de planetas", "Arma de ataque extrema, capaz de destruir planetas.", 200,10,100,50)
        };

        // Definimos las naves predefinidas
        NaveEspacial naveIndividual = new NaveEspacial(
                opcionesPropulsion[0],
                opcionesBlindaje[1],
                opcionesCabina[0],
                opcionesArmas[0]
                );
        NaveEspacial naveTransporte = new NaveEspacial(
                opcionesPropulsion[1],
                opcionesBlindaje[2],
                opcionesCabina[1],
                opcionesArmas[1]
        );
        NaveEspacial baseEspacial = new NaveEspacial(
                opcionesPropulsion[2],
                opcionesBlindaje[2],
                opcionesCabina[2],
                opcionesArmas[2]
                );






        
        // Pedimos el presupuesto del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de armado de naves espaciales. ¿Cuál es tu presupuesto?");
        boolean leAlcanza = false;
        NaveEspacial naveElegida = null; 
        int presupuesto = sc.nextInt();
        while (leAlcanza==false) {
        System.out.println("Elige una opcion");
        System.out.println("1.-Ver catalogo de naves");
        System.out.println("2.-Crea tu propio nave pieza por pieza");
        System.out.println("3.-Salir");    
        int opc = sc.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Que nave te gustaria comprar?");
                System.out.println("1.-Nave individual de combate.  Precio : " + naveIndividual.precioTotal);
                System.out.println("2.-Nave militar de transporte. Precio : " + naveTransporte.precioTotal);
                System.out.println("3.-Base espacial de guerra.  Precio : " + baseEspacial.precioTotal);
                int tip = sc.nextInt();
                switch (tip) {
                    case 1: {
                        naveElegida = naveIndividual;
                        if(naveElegida.precioTotal <= presupuesto){leAlcanza= true;}else{
                        System.out.println("No te alcanza tu presupuesto elige una opcion :");naveElegida= null; }
                        break;
                        
                    }
                    case 2: {
                        
                        naveElegida = naveTransporte;
                        if(naveElegida.precioTotal <= presupuesto){leAlcanza= true;}else{
                            System.out.println("No te alcanza tu presupuesto elige una opcion :");naveElegida= null; }
                        break;
                    }
                    case 3: {
                        
                        naveElegida = baseEspacial;
                        if(naveElegida.precioTotal <= presupuesto){leAlcanza= true;}else{
                            System.out.println("No te alcanza tu presupuesto elige una opcion :");naveElegida= null; }
                        break;
                    }
                    default:
                        return;
                }
                break;
            case 2:
                BuilderNaveEspacial builder = new BuilderNaveEspacial();
                System.out.println("Por favor, elige los componentes para tu nave:");
                // Agregar código aquí para el segundo caso

        // Componente de propulsión
        System.out.println("Sistemas de propulsión disponibles:");
            for (int i = 0; i < opcionesPropulsion.length; i++) {
                System.out.printf("%d. %s\n", i + 1, opcionesPropulsion[i]); }
        System.out.print("Introduce el número del sistema de propulsión deseado: ");
        int prop = sc.nextInt();
                builder.sistemaPropulsion(opcionesPropulsion[prop-1]);
      
        // Componente de blindaje
        System.out.println("Blindajes disponibles:");
            for (int i = 0; i < opcionesBlindaje.length; i++) {
                System.out.printf("%d. %s\n", i + 1, opcionesBlindaje[i]); }
        System.out.print("Introduce el número del blindaje deseado: ");
        int blinda = sc.nextInt();
                builder.blindaje(opcionesBlindaje[blinda-1]);

        // Componente de Cabina
        System.out.println("Cabinas disponibles:");
            for (int i = 0; i < opcionesCabina.length; i++) {
                System.out.printf("%d. %s\n", i + 1, opcionesCabina[i]); }
        System.out.print("Introduce el número del Cabina deseado: ");
        int cabin = sc.nextInt();
                builder.cabina(opcionesCabina[cabin-1]);    
        // Componente de Armas
        System.out.println("Armas disponibles:");
            for (int i = 0; i < opcionesArmas.length; i++) {
                System.out.printf("%d. %s\n", i + 1, opcionesArmas[i]); }
        System.out.print("Introduce el número del tipo de arma deseado: ");
        int arm = sc.nextInt();
                builder.armas(opcionesArmas[arm-1]);        
                
        naveElegida =  builder.construirNave(); 
        if(naveElegida.precioTotal <= presupuesto){leAlcanza= true; }else{
            System.out.println("No te alcanza tu presupuesto elige una opcion  :");naveElegida= null;}       
        
            break;
        case 3 : leAlcanza = true; break;

        default:
        System.out.println("Elige una opcion valida");
        return;
}
        }
        if(naveElegida != null ){
        naveElegida.mostrarCaracteristicas();
        System.out.println("$$$$$$$$$$$$$ Pasa a caja para pagar y recoger tu nave  $$$$$$$$$$$$$");}
        

       

        
        }
    }


