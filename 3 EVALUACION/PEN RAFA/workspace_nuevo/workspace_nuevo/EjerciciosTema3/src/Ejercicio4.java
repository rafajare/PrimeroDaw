import java.util.Scanner;


public class Ejercicio4 {
	
	public static void main (String args []){
		
		int vector[]= new int [10];
		int i=0;
		
		Scanner teclado= new Scanner (System.in);
		
		for (i=0; i<10;i++){
			System.out.println("Introduce el elemento "+ i);
			vector[i]=teclado.nextInt();
			
		}
		
		i=0;
		if (vector[i]<vector[i+1] && i<10){
			System.out.println("El vector esta ornedado de menor a mayor");
		}

		else {System.out.println("El vector esta desornedado");
			
			}
		}
	}
	


