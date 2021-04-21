/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadogeneral;

/**
 *
 * @author gema
 */
public class Diccionario {
    protected Elemento [] lista;

    public Diccionario() {
     
        lista = new Elemento[15];
        lista[0]= new Elemento ("perro", "animales",1);
        lista[1]= new Elemento ("gato", "animales",1);
        lista[2]= new Elemento ("Francia", "paises",2);
        lista[3]= new Elemento ("España", "paises",2);
        lista[4]=  new Elemento ("caballa", "animales",2);
        lista[5]=  new Elemento ("impala", "animales",2);
        
    }
    
    public Diccionario(Elemento [] lista){
        this.lista = lista;
    }
    
    public int cuantos(String categoria, int dificultad){
        int cantidad=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]!=null&& lista[i].categoria.equalsIgnoreCase(categoria)&& lista[i].dificultad== dificultad)
             cantidad++;
        }
        return cantidad;
    }
    
    public Elemento[] getElementosCategoriaDificultad(String categoria, int dificultad){
        Elemento[] especifica = new Elemento[cuantos(categoria,dificultad)];
        for (int i = 0, k=0; i < lista.length; i++) {
            if (lista[i]!=null&& lista[i].categoria.equalsIgnoreCase(categoria)&& lista[i].dificultad== dificultad){
                especifica[k]= lista[i];
                k++;
            }
        }   
        return especifica;
        }
        public String getPalabraAleatoria(String categoria, int dificultad){
            return getElementosCategoriaDificultad(categoria,dificultad)[(int)(Math.random()*this.cuantos(categoria, dificultad))].palabra;
        }
    }
    

