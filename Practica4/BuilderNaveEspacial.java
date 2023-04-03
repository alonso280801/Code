public class BuilderNaveEspacial {
    private SistemaPropulsion sistemaPropulsion;
    private Blindaje blindaje;
    private Cabina cabina;
    private Armas armas;

    public BuilderNaveEspacial sistemaPropulsion(SistemaPropulsion sistemaPropulsion) {
        this.sistemaPropulsion = sistemaPropulsion;
        return this;
    }

    public BuilderNaveEspacial blindaje(Blindaje blindaje) {
        this.blindaje = blindaje;
        return this;
    }

    public BuilderNaveEspacial cabina(Cabina cabina) {
        this.cabina = cabina;
        return this;
    }

    public BuilderNaveEspacial armas(Armas armas) {
        this.armas = armas;
        return this;
    }

    public NaveEspacial construirNave() {
        return new NaveEspacial(sistemaPropulsion, blindaje, cabina, armas);
    }
}

