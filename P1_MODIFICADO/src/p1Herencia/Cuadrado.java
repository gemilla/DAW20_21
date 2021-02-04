
package p1Herencia;

import p1.*;

public class Cuadrado extends Figura {
    
    public Cuadrado(int lado) {
        super(lado);
    }

    public Cuadrado() {
        //super(8);//siempre funciona
        //super.setLinea(8);//si es privado y no quieres llamar al constructor
        linea=8;//si es protegido y no quieres llamar al constructor
    }

    public double dameArea(){
        return getLinea()*getLinea(); //siempre funciona
        //return linea*linea; //si es protegido
    }
    @Override
    public double damePerimetro(){
        return 4*linea;
    }

    @Override
    public String dameCaracteristica() {
        return "lado";
    }
    
    
    
}