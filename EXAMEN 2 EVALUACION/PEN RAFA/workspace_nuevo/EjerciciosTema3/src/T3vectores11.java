import java.util.*;
public class T3vectores11 {

	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);
		
int v[] = new int[10];
		

		for(int i=0;i<10;i++){
		
			
			System.out.printf("Introduce un número: ");
			v[i] = teclado.nextInt();
			
		}//for
		
		for(int i=0;i<10;i++){
			for(int j=0;j<9/*j<4-i*/;j++){
				if(v[j]>v[j+1]){
					int aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}//for2
		}//for1
		
		System.out.println("El número mas grande es "+v[9]);
	}//main
}
