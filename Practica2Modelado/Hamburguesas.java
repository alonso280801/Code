public abstract class Hamburguesas{
    int id;
    String nombre;
    String descriipcion;
    double precio;
    boolean llevaQueso ;
    boolean vegetariano ;


    @Override
    public String toString() {
        return  id + " " + nombre + "\n" + descriipcion + "\nPrecio=" + precio ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescriipcion() {
        return descriipcion;
    }

    public void setDescriipcion(String descriipcion) {
        this.descriipcion = descriipcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isLlevaQueso() {
        return llevaQueso;
    }

    public void setLlevaQueso(boolean llevaQueso) {
        this.llevaQueso = llevaQueso;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    final void prepararHamburguesa(){
        agregarPan();
        agregaMayonesa();
        agregarMostaza();
        agregarProteina();
        if (clienteQuiereQueso()) {
            agregarQueso();
        }
    
        agregarVegetales();
    }

    private void agregarPan() {
        System.out.println("Cortamos el Pan ");
    }

    private void agregarVegetales() {
        System.out.println("Poniendo los vegetales ");
    }

    private void agregarMostaza() {
        System.out.println("Untando mostaza");
    }

    private void agregaMayonesa() {
        System.out.println("Untando Mayonesa");

    }

    abstract void agregarProteina();

    abstract void agregarQueso();

   boolean clienteQuiereQueso (){
     return true;
   }

}