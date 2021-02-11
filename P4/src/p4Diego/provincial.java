package POO4;

public class provincial extends llamada {
	private int franja;
	public provincial(int numeroOrigen, int numeroDestino, int duracion, int franja) {
		super(numeroOrigen, numeroDestino, duracion);
		this.franja=franja;
	}

        public provincial() {
            super();
            franja = (int)(Math.random()*3+1);
        }
        public provincial(int franja){
            super();
            this.franja = franja;
        }
	public int getFranja() {
		return franja;
	}
	public void setFranja(int franja) {
		this.franja = franja;
	}
        @Override
	public double calcularCoste() {
		double total;
		if(franja==1) {
			total=duracion*20;
		}else
			if(franja==2) {
				total=duracion*25;
			}else {
				total=duracion*30;
			}
		return total;
	}

    @Override
    public String toString() {
        return super.toString()+ "franja=" + franja + '}';
    }
	
}
