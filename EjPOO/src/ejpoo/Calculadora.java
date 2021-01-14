/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo;

import java.util.Scanner;

/**
 *
 * @author gema
 */
public class Calculadora {
    //ATRIBUTOS
    private String tipo; //Estándar, Científica, Programador
    protected double precio;
    protected boolean conTapa;
    
    //CONSTRUCTORES: crear el objeto y darles un valor inicial
    public Calculadora(){
        tipo = "Estándar";
        precio = 10;
        conTapa = false; //no haría falta, porque conTapa se inicializa por defecto a false
    }
    public Calculadora(String tipo, double precio, boolean tapa){
        this.tipo = tipo;
        this.precio = precio;
        conTapa = tapa;
    }
    
    //GETTER acceder a los atributos desde fuera
    public String getTipo(){
        return tipo;
    }
    public double getPrecio(){
        return precio;
    }
    public boolean getConTapa(){
        return conTapa;
    }
    
//SETTER acceder a los atributos desde fuera y modificarlos
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setConTapa(boolean conTapa){
        this.conTapa = conTapa;
    }
    
    //MÉTODOS
    /**Método con nombre suma y que recibe dos argumentos de entrada:
     * @param operando1 tipo entero
     * @param operando2 tipo entero
     * @return la suma de ambos operandos, tipo entero
     */
    public int suma(int operando1, int operando2){
        //return (operando1+operando2);
        int resultado = operando1+operando2;
        return resultado;
    }
    
    /**Método con nombre resta y que recibe dos argumentos de entrada e imprime el resultado, no devuelve nada.     * 
     * @param operando1
     * @param operando2 
     */
    public static void resta(int operando1, int operando2){
        int resultado = operando1-operando2;
        System.out.println("El resultado de la resta es "+ resultado);
    }
    /**Método con nombre producto, se encarga de la entrada de los operandos y de multiplicarlos y devuelve el producto.
     *@return devuelve un entero con el resultado de la multiplicación 
     */
    public static int producto (){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce operandos");
        int operando1 = lector.nextInt();
        int operando2 = lector.nextInt();
        return operando1*operando2;
    }
    
    public static void division (){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce operandos");
        int operando1 = lector.nextInt();
        int operando2 = lector.nextInt();
        System.out.println(operando1/operando2);
    }
    
    public void mostrarDatos(){
            System.out.println(tipo+ " "+conTapa+ " "+precio);
    }
}
