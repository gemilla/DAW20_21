package P4;

import java.util.Scanner;

public class Tester {

    public static void cargarLlamadas(Llamada[] llamadas) {
        Scanner lector = new Scanner(System.in);

        
        for (int i = 0; i < llamadas.length; i++) {
            System.out.println("Introduzca el tipo de llamada (local/provincial)");
            String llamada = lector.next();
            //llamada = llamada.toLowerCase();
            System.out.println(llamada);
            System.out.println("Introduzca el numero de origen");
            int origen = lector.nextInt();
            System.out.println("Introduzca el numero de destino");
            int destino = lector.nextInt();
            System.out.println("Introduzca la duracion de la llamada");
            int duracion = lector.nextInt();

            if (llamada.equalsIgnoreCase("local")) {
                llamadas[i] = new LlamadaLocal(origen, destino, duracion);
            } else if (llamada.equalsIgnoreCase("provincial")) {
                System.out.println("En que franja se ha relizado la llamada");
                int franja = lector.nextInt();
                llamadas[i] = new LlamadaProvincial(origen, destino, duracion, franja);
            }
        }
    }
    
    public static void cargarLlamadasAleatoria(Llamada[] llamadas){
        for (int i = 0; i < llamadas.length; i++) {
            if (i%2==0)
                llamadas[i] = new LlamadaLocal();
                //llamadas[i]= new LlamadaLocal(i,i*3,i*100);
            else 
                llamadas[i] = new LlamadaProvincial();
        }
    
    }
    
    
    
    
    public static void main(String[] args) {
        Llamada llamadas[] = new Llamada[50];
        //cargarLlamadas(llamadas);
        cargarLlamadasAleatoria(llamadas);
        
        
        Centralita centralita = new Centralita();
        for (int i = 0; i < llamadas.length; i++) {
            System.out.println(llamadas[i]);
            centralita.registrarLlamada(llamadas[i]);
            System.out.println("LLeva "+ centralita.numLlamadas+ " llamadas.");
            System.out.println("LLeva facturado"+ centralita.costeTotal+ " euros.");
            
            
        }
        
        

    }

}
