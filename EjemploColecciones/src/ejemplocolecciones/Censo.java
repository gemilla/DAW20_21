/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocolecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author GEMA
 */
public class Censo implements Serializable {

    protected ArrayList<Individuo> censo;

    public Censo(ArrayList<Individuo> censo) {
        this.censo = censo;
    }

    public Censo() {
        //primera ejecución
        censo = new ArrayList();
        for (int i = 0; i < 100; i++) {
            /*Individuo aux = new Individuo((int) (Math.random() * 100), "individuo" + (i + 1), "provincia" + (i % 3));
            censo.add(aux);*/
            censo.add(new Individuo((int) (Math.random() * 100), "individuo" + (i + 1), "provincia" + (i % 3)));
        }

        //sucesivas, carga de fichero
        //censo = GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO).censo;
    }

    public ArrayList<Individuo> getCenso() {
        return censo;
    }

    public void setCenso(ArrayList<Individuo> censo) {
        this.censo = censo;
    }

    public void listar() {
        for (int i = 0; i < censo.size(); i++) {
            System.out.printf(censo.get(i).toString());
            
        }
    }

    public void alta() throws IOException {
       /* Individuo aux = Alta();
        if (!censo.contains(aux))*/
            censo.add(Alta());
    }

    public static Individuo Alta() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce edad, nombre,poblacion");
        return new Individuo(Integer.parseInt(br.readLine()), br.readLine(), br.readLine());

    }

    public void baja(String nombre, String poblacion) throws IOException {
        boolean borrado=false;
        for (int i = 0; i < censo.size()&&!borrado; i++) {
            if (censo.get(i).nombre.equalsIgnoreCase(nombre)&& censo.get(i).poblacion.equalsIgnoreCase(poblacion)) {
                censo.remove(i);
                borrado=true;
            }

        }
    }
    //0,1,2,3,4->5 individuos
    //2 eliminado-> 4individuos->0,1,2,3, i=2, i++->i=3
     public void baja(String poblacion) throws IOException {
        for (int i = 0; i < censo.size(); i++) {
            if (censo.get(i).poblacion.equalsIgnoreCase(poblacion)) {
                censo.remove(i);
                i--;
            }

        }
    }
    //4,3,2,1,0-> 5 individuos
    //4 eliminado->4 individuos->3,2,1,0, i=4,i--->i=3 
    //Solucionado por Rober y apoyado por Nerea con recorrido de mayor a menor

    public void mostrar(String nombre) {
        for (int i = 0; i < censo.size(); i++) {
            if (censo.get(i).nombre.equalsIgnoreCase(nombre)) {
                System.out.println(censo.get(i));
            }

        }
    }

    public void mostrarPoblacion(String poblacion) {
        for (int i = 0; i < censo.size(); i++) {
            if (censo.get(i).poblacion.equalsIgnoreCase(poblacion)) {
                System.out.println(censo.get(i));
            }

        }
    }

    public void mostrarMayores(int edad) {
        for (int i = 0; i < censo.size(); i++) {
            if (censo.get(i).edad > edad){
                System.out.println(censo.get(i));
            }

        }
    }

    public void actualizarPoblacion(String nombre, String poblacion) throws IOException {
        for (int i = 0; i < censo.size(); i++) {
            if (censo.get(i).nombre.equalsIgnoreCase(nombre)) {
                System.out.println(censo.get(i));
                censo.get(i).poblacion = poblacion;
            }

        }

    }

    @Override
    public String toString() {
        return censo.toString();
    }

}
