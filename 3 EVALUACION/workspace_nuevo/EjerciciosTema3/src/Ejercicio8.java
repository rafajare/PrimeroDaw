import java.util.Scanner;


public class Ejercicio8 {
	
	public static void main (String args []){
		
		int vector[]= new int [5];
		int i=0;
		
		Scanner teclado= new Scanner (System.in);
		
		for (i=0; i<5;i++){
			System.out.println("Introduce el sueldo "+ i);
			vector[i]=teclado.nextInt();
		}
			
			for (i=0; i<5; i++){
				for (int j=0; j<4;j++){
					if (vector[j] > vector[j+1]){ // Si no están de menor a mayor
						int aux = vector[j];
						vector[j]= vector[j+1];
						vector[j+1]= aux;
					}
					
				}
			}
			System.out.println("Los sueldos son  ... "+ vector[0]);
			System.out.println("Los sueldos son  ... "+vector[1]);
			System.out.println("Los sueldos son  ... "+ vector[2]);
			System.out.println("Los sueldos son  ... "+ vector[3]);
			System.out.println("Los sueldos son  ... "+ vector[4]);
	}//fin main

}// fin class
	
	