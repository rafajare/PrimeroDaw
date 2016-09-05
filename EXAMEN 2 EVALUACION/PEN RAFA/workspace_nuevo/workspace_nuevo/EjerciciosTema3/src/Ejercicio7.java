import java.util.Scanner;


public class Ejercicio7 {

	public static void main (String args []){
		
		Scanner teclado= new Scanner (System.in);
		
		int n;
		System.out.println("Introduce el valor del vector");
		n=teclado.nextInt();
		System.out.println("---------------------");
		
		int vector [] = new int [n];
		int i=0;
		for (i=0; i<n; i++){
			System.out.println("Introduce el elemento");
			vector[i]=teclado.nextInt();
		}
		i=0;
		int min = vector[0];
		for (i=0; i<n; i++){
			if (vector[i] < min){
				min=vector[i];
			}
		}
		
		//min repetido
		int contador=0;
		
		for (i=0; i<n; i++){
			if (vector[i]==min){
				contador=contador+1;
			}
		}
		System.out.println("El elemento menor es el "+ min);
		System.out.println("---------------------");
				if (contador>=2){
					System.out.println("El elemento se repite");
				}
			}
	}
	

