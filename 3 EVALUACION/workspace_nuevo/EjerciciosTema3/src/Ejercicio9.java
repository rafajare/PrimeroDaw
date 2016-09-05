import java.util.Scanner;


public class Ejercicio9 {
	
	public static void main (String args []){
		
	String vector[] = new String [5];
	int i=0;
	
	Scanner teclado= new Scanner (System.in);
	
	for(i=0; i<5; i++){
		System.out.println("Introduce los paises");
		vector[i]=teclado.next();
		}
		
	for (i=0; i<5; i++){
		for (int j=0; j<4/*j<4-i*/;j++){
			if (vector[j].compareTo(vector[j+1])>0){ // Si no están de menor a mayor
				String aux = vector[j];
				vector[j]= vector[j+1];
				vector[j+1]= aux;
			}
		
			
		}
		 
		
		}
	
	System.out.println("  ... "+ vector[0]);
	System.out.println("  ... "+vector[1]);
	System.out.println("  ... "+ vector[2]);
	System.out.println("  ... "+ vector[3]);
	System.out.println("  ... "+ vector[4]);
	
	}//fin main
	
	}// fin class


