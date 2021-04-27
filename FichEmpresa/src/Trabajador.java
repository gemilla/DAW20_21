/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author GEMA
 */
public abstract class Trabajador implements Serializable{
    protected String nombre;
    protected String NIF;
    protected static int contNIF;
    protected String departamento;
    protected Fecha fecha;
    protected double sueldoBase;

    public Trabajador() {
        Trabajador.contNIF++;
        NIF = Trabajador.contNIF + String.valueOf((char) ((int) (Math.random() * 26) + 65));
        /*otra forma1
        this.NIF= String.valueOf(Trabajador.contNIF);*/
 /*otra forma2
        String nif = String.format("%08d",Trabajador.contNIF);
        NIF = Trabajador.contNIF+String.valueOf((char)((int)(Math.random()*26)+65));*/

        this.nombre = "Trabajador"+NIF;
        this.departamento = "dpto";
        this.fecha = new Fecha();
        //el salario para los hijos pues son diferentes random
    }

    public Trabajador(String nombre, String departamento, Fecha fecha, double sueldoBase) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.fecha = fecha;
        this.sueldoBase = sueldoBase;
        Trabajador.contNIF++;
        this.NIF = Trabajador.contNIF + String.valueOf((char) ((int) (Math.random() * 26) + 65));

    }

    public Trabajador(String nombre, String NIF, String departamento, Fecha fecha, double sueldoBase) {
        this(nombre, departamento, fecha, sueldoBase);
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public static int getContNIF() {
        return contNIF;
    }

    public static void setContNIF(int contNIF) {
        Trabajador.contNIF = contNIF;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + "nombre=" + nombre + ", NIF=" + NIF + ", departamento=" + departamento + ", fecha=" + fecha.convertidorFormato() + ", sueldoBase=" + sueldoBase + '}';
    }
    public String toStringFichero(){
        return getClass().getSimpleName()+";" + nombre + ";" + NIF + ";"+ departamento + ";" + fecha.convertidorFormato() + ";" + sueldoBase;
    }
}
