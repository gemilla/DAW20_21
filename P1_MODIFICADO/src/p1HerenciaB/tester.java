package p1HerenciaB;

import java.util.Scanner;

public class tester {
    public static Cuadrado dameCuadrado(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce el lado");
        int x= lector.nextInt();
        Cuadrado c = new Cuadrado(x); 
        return c;
        //return new Cuadrado();
    }
    //método 
    public static Figura dameFigura(){
        Figura figura =null;
        //if ..else 
        
        return figura;
    }
    public static void main(String[] args) {
        TrianguloEquilatero t = new TrianguloEquilatero();
        t.mostrarInfo();
        Circulo c = new Circulo();
        System.out.println(c);
        Cuadrado cu = new Cuadrado();
        cu.mostrarInfo();
        System.out.println(cu.dimension);
        c.setDimension(5);
        System.out.println(c.getDimension());
        double area = c.calcularArea();

        Figura figuras[] = new Figura[12];
        for (int i = 0; i < figuras.length; i++) {
            if (i % 2 == 0) {
                figuras[i] = new TrianguloEquilatero(i);
            } else if (i < 6) {
                figuras[i] = new Circulo((int)(Math.random()*10));
            } else {
                figuras[i] = dameCuadrado();
            }

        }
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i]);
            System.out.println(figuras[i]);
            
        }

    }
}
