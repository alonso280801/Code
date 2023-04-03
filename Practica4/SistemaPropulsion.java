public class SistemaPropulsion extends Componente {
    private int ataque;
    private int velocidad;
    private int peso;

    public SistemaPropulsion(String nombre, String descripcion, double precio, int ataque, int velocidad, int peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ataque = ataque;
        this.velocidad = velocidad;
        this.peso = peso;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getPeso() {
        return peso;
    }
}
