import java.util.Scanner;


public class EjercicioEdades {
	public static void main (String args[]){
		
		Scanner teclado=new Scanner(System.in);
		
		String nombre[]= null;
		int edad[]= new int [5];
		
		
	for (int i= 0; i< 5; i++){
		
		System.out.println("Introduce nombre ");
		nombre[i] =teclado.next();
		System.out.println("Introduce la edad ");
		edad [i] =teclado.nextInt();
		
		
	}
	
	for (int i=0; i<5; i++){
		if (edad [i] >=18 ){
			System.out.println("Los mayores de edad son  "+ nombre);
		}
	}
	
	}
		
	
	}


