import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String args []){
		
		char c;
		int num;
		
		
		
		Scanner teclado = new Scanner (System.in);
		
		num = teclado.next().charAt(0);
		
		c = (char) num;
		
		System.out.println("Introduce un caracter :");
		
		//c = (char) teclado.nextInt(); //
		c = teclado.next().charAt(0);
		
		
		
		if(c >= 'a' && c<= 'z'){
			System.out.println("Es un caracter");
		}
			
			if(c >= 'A' && c<= 'Z'){
				System.out.println("Es un caracter");
			
			}
			
			
		if (c== '.' || c==',' || c== ':' || c == ';');{
			
			System.out.println("Es un caracter");
		}
		
		
			
			
			
			
			/*
			System.out.println("introduce un número =");
			n = teclado.nextInt();
			
			if (n >= '0' && n<='9')
				System.out.println("Es un número");
			
			
			System.out.println("Introduce un signo");
			
			x = teclado.next().charAt(0);
			if( x<= '.' && x>= ':')
				
			
			System.out.println("es un signo de puntuación"); */
			
			
		}
		
	
	}
	

