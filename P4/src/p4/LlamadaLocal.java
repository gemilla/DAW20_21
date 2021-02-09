package P4;

public class LlamadaLocal extends Llamada {

    public LlamadaLocal(int numOrigen, int numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);

    }

    @Override
    public double calcularCoste() {
        return duracion * 0.15;

    }

    public LlamadaLocal() {
        super();
    }
}
