public class Armas extends Componente {
    private int ataque;
    private int defensa;
    private int peso;

    public Armas(String nombre, String descripcion, double precio, int ataque, int defensa, int peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ataque = ataque;
        this.defensa = defensa;
        this.peso = peso;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPeso() {
        return peso;
    }
}
