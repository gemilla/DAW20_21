package P4;

public class LlamadaProvincial extends Llamada {

    protected int franja;

    public LlamadaProvincial(int numOrigen, int numDestino, int duracion, int franja) {
        super(numOrigen, numDestino, duracion);
        this.franja = franja;
    }

    public LlamadaProvincial() {
        super();
        franja = (int)(Math.random()*3)+1;
    }

    @Override
    public double calcularCoste() {
        double coste = 0;
        if (franja == 1) {
            coste = duracion * 0.20;
        } else if (franja == 2) {
            coste = duracion * 0.25;
        } else if (franja == 3) {
            coste = duracion * 0.30;
        }
        return coste;
    }

    @Override
    public String toString() {
        return super.toString() + "franja=" + franja + '}';
    }

}
