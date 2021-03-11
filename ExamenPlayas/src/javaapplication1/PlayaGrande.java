package javaapplication1;

public class PlayaGrande extends Playa {

    private String bandera;

    public PlayaGrande() {
        super();
        bandera = "roja"; //random de 3 y elegir en función del resultado
    }

    public PlayaGrande(String bandera, int id, String nombre, Direccion direccion, double longitud, int[] valoracion) {
        super(id, nombre, direccion, longitud, valoracion);
        this.bandera = bandera;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    @Override
    public double getPuntuacion() {
        double resultado = valoracionMedia();
        if (getLongitud()>2000 && bandera.equalsIgnoreCase("verde")) {
            resultado += 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString() + " bandera=" + bandera;
    }

    

}
