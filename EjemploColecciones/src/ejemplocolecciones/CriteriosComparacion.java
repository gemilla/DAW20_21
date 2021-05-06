/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocolecciones;

import java.util.Comparator;

/**
 *
 * @author GEMA
 */
public class CriteriosComparacion {

}

class porEdad implements Comparator<Individuo>{

    @Override
    public int compare(Individuo o1, Individuo o2) {
        return o1.edad-o2.edad;
    }

   

}

class porPoblacion implements Comparator<Individuo>{

    @Override
    public int compare(Individuo t, Individuo t1)    {
        return t.poblacion.compareTo(t1.poblacion);
    }
    


}

class porPoblacionEdad implements Comparator<Individuo>{

    @Override
    public int compare(Individuo t, Individuo t1)    {
        int aux =t.poblacion.compareTo(t1.poblacion);
        if(aux==0)
            aux = t.edad-t1.edad;
        return aux;
    }
    


}
