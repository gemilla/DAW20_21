
package p1Herencia;

import p1.*;

public class TrianguloEquilatero extends Figura {
    

    public TrianguloEquilatero(int lado) {
        super(lado);
    }

    public TrianguloEquilatero() {
        super();
    }

    
    @Override
    public double dameArea(){
        double s = damePerimetro()/2;//semiperímetro
        double area = Math.sqrt(s*Math.pow((s-linea),3));
        return area;
    }
    @Override
    public double damePerimetro(){
        return 3*linea;
    }
    @Override
    public String dameCaracteristica() {
        return "lado";
    }
    
}