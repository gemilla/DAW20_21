/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author gema
 */
public class Validaciones {
    public static  boolean validarTriangulo(Punto p1, Punto p2, Punto p3){
            boolean respuesta = false;
            double lado1 = p1.calcularDistanciaDesde(p2);
            double lado2 = p2.calcularDistanciaDesde(p3);
            double lado3 = p3.calcularDistanciaDesde(p1);
            if ((lado1<lado2+lado3)&&(lado2<lado1+lado3)&&(lado3<lado1+lado2))
                respuesta = true;
            return respuesta;
            //System.out.println(respuesta);
        }
    public static  boolean validarCuadrado(Punto v1, Punto v2, Punto v3, Punto v4){
            return v1.calcularDistanciaDesde(v2)==v2.calcularDistanciaDesde(v3) && v3.calcularDistanciaDesde(v4)==v4.calcularDistanciaDesde(v1) && v4.calcularDistanciaDesde(v1)==v3.calcularDistanciaDesde(v2);
    }
    public static  boolean validarCuadrado2(Punto v1, Punto v2, Punto v3, Punto v4){
        boolean respuesta=false;
        if (v1.calcularDistanciaDesde(v2)==v2.calcularDistanciaDesde(v3) && v3.calcularDistanciaDesde(v4)==v4.calcularDistanciaDesde(v1) && v4.calcularDistanciaDesde(v1)==v3.calcularDistanciaDesde(v2))
            respuesta = true;
        return respuesta;
    }
    public static  boolean validarCuadrado3(Punto v1, Punto v2, Punto v3, Punto v4){
        boolean respuesta = false;
        double lado1 = v1.calcularDistanciaDesde(v2);
        double lado2 = v2.calcularDistanciaDesde(v3);
        double lado3 = v3.calcularDistanciaDesde(v4);
        double lado4 = v4.calcularDistanciaDesde(v1);
        if (lado1==lado2 && lado2==lado3 && lado3==lado4)
            respuesta = true;
        return respuesta;
    }
    public static  boolean validarCuadrado4(Punto v1, Punto v2, Punto v3, Punto v4){
       if (v1.calcularDistanciaDesde(v2)==v2.calcularDistanciaDesde(v3) && v3.calcularDistanciaDesde(v4)==v4.calcularDistanciaDesde(v1) && v4.calcularDistanciaDesde(v1)==v3.calcularDistanciaDesde(v2))
           return true;
       else 
           return false;
      }
    
}