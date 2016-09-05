import java.util.Scanner;


public class Ejercicio12 {
	
	public static void main (String args[]){
		
		int numero;
		int negativo;
		int contador=0;
		int contadorNegativo=0;
		
		Scanner teclado= new Scanner (System.in);
		
		for (int i=1; i<=10; i++){
			
			System.out.println("Introduce un numero  :");
			numero=teclado.nextInt();
			contador=contador+1;
			
			if (numero<0){
				contadorNegativo=contadorNegativo+1;
			}
		}
				System.out.println("Se han introducido  "+ contadorNegativo+ "  numeros negativos");
	}

}
