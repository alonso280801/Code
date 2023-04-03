public class NaveEspacial {
    private SistemaPropulsion sistemaPropulsion;
    private Blindaje blindaje;
    private Cabina cabina;
    private Armas armas;
    public double precioTotal;

    public NaveEspacial(SistemaPropulsion sistemaPropulsion, Blindaje blindaje, Cabina cabina, Armas armas) {
        this.sistemaPropulsion = sistemaPropulsion;
        this.blindaje = blindaje;
        this.cabina = cabina;
        this.armas = armas;
        this.precioTotal = sistemaPropulsion.getPrecio() + blindaje.getPrecio() + cabina.getPrecio() +armas.getPrecio();
    }

    public void mostrarCaracteristicas() {
        System.out.println("+++++++++++++++++Características de la nave espacial:+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Sistema de propulsión: " + sistemaPropulsion.getNombre() + " - Descripción: " + sistemaPropulsion.getDescripcion());
        System.out.println("Blindaje: " + blindaje.getNombre() + " - Descripción: " + blindaje.getDescripcion());
        System.out.println("Cabina: " + cabina.getNombre() + " - Descripción: " + cabina.getDescripcion());
        System.out.println("Armas: " + armas.getNombre() + " - Descripción: " + armas.getDescripcion());
        System.out.println("Ataque: " + (sistemaPropulsion.getAtaque() + armas.getAtaque() + cabina.getDefensa() + armas.getDefensa()));
        System.out.println("Defensa: " + (blindaje.getDefensa() + cabina.getDefensa() + armas.getDefensa()));
        System.out.println("Velocidad: " + (sistemaPropulsion.getVelocidad()));
        System.out.println("Peso: " + (sistemaPropulsion.getPeso() + blindaje.getPeso() + cabina.getCapacidad() + armas.getPeso()));
        System.out.println("Precio total: " + precioTotal);
    }
}

