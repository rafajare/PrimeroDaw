import java.util.Scanner;


public class Ejercicio7 {

	public static void main (String args[]) {
		
		int numero;
		int contador=0;
		int usuarioDigitos;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce el número  :");
		numero=teclado.nextInt();
		
		System.out.println("Introduce num digitos  :");
		usuarioDigitos=teclado.nextInt();
		
		do {
				
			numero= numero/10;
			contador=contador+1;	
				
		} while (numero>0);
		
			System.out.println("El numero tiene "+ contador +" digitos");
		
		if ( usuarioDigitos==contador) {
			
			System.out.println("---------------------");
			System.out.println("El numero es corecto");
			
		}
		
		else {
			System.out.println("----------------------");
			System.out.println("El numero es incorrecto");
		}
	
	
		
		
		
	}
}
