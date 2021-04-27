/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author GEMA
 */
public class JefeProyecto extends Trabajador {
    protected int personas;

    public JefeProyecto() {
        super();
        this.personas= 5;
        sueldoBase= Math.random()*501+1500;
    }

    public JefeProyecto(int personas, String nombre, String departamento, Fecha fecha, double sueldoBase) {
        super(nombre, departamento, fecha, sueldoBase);
        this.personas= personas;
    }
    
    public JefeProyecto(int personas, String NIF, String nombre, String departamento, Fecha fecha, double sueldoBase) {
        super(nombre, NIF, departamento, fecha, sueldoBase);
        this.personas= personas;
    }
    
    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }
    @Override
    public double calcularSalario() {
        return sueldoBase*(1+personas*0.01);
    }

    @Override
    public String toString() {
        return super.toString()+"personas=" + personas + '}';
    }
    @Override
    public String toStringFichero(){
        return super.toStringFichero()+";"+this.personas;
    }
}
