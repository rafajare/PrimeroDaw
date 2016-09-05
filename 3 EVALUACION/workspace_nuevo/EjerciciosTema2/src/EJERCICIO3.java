import java.util.Scanner;

public class EJERCICIO3 {

	
	public static void main(String [] args){
		
		
		int punto ;
		
		
		
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca punto :");
		 punto = teclado.nextInt();
		 
		 	if (punto >= 0)
			if (punto <= 45)
				
				
			System.out.println("Primer cuadrante");
			
		if(punto > 45)
		if(punto <= 90)
			System.out.println("Segundo cuadrante");
		
		if(punto  >90)
		if (punto <= 180)
			
			System.out.println("Tercer cuadrante");
		
		if(punto > 180 && punto <=360)
			
			System.out.println("Cuarto cuadrante");
		
		
			
			
			
		
		
		
		
		
		
		
	}
	
	
}
