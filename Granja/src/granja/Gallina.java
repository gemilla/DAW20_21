package granja;


import java.util.Arrays;

public class Gallina extends Animal {

    private int[] numeroHuevos;

    public Gallina(String nombre, Fecha fechaNacimiento, int[] numeroHuevos) {
        super(nombre, fechaNacimiento);
        this.numeroHuevos = numeroHuevos;
    }

    public Gallina() {
        super();
        numeroHuevos = new int[30];
        for (int i = 0; i < numeroHuevos.length; i++) {
            numeroHuevos[i] = (int) (Math.random() * 5);
        }
    }

    public int[] getNumeroHuevos() {
        return numeroHuevos;
    }

    public int mediaHuevos() {
        int media = 0;
        for (int i = 0; i < numeroHuevos.length; i++) {
            media = media + numeroHuevos[i];
        }
        return media = media / numeroHuevos.length;
    }

    public void setNumeroHuevos(int[] numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    @Override
    public String toString() {
        return super.toString()+"Media de huevos al mes "+mediaHuevos();
        //return super.toString()+"Huevos al mes: "+Arrays.toString(numeroHuevos);
        /*String huevosMes = new String();
        for (int i = 0; i < numeroHuevos.length; i++) {
            huevosMes = huevosMes.concat(Integer.toString(numeroHuevos[i])).concat(", ");

        }
        return huevosMes;*/
        
        //mejor si quieres personalizar
        /*StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < numeroHuevos.length; i++) {
            sb.append(Integer.toString(numeroHuevos[i])).append(", ");

        }
        return sb.toString();*/
    }

    public boolean rentable() {
        int media = mediaHuevos();
        boolean respuesta = false;
        if (media >= 3) {
            respuesta = true;
        }
        return respuesta;

    }
}
