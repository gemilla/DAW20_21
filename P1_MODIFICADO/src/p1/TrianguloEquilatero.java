
package p1;
public class TrianguloEquilatero {
    private int lado;

    public TrianguloEquilatero(int lado) {
        this.lado = lado;
    }

    public TrianguloEquilatero() {
        lado = 5;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public double dameArea(){
        double s = damePerimetro()/2;//semiperímetro
        double area = Math.sqrt(s*Math.pow((s-lado),3));
        return area;
    }
    public double damePerimetro(){
        return 3*lado;
    }

    

    
    
    public void mostrarInfo() {
        System.out.println(toString());
    }
    
    
}