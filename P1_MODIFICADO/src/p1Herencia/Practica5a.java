package p1Herencia;

import p1.*;

public class Practica5a {//Tester
	public static void main(String[] args) {
            Cuadrado cuadrado1 = new Cuadrado();
            TrianguloEquilatero triangulo1 = new TrianguloEquilatero();
            System.out.println(triangulo1);
            System.out.println("--------------FIGURAS------------");
            Figura [] figuras = new Figura[3];
            figuras[0] = new Cuadrado();
            figuras[1] = new Circulo();
            figuras[2] = new TrianguloEquilatero();
            System.out.println("--------------------LISTA----------------");
            for (int i = 0; i < figuras.length; i++) {
                //figuras[i].mostrarInfo();
                System.out.println(figuras[i]);
                
            }
	}
}
