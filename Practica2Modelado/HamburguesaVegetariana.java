public class HamburguesaVegetariana extends Hamburguesas{
    public HamburguesaVegetariana() {
        super.id= 3;
        super.nombre = "Hamburguesa Vegetariana";
        super.descriipcion=" Hamburguesa con falafe  y queso  vegano ";
        super.precio = 99.0;
        super.vegetariano = true;
    }

    @Override
    void agregarProteina() {
        System.out.println("Cocinando falafe y agregandola");
    }

    @Override
    void agregarQueso() {
        System.out.println("Agregando rebanada de queso vegano ");
    }

    @Override
    public String toString() {
        return  id + " " + nombre + "\n" + descriipcion + "\nPrecio=" + precio + " Es veggie" ;
    }
    
}
