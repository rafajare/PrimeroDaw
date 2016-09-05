import java.util.*;
public class T3Vectores10 {

	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);
		
		int numero[] = new int[10];
		
		for(int i=0;i<10;i++){
			
			System.out.printf("Introduce un número: ");
			numero[i] = teclado.nextInt();
			
			for(int j=1;j<=numero[i];j++){
				System.out.println(""+j);
				
			}//for2
		}//for1
		
	}
}
