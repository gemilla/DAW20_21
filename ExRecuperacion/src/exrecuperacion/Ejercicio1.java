package exrecuperacion;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int opcion;
        int numero;
        int suma = 0;
        do {
            System.out.println("Elige una opcion");
            System.out.println("1.Calcular numero de abundantes");
            System.out.println("2.Calcular numero de consonantes");
            System.out.println("3.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int contAbundantes = 0;
                    int contDeficientes = 0;
                    do {
                        System.out.println("Escribe un numero");
                        numero = sc.nextInt();
                        if (numero != 0) {
                        //if (numero != -1) //examen B
                            suma = 1;
                            for (int i = 2; i <= numero / 2; i++) {
                                if (numero % i == 0) {
                                    suma = suma + i;
                                }
                            }
                            if (suma > numero) {
                                contAbundantes++; //examen A
                            } else {
                                contDeficientes++; //examen B
                            }
                        }
                    } while (numero != 0); //examen A
                    //} while (numero != -1); //examen B
                    System.out.println("Examen A: " + contAbundantes);
                    //System.out.println("Examen B: " + contDeficientes);
                    break;

                case 2:
                    System.out.println("Escribe una frase finalizandola con un punto");

                    char letra;
                    int contadorConsonantes = 0;

                    do {
                        letra = (char) System.in.read();
                        letra = Character.toUpperCase(letra);
                        if ((letra >= 'B' && letra <= 'Z') && (letra!= 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U'))
                            contadorConsonantes++;
                        //Examen B 
                        //if (letra== 'A' && letra == 'E' && letra == 'I' && letra == 'O' && letra == 'U')

                    } while (letra != '.');
                    System.out.println("El numero de consonantes introducidos es " + contadorConsonantes);
                    break;

                case 3:
                    System.out.println("Saliendo...");
            }
        } while (opcion != 3);
    }

}
