import java.util.Scanner;

public class Ejericio10 {

	public static void main(String args[]){
		
		double grados;
		String l�quido;
		String solido;
		String gaseoso;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("introduzca los grados del agua");
		grados = teclado.nextDouble();
		
		if ( grados > 0 && grados <100){
			
			System.out.println("Est� en estado l�quido");
			
		} 
		
		if( grados <0){
			System.out.println("est� en estado s�lido");
			
		} 
		if( grados > 100){
			
			System.out.println("Est� en estado gaseoso");
			
		}
		
		
		
	}
}
