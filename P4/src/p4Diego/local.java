package POO4;

public class local extends llamada {

    public local(int numeroOrigen, int numeroDestino, int duracion) {
        super(numeroOrigen, numeroDestino, duracion);
    }

    public local() {
        super();
    }

    @Override
    public double calcularCoste() {
        double total = duracion * 15;
        return total;
    }

}
