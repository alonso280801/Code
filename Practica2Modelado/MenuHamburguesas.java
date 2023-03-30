import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class MenuHamburguesas {
    
    Hashtable<String,Hamburguesas> menuHashtable = new Hashtable<String,Hamburguesas>();
    ArrayList<Hamburguesas> menuArrayList = new ArrayList<Hamburguesas>();
    Hamburguesas[] menuArray = new Hamburguesas [3];
    
    public MenuHamburguesas() {
        // Menú con Hashtable
        Hamburguesas HamburguesaSirloin = new HamburguesaSirloin(); 
        Hamburguesas HamburguesaPicaña = new HamburguesaPicania();
        Hamburguesas hamburguesaWagyu = new HamburguesaWagyu();
        
        menuHashtable.put("Hamburguesas Sirloin", HamburguesaSirloin);
        menuHashtable.put("Hamburguesas Picaña", HamburguesaPicaña);
        menuHashtable.put("Hamburguesa Wagyu", hamburguesaWagyu);
        
        // Menú con ArrayList
        Hamburguesas hamburguesaDoble = new HamburguesaDoble();
        Hamburguesas hambrguesaPollo = new HamburguesaPollo();
        Hamburguesas hamburguesaBBQ = new HamburguesaBBQ();

        
        menuArrayList.add(hamburguesaDoble);
        menuArrayList.add(hambrguesaPollo);
        menuArrayList.add(hamburguesaBBQ);

        
        // Menú con Array
        menuArray[0] = new HamburguesaVegetariana();
        menuArray[1] = new HamburguesaHawaiana();
        menuArray[2] = new HamburguesaQueso();
    }
    
    public void mostrarMenu() {
        // Mostrar menú con Hashtable
        Iterator<String> iteratorHashtable = menuHashtable.keySet().iterator();
        System.out.println("***********Menú Especial****************");
        System.out.println("Nuestras hamburguesas mas elaboradas con ingredientes de calidad premium  \n");
        while(iteratorHashtable.hasNext()) {
            String key = iteratorHashtable.next();
            Hamburguesas value = menuHashtable.get(key);
            System.out.println(value);
        }
        
        // Mostrar menú con ArrayList
        Iterator<Hamburguesas> iteratorArrayList = menuArrayList.iterator();
        System.out.println("\n ****************Menú del Dia**************** : \n");
        System.out.println("Nuestras favoritas para salir de la rutina pruebalas");
        while(iteratorArrayList.hasNext()) {
            Hamburguesas value = iteratorArrayList.next();
            System.out.println(value);
        }
        
        // Mostrar menú con Array
        System.out.println("\n**************Menú Tradicional********************* \n");
        System.out.println("Las favoritas de siempre ");
        for(int i=0; i<menuArray.length; i++) {
            System.out.println(menuArray[i]);
        }
    }
    
    public static void main(String[] args) {
        MenuHamburguesas menu = new MenuHamburguesas();
        menu.mostrarMenu();
        menu.mostrarMenu();
    }

}
