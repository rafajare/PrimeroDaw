import java.util.Scanner;


public class Ejercicio5 {
	
	public static void main (String args[]){
		
		int edad;
		int media;
		int contador=0;
		int suma=0;
			
		
			Scanner teclado = new Scanner (System.in);
			System.out.println("Introduce la edad    ");
			edad= teclado.nextInt();
			 
			
		while (edad !=0) {
			
			suma=suma+edad;
			contador= contador+1;
			System.out.println("Introduce la edad    ");
			edad= teclado.nextInt();
			
			
			
			}
			
			media= suma/contador;
			System.out.println("Procesando..." + media);

	}

}
