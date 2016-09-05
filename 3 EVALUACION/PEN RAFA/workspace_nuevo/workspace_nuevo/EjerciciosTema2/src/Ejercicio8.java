import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String args[]){
	
	int A;
	int B;
	int C;
	
	
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("introduzca el precio de un producto");
	A = teclado.nextInt();
	
	System.out.println("introduzca el precio del segundo producto");
	B = teclado.nextInt();
	
	System.out.println("introduzca el precio del tercer producto");
	C = teclado.nextInt();
	
	if(A < B && A< C && B < C){
		System.out.println("El orden de menor a mayor es :"  + A + "," + B +"," + C);
	}
	
	if(A < C  && A< B && C < B ){
		System.out.println("El orden de menor a mayor es :" + A + "," + C +"," + B );
	}
		
	if (B < A && B < C && A < C){
		System.out.println("El orden de menor a mayor es :" + B + "," + A +"," + C);	
	} 
	
	if (B < A && B < C && C < A){
		System.out.println("El orden de menor a mayor es :"+ B + "," + C +"," + A);
		
	}
	if (C < B && C < A  && B < A){
		System.out.println("El orden de mayor a menor es :"+ C + "," + B +"," + A);
	}
	if (C < B && C < A  && A <B){
		System.out.println("El orden de mayor a menor es :" + C + "," + A +"," + B);
}
	
	
	
	}
}

