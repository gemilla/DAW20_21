package POO4;

public class centralita {
	private int numeroLlamadas;
	private double costeTotal;
	public centralita(int numeroLlamadas, double costeTotal) {
		this.numeroLlamadas=numeroLlamadas;
		this.costeTotal=costeTotal;
	}

        public centralita() {
       }
        
	@Override
	public String toString() {
		return "centralita [numeroLlamadas=" + numeroLlamadas + ", costeTotal=" + costeTotal + "]";
	}
	public void registrarLlamadas(llamada llamada) {
		numeroLlamadas++;
                costeTotal = costeTotal + llamada.calcularCoste();
        }
	
}
