import java.util.Scanner;


public class Ejercicio2 {
	public static void main (String args[]){

		Scanner teclado=new Scanner (System.in);
		
		
		int vector []= new int [9];
		int contador=0;
		int max=0;
		int i=0;
		
		
		for (i=0; i<9;i++){
			System.out.println("Introduce el número");
			vector[i]=teclado.nextInt();	
		
			if (i==0){
				vector[i]=max;
			}
		
			if (vector[i]>max){
				max=vector[i];
			} 
		}
		
		for (i=0; i<9;i++){
			if (vector[i]==max){
				contador++;
			}// for

		} //for

	System.out.println("El número mayor es  "+ max);
	System.out.println("Esta repetido "+ contador + " veces");
	
	
	
	}


}
