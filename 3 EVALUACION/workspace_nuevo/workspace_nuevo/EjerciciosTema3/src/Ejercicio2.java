import java.util.Scanner;


public class Ejercicio2 {
	
	public static void main (String args){
		
	int vector1 []= new int [4];
	int vector2 []= new int [4];
	int vectorTotal []= new int [4];
	int suma=0;
	
	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Introduce los valores del primer vector");
	for(int i=0; i<4; i++){
		System.out.println("Introduce un número");
	vector1[i]=teclado.nextInt();
	suma=suma+vector1[i];
	}	
	
	System.out.println("Introduce los valores del segundo vector");
	
	for (int i=0; i<4; i++){
		System.out.println("Introduce un número");
		vector2[i]=teclado.nextInt();
		suma=suma+vector2[i];
		}
		
	}
	

}
