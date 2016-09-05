import java.util.Scanner;

public class Ejercicio3 {
	
		public static void main ( String args[]) {
			
			
			Scanner teclado=new Scanner (System.in);
			
			int numeros;
			int suma=0;
			int i;
			
			
			
			
			
			for (i=1; i<=15; i++){
				System.out.println("Introduce los valores  :");
				numeros=teclado.nextInt();
			
				suma= suma+numeros;
				System.out.println("Procesando   :"+suma);
			
		
			}
			
		}
	

}
