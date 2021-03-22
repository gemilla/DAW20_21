package ExamenD_Inmobiliaria;

public class Inmobiliaria {
	private Alojamiento[][] alojamientos;
	private static final String [] provincias = {"Madrid", "Barcelona", "Málaga", "Valencia","Vizcaya"};
	//tengo que llamar desde el array bidimensional al otro array
	//y que en la primera fila me lo rellene solo
	public Inmobiliaria() {
		alojamientos=new Alojamiento[5][5];
		for (int i = 0; i < alojamientos.length; i++) {//filas
                    for (int j = 0; j < alojamientos[i].length; j++) {//columnas
                        String provincia = provincias [i];
                        if (j%2==0){
                            double precio = Math.random()*100001+200000;
                            alojamientos[i][j]= new Piso("id"+i,precio,Math.random()*100+50,new Direccion("calle"+i,provincia),(int) (Math.random()*22)+2000, true, false);
                        }
                        else{
                           //(String id, double precio, double metros, Direccion dir, int anyo, boolean pareados) {
                           double precio = Math.random()*300001+300000;
                           int pareadoEntero = (int) (Math.random()*2);
                           boolean pareado= false;
                           if (pareadoEntero==1)
                               pareado=true;
                           alojamientos[i][j]= new Chalet("id"+i,precio,Math.random()*100+100,new Direccion("calle"+i,provincia),(int) (Math.random()*22)+2000, pareado);
                        
                        } 
                        
                    }
		}
	}
        public void listarAlojamientos(){
            for (int i = 0; i < alojamientos.length; i++) {
                for (int j = 0; j < alojamientos[i].length; j++) {
                    System.out.println(alojamientos[i][j]);
                }
                System.out.println("-------------------");
            }
        
        }
}
