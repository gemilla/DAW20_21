package examena;

public class Tester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
        String fecha ="04/08/2021";
        String cadena[] = fecha.split("/");
        System.out.println(cadena[0]);
        int dia = Integer.parseInt(cadena[0]);
        System.out.println(dia);
         */
        
        /*Jefe uno = new Jefe();
        System.out.println(uno);
        System.out.println(uno.calcularSalario());*/
        Empresa AinhoaEva = new Empresa(10);
        System.out.println(AinhoaEva);
        AinhoaEva.listarTrabajadores();
        
        
    }

}
