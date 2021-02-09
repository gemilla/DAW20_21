package P4;

public class Centralita {

    protected int numLlamadas;
    protected double costeTotal;

    public Centralita(int numLlamadas, double costeTotal) {
        super();
        this.numLlamadas = numLlamadas;
        this.costeTotal = costeTotal;
    }

    public Centralita() {
    }

    @Override
    public String toString() {
        return "Centralita [numLlamadas=" + numLlamadas + ", costeTotal=" + costeTotal + "]";
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }
    public void registrarLlamada(Llamada llamada){
        numLlamadas++;
        costeTotal+= llamada.calcularCoste();
        
    }
}
