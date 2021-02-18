package granja;



public class Fecha {
	private int dia;
	private int mes;
	private int anyo;
	
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

        public Fecha() {
        	dia = (int)(Math.random()*30+1);
		mes = (int)(Math.random()*12+1);
		anyo = (int)(Math.random()*21+2000);
	}

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	@Override
	public String toString() {
                //String fechaFormateada = String.format(,);
		return dia+"/"+mes+"/"+anyo;
	}
	
	
}
