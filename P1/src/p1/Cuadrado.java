
package p1;
public class Cuadrado {
    private Punto V1;
    private Punto V2;
    private Punto V3;
    private Punto V4;
    public Cuadrado(Punto V1, Punto V2, Punto V3, Punto V4){
        this.V1=V1;
        this.V2=V2;
        this.V3=V3;
        this.V4=V4;
    }
    public Cuadrado(){
        V1=new Punto();
        V2=new Punto(0,1);
        V3=new Punto(1,1);
        V4=new Punto(1,0);
    }

    public Punto getV1() {
        return V1;
    }

    public void setV1(Punto V1) {
        this.V1 = V1;
    }

    public Punto getV2() {
        return V2;
    }

    public void setV2(Punto V2) {
        this.V2 = V2;
    }

    public Punto getV3() {
        return V3;
    }

    public void setV3(Punto V3) {
        this.V3 = V3;
    }

    public Punto getV4() {
        return V4;
    }

    public void setV4(Punto V4) {
        this.V4 = V4;
    }
    
    public double calcularDistancia(Punto V, Punto V2){
        return V.calcularDistanciaDesde(V2);
    }
    public double calcularPerimetro(){
        return V1.calcularDistanciaDesde(V2)*4;
        
    }
    public boolean validarCuadrado(){
        return V1.calcularDistanciaDesde(V2)==V2.calcularDistanciaDesde(V3) && V3.calcularDistanciaDesde(V4)==V4.calcularDistanciaDesde(V1) && V4.calcularDistanciaDesde(V1)==V3.calcularDistanciaDesde(V2);
    }
    public double calcularArea(){
        return Math.pow(V1.calcularDistanciaDesde(V2), 2);
    }
    public String toString(){
        return "Vertice 1: "+V1.toString()+ "Vertice 2: "+V2.toString()+ "Vertice 3: "+V3.toString()+ "Vertice 4: "+V4.toString();
    }
    
}
