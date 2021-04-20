package ahorcadogeneral;
public class Elemento implements Comparable<Elemento>{
    protected int dificultad; //1 fácil 2 medio 3 difícil
    protected String categoria;
    protected String palabra; //en función de la categoría será una serie concreta, una pelicula concreta, un videojuego concreto, un grupo música concreto

    public Elemento(String categoria, String palabra, int dificultad) {
        this.categoria = categoria;
        this.palabra = palabra;
        this.dificultad = dificultad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Elemento{" + "categoria=" + categoria + ", palabra=" + palabra + '}';
    }

    @Override
    public int compareTo(Elemento o) {
        return this.palabra.length()-o.palabra.length();
    }
    
}
