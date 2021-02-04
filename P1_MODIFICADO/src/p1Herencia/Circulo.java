
package p1Herencia;

import p1.*;

public class Circulo extends Figura{
   
    public Circulo(int radio) {
        super(radio);
    }

    public Circulo() {
        super(2); //si te gusta el del padre, simplemente super() y creará un circulo de radio 5
    }

    @Override
    public double dameArea(){
        return Math.PI*linea*linea;
    }
    @Override
    public double damePerimetro(){
        return 2*Math.PI*linea;
    }

    @Override
    public String dameCaracteristica() {
        return "radio";
    }

    
    
}