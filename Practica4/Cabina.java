public class Cabina extends Componente {
    private int capacidad;
    private int defensa;

    public Cabina(String nombre, String descripcion, double precio, int capacidad, int defensa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.capacidad = capacidad;
        this.defensa = defensa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getDefensa() {
        return defensa;
    }
}

