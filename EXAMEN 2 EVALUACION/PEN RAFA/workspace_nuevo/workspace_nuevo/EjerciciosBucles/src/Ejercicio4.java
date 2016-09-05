import java.util.Scanner;


public class Ejercicio4 {

	public static void main (String args []) {
		
		
		int coches;
		int precio1=10000;
		int precio2=12540;
		int precio3=8000;
		int precio4=19780;
		int maximo;
		int minimo;
		
		
		
		Scanner teclado =new Scanner (System.in);
		
		
				System.out.println("La siguiente lista muestra el precio de los coches");
				System.out.println("--------------------------------------------------");
				System.out.println("1. Opel Corsa    :"+ precio1);
				System.out.println("2. Nissan Almera   :"+ precio2);
				System.out.println("3. Dancia Logan   :"+ precio3);
				System.out.println("4. Golf GTI       :"+ precio4);
				System.out.println("--------------------------------------------------");
				
				System.out.println("---------------¿CÚANTOS COCHES HAY?--------------");
				coches=teclado.nextInt();
				
				
				maximo=precio4;
				minimo=precio3;
				System.out.println("El maximo es   :"+ maximo);
				System.out.println("El minimo es   :"+ minimo);
				
		
		
		
		
		
		
		
		
	}
	
}
