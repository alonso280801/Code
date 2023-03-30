public class HamburguesaQueso extends Hamburguesas {

    public HamburguesaQueso() {
        super.id= 2;
        super.nombre = "Hamburguesa Queso";
        super.descriipcion=" Hamburguesa clasica con queso ";
        super.precio = 79.0;
        super.llevaQueso = true;
        super.vegetariano = false;
    }

    @Override
    void agregarProteina() {
        System.out.println("Cocinando carne y agregandola");
    }

    @Override
    void agregarQueso() {
        System.out.println("Agregando rebanada de queso");
    }

    
}
