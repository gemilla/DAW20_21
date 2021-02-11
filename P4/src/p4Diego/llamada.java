package POO4;

public abstract class llamada {

    private int numeroOrigen;
    private int numeroDestino;
    protected int duracion;

    public llamada(int numeroOrigen, int numeroDestino, int duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
    }

    public llamada() {
        numeroOrigen = (int) (Math.random() * 1000000);
        numeroDestino = (int) (Math.random() * 1000000);
        duracion = (int) (Math.random() * 3600);;
    }

    public int getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(int numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public int getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(int numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public abstract double calcularCoste();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino + ", duracion=" + duracion + "]";
    }

}
