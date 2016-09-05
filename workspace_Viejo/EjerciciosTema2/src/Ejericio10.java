import java.util.Scanner;

public class Ejericio10 {

	public static void main(String args[]){
		
		double grados;
		String líquido;
		String solido;
		String gaseoso;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("introduzca los grados del agua");
		grados = teclado.nextDouble();
		
		if ( grados > 0 && grados <100){
			
			System.out.println("Está en estado líquido");
			
		} 
		
		if( grados <0){
			System.out.println("está en estado sólido");
			
		} 
		if( grados > 100){
			
			System.out.println("Está en estado gaseoso");
			
		}
		
		
		
	}
}
