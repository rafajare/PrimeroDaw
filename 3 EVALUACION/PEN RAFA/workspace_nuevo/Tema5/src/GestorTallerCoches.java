/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.util.Scanner;


public class GestorTallerCoches {

    public static int menu(Scanner tec){
        System.out.println("**************************\n"
                         + "**** TALLER DE COCHES ****\n"
                         + "**************************");
        System.out.println("1. Alta coche");
        System.out.println("2. Borra coche");
        System.out.println("3. Compara coches");
        System.out.println("4. Filtro coches");
        System.out.println("5. Guardar");
        System.out.println("0. Salir");
        
        System.out.println("**************************");
        
        return(tec.nextInt());
    }
    
    /**
     * @param args the command line arguments
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
    	
    	Scanner teclado = new Scanner (System.in);
        // TODO code application logic here
        Taller t = new Taller("Av. LLuis Vives", "10:00", "19:00");
        t.cargar();
        
        
        int opcion;
        do{
            Scanner tec = null;
			opcion = menu(tec);
            switch(opcion){
                case 1:
                    System.out.println("Alta coche:");
                    
                    
        			System.out.println("Introduzca la matricula");
        			
					String matricula=teclado.next();
        			System.out.println("Introduzca el color");
        			String color=teclado.next();
        			System.out.println("Introduzca el modelo");
        			String modelo=teclado.next();
        			System.out.println("Se encuentra en el taller");
        			boolean enTaller=teclado.nextBoolean();
        			System.out.println("Introduzca la antiguedad");
        			int antiguedad=teclado.nextInt();
        			
				
        			Coche c = new Coche(matricula, color , modelo , enTaller , antiguedad);
        			Taller e1 = null;
        			t.anyadirCoche(c);
                    
                    break;
                    
                case 2:
                    System.out.println("Borrar coche:");
                    System.out.println("Matricula:");
                    String matriculaBorrar = tec.next();
                    System.out.println(t.borrarCoche(matriculaBorrar));
                   
                    break;
                
                case 3:
                    
                   
                    	
                    
                    
                case 4:
                    System.out.println("Filtro coches:");
                    System.out.println("Introduzca el modelo del coche:");
                    String modeloFiltro = tec.next();
                    System.out.println("Introduzca la antiguedad del coche:");
                    int antiguedadFiltro = tec.nextInt();
                    System.out.println(t.filtroCoches(modeloFiltro, antiguedadFiltro));
                    break;
                
                case 5: 
                    System.out.println("Guardar:");
                    t.guardar();
                    
                    break;
            
            }
            
        }while(opcion!=0);
        
    }
}
