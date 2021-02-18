package granja;



public class Vaca extends Animal {

    private int litrosAlMes;
    private int kg;

    public Vaca(String nombre, Fecha fechaNacimiento, int litrosAlMes, int kg) {
        super(nombre, fechaNacimiento);
        this.litrosAlMes = litrosAlMes;
        this.kg = kg;
    }

    public Vaca() {
        super();
        litrosAlMes = (int) (Math.random() * 500 + 7);
        kg = (int) (Math.random() * 500 + 7);
    }

    public int getLitrosAlMes() {
        return litrosAlMes;
    }

    public void setLitrosAlMes(int litrosAlMes) {
        this.litrosAlMes = litrosAlMes;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return super.toString() + " litros al mes: " + litrosAlMes + " Kg: " + kg;
    }

    public boolean rentable() {
        boolean respuesta = false;
        if (litrosAlMes > 500) {
            respuesta = true;
        }
        return respuesta;
    }
}
