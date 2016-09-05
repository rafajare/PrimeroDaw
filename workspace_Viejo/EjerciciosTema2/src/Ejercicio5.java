import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String args[]){
		
		
		int B;
		int C;
		double x;
		double Z ;
		double x1;
		int A;
		double x2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca los siguientes valores:");
		
			System.out.println("A :");
			A = teclado.nextInt();
			
			System.out.println("B:");
		
			B = teclado.nextInt();
		
			System.out.println("C:");
		
			C = teclado.nextInt();
			
		 
		if ( A == 0){
		
		x = -C / B ;
		
		
		System.out.println(" Ecuación de primer grado :" + x);
		
		}
		
		if ( A!= 0){
		
		
		Z = (Math.pow(B, 2) - (4 * A * C));
		
		System.out.println("el discriminante es :" + Z);
		
		
		
			
			if ( Z< 0)
			
			System.out.println("la ecuación no tiene resultado");
			
			
			 
			
			if ( Z > 0){
			
	
		
		x1 = ( B * Math.sqrt(Z)) / 2 * A ;
			
			
		System.out.println(" x1 =" + x1);
		
		
		x2 = (-B * Math.sqrt(Z)) / 2* A;
		
		System.out.println(" x2 =" + x2);
		
		
			}
			
	
	
	}
		
	}
	
	}


