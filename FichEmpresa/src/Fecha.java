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
public class Fecha implements Serializable{
    protected int dia;
    protected int mes;
    protected int anyo;
    
    public Fecha() { 
        dia = (int) ((Math.random() * 30) + 1);
        mes = (int) ((Math.random() * 12) + 1);
        anyo = (int) ((Math.random() * 100) + 1950);
    }
    
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        //return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anyo=" + anyo + '}';
        return convertidorFormato();
    }

    
    public String convertidorFormato(){
        return String.format("%02d/%02d/%04d", dia,mes,anyo );
    }
    public void mostrarFecha(){
        System.out.printf("%02d/%02d/%04d",dia,mes,anyo );
    }
}
