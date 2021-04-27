/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author GEMA
 */
public class Programador extends Trabajador{
    protected boolean experienciaPOO;
    protected StringBuilder lenguajes;

    public Programador() {
        super();
        experienciaPOO = true;
        lenguajes = new StringBuilder("Java:C##");
        sueldoBase= Math.random()*501+1000;
    }

    public Programador(boolean experienciaPOO, StringBuilder lenguajes, String nombre, String departamento, Fecha fecha, double sueldoBase) {
        super(nombre, departamento, fecha, sueldoBase);
        this.experienciaPOO = experienciaPOO;
        this.lenguajes = lenguajes;
    }
    
    public Programador(boolean experienciaPOO, String NIF, StringBuilder lenguajes, String nombre, String departamento, Fecha fecha, double sueldoBase) {
        super(nombre, NIF,departamento, fecha, sueldoBase);
        this.experienciaPOO = experienciaPOO;
        this.lenguajes = lenguajes;
    }
    
    public String mostrarExperiencia(){
        //return (experienciaPOO) ? "SI" : "NO";
        String cadena="NO";
        if (experienciaPOO)
            cadena="SI";
        return cadena;
    }
    
    @Override
    public double calcularSalario() {
        //return (experienciaPOO == true) ? sueldoBase + (sueldoBase * 0.20) : sueldoBase;
        double salario = sueldoBase;
        if (experienciaPOO == true)
            salario+=sueldoBase * 0.20;
        return salario;
    }
   
    @Override
    public String toString() {
        return super.toString()+"Experiencia en POO:"+ mostrarExperiencia()+ lenguajes.toString();
    }
    
    
    @Override
    public String toStringFichero(){
        return super.toStringFichero()+";"+experienciaPOO+";"+lenguajes.toString();
    }
    
}
