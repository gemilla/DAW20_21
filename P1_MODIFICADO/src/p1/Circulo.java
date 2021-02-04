
package p1;
public class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
        radio = 5;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double dameArea(){
        return Math.PI*radio*radio;
    }
    public double damePerimetro(){
        return 2*Math.PI*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public void mostrarInfo() {
        System.out.println(toString());
    }
    
    
}