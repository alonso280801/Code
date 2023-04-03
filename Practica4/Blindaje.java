public class Blindaje extends Componente {
    private int defensa;
    private int peso;

    public Blindaje(String nombre, String descripcion, double precio, int defensa, int peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.defensa = defensa;
        this.peso = peso;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPeso() {
        return peso;
    }
}
