import java.util.Scanner;


public class multiVectores {
	
	public static void main (String args []){
		Scanner teclado= new Scanner (System.in);
		
		int sala=0;
		int numPC=0;
		int vector[][]= new int [4][20];
		int contadorSala=0;
		int contadorTotal=0;
		int opcion;
		
		System.out.println("Que operación desea realziar");
		opcion=teclado.nextInt();
		
		switch (opcion){
		case 1:
		
		System.out.println("1. Asignar o cancelar turno");	
		System.out.println("--------------------------");
		System.out.println("Introduce la sala");
		sala=teclado.nextInt();
		System.out.println("Introduce el ordenador que desea usar"); 
		numPC=teclado.nextInt();
		 break;
		 case 2:
			 
		System.out.println("2.  Cantidad de equipos disponibles por sala");	 
		
		 break;
		 case 3:
				
	    System.out.println("3. Cantidad de turnos asignados");	
		
	    break;
		case 4:
		
		System.out.println("4. Salir");		
		}
		
		 
		
	}

}
