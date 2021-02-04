
package p1;
public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public Cuadrado() {
        lado = 5;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    public double dameArea(){
        return lado*lado;
    }
    public double damePerimetro(){
        return 4*lado;
    }
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    public void mostrarInfo() {
        System.out.println(toString());
    }
    
    
}