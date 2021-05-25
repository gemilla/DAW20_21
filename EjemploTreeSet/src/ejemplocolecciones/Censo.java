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
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author GEMA
 */
public class Censo implements Serializable {
    //inserción ordenada y sin duplicados teniendo en cuenta el compareTo de Individuo, orden natural
    protected TreeSet<Individuo> censo;

    public Censo(TreeSet<Individuo> censo) {
        this.censo = censo;
    }

    public Censo() {
        //primera ejecución
        censo = new TreeSet();
        for (int i = 0; i < 30; i++) {
            censo.add(new Individuo((int) (Math.random() * 100), "individuo" + (i + 1), "provincia" + (i % 5)));
        }

        //sucesivas, carga de fichero
        //censo =GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO).censo;
    }

    public TreeSet<Individuo> getCenso() {
        return censo;
    }

    public void setCenso(TreeSet<Individuo> censo) {
        this.censo = censo;
    }

    public void listar() {
        Iterator<Individuo> aux = censo.iterator();
        while(aux.hasNext()){
            System.out.println(aux.next());
        }
    }

    public void alta() throws IOException {
        censo.add(Alta());
    }

    public static Individuo Alta() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce edad, nombre,poblacion");
        return new Individuo(Integer.parseInt(br.readLine()), br.readLine(), br.readLine());

    }

    public void baja(String poblacion) throws IOException {
        Iterator<Individuo> it = censo.iterator();
        while (it.hasNext()) {
            Individuo aux = it.next();
            if (aux.getPoblacion().equalsIgnoreCase(poblacion)) {
                it.remove();
            }
        }
    }

    public void bajaArrayList(String poblacion) throws IOException {
        ArrayList<Individuo> lista = new ArrayList(censo);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).poblacion.equalsIgnoreCase(poblacion)) {
                lista.remove(i);
                i--;
            }

        }
    }
    public void mostrar(String nombre) {
        Iterator<Individuo> it = censo.iterator();
        while (it.hasNext()) {
            Individuo aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(aux.toString());
            }
        }
    }

    public void mostrarPoblacion(String poblacion) {
        /**/
    }

    public void mostrarMayores(int edad) {
        /**/
    }

    public void actualizarPoblacion(String nombre, String poblacion) throws IOException {
        Iterator<Individuo> it = censo.iterator();
        while (it.hasNext()) {
            Individuo aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                aux.poblacion = poblacion;
            }
        }
    }

    @Override
    public String toString() {
        return censo.toString();
    }

}
