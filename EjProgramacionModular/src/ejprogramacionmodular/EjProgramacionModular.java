/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejprogramacionmodular;

import java.util.Scanner;

/**
 *
 * @author gema
 */
public class EjProgramacionModular {

    /**
     * @param args the command line arguments
     */
    
    /**Método con nombre suma y que recibe dos argumentos de entrada:
     * @param operando1 tipo entero
     * @param operando2 tipo entero
     * @return la suma de ambos operandos, tipo entero
     */
    public static int suma(int operando1, int operando2){
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
    
    /**
     * Ventajas de la programación modular:
     * 1. Repartir el trabajo entre varios programadores
     * 2. Ahorrar líneas código
     * 3. Divide y vencerás
     * 4. Permite la depuración de errores más sencilla
     * 5. Permite la reutilización de código
     * @param args 
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenidos a mi calculadora: suma, resta, producto, división");
        //llamadas
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce operandos");
        int op1 = lector.nextInt();
        double op2 = lector.nextDouble();
        int resultado = suma(op1,(int)op2);
        System.out.println(resultado);
        resta(15,10);
        int resultado2 = producto();
        System.out.println(resultado2);
        division();
       
    }
    
}
