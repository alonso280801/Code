public abstract class Componente {
    protected String nombre;
    protected String descripcion;
    protected double precio;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return  nombre + ", " + descripcion + ", precio = " + precio ;
    }
}
