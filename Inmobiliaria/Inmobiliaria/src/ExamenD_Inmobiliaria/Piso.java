package ExamenD_Inmobiliaria;

public class Piso extends Alojamiento {

    private boolean comunidad;
    private boolean ascensor;

    //constructor
    public Piso(String id, double precio, double metros, Direccion dir, int anyo, boolean comunidad, boolean ascensor) {
        super(id, precio, metros, dir, anyo);
        this.comunidad = comunidad;
        this.ascensor = ascensor;
    }

    public Piso() {
        super();
        this.comunidad = true;
        this.ascensor = false;
    }
    //getter y setter

    public boolean isComunidad() {
        return comunidad;
    }

    public void setComunidad(boolean comunidad) {
        this.comunidad = comunidad;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    public String tieneComunidad() {
        String respuesta;
        if (comunidad == false) {
            respuesta = "Este piso no tiene comunidad";
        } else {
            respuesta = "Este piso  tiene comunidad";
        }
        return respuesta;
    }

    public String tieneAscensor() {
        String respuesta;
        if (ascensor == false) {
            respuesta = "Este piso no tiene ascensor";
        } else {
            respuesta = "Este piso tiene ascensor";
        }
        return respuesta;
    }

    @Override
    public double precioReal(double descuento) {
        double total = precio;

        if (comunidad == true) {
            total = total + total * 0.1;
        }
        if (ascensor == true) {
            total = total + total * 0.1;
        }
        total = total - total * descuento;
        return total;
    }
    //mostrar info

    @Override
    public String toString() {
        return super.toString() + "\n" +tieneAscensor()+ "\n"+ tieneComunidad();
    }

}
