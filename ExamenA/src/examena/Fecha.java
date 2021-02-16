package examenA;

public class Fecha {
	private int dia;
	private int mes;
	private int anyo;
	public Fecha(int dia, int mes, int anyo) {
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}
	public Fecha() {
		dia=(int)(Math.random()*30+1);//como queráis
		mes=02;
		anyo=2020;
	}
        public Fecha (String fecha){
            //  Dos métodos 
            /*Opción 1
            String diaString = fecha.substring(0, 2);
            dia = Integer.parseInt(diaString);
            */
            /*Opción 2
            String cadena[] = fecha.split("/");
            //mirar el tester para terminar de hacerlo
            */
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
                //String cadena = String.format(format, args); //se trabaja como con el printf
		return "fecha: "+dia+"/"+mes+"/"+anyo;
	}
	
}
