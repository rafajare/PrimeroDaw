import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String args[]){
	
	int persona1;
	int persona2;
	int persona3;
	

	Scanner teclado = new Scanner(System.in);
	
	System.out.println("introduzca edad persona 1 :");
	persona1 = teclado.nextInt();
	
	System.out.println("introduzca edad persona2 :");
	persona2 = teclado.nextInt();
	
	System.out.println("introduzca edad persona 3 :");
	persona3 = teclado.nextInt();
	
	if ( persona1 <= persona2 && persona1 <= persona3){
	
	System.out.println("persona1 tiene edad minima");
	
	}
	
	if ( persona2 <= persona1 && persona2 <= persona3){
		System.out.println("persona2 tiene la edad mínima");
		
		
	}
	
	if ( persona3 <= persona1 && persona3 <= persona2){
		System.out.println("persona3 tiene la edad mínima");
	}
		
		if ( persona1 == persona2 && persona1 != persona3){
			System.out.println("persona1 y persona2 edades minimas");	
		}
		
		if ( persona3 == persona2 && persona2 != persona1){
			System.out.println("persona3 y persona2 edades minimas");
			
			
	}
	
		if ( persona3 == persona1 && persona3 != persona2){
			System.out.println("persona3 y persona1 edades minimas");
			
}
	
}
	}
	