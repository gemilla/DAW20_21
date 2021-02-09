package P4;

public abstract class Llamada {

    protected int numOrigen;
    protected int numDestino;
    protected int duracion;
    //protected double coste;

    public Llamada() {
        numOrigen = (int)(Math.random()*10000+1);
        numDestino = (int)(Math.random()*10000+1);
        duracion = (int)(Math.random()*3600+1);
    }
    
    public Llamada(int numOrigen, int numDestino, int duracion) {
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
    }

    public abstract double calcularCoste();

    public int getNumOrigen() {
        return numOrigen;
    }

    public int getNumDestino() {
        return numDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" + "numOrigen=" + numOrigen + ", numDestino=" + numDestino + ", duracion=" + duracion + '}';
    }

}
