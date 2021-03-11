
package javaapplication1;
public class Cala extends Playa{
    private boolean minusvalido;
    public Cala() {
        //super((int)(Math.random()*100),"playita",new Direccion("orilla",15345,"Murcia"),(Math.random()*20),Playa.generadorValoraciones(),true);
        super();
        minusvalido=true;
    }

    public Cala(int id, String nombre,Direccion direccion, double longitud, int []valoracion,boolean minusvalido) {
        super(id,nombre,direccion,longitud,valoracion);
        this.minusvalido = minusvalido;
    }
    
    
    public boolean isMinusvalido() {
        return minusvalido;
    }

    public void setMinusvalido(boolean minusvalido) {
        this.minusvalido = minusvalido;
    }

    
    @Override
    public double getPuntuacion() {
        double resultado = valoracionMedia();
        if(minusvalido)
            resultado+=1;
        return resultado;
    }

    @Override
    public String toString() {
       return super.toString()+" acceso a minusvalido="+minusvalido;
    }
    
    
}
