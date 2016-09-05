import java.util.Scanner;


public class Ejercicio1 {
 
	public static void main (String args[]) {
	
	int elementos []= new int [8];
	int mayores36;
	int mayores50;
	int contador36=0;
	int contador50=0;
	int suma=0;


	Scanner teclado = new Scanner (System.in);
	
	for (int i=0; i<8; i++){
		System.out.println("Introduce un numero");
		elementos[i]=teclado.nextInt();
		suma=suma+elementos[i];
	}
		
	
	for (int i=0; i<8;i++){
		
		if (elementos[i]>36){
			contador36=contador36+1;
			
		}	
		
		if (elementos[i]>50){
			contador50=contador50+1;
		
			
		}
	}
	
	System.out.println ("El valor de todos es  "+ suma);
	System.out.println("El valor de todos los elementos mayores de 36 es "+ suma);
	System.out.println("Hay "+ contador50 +" elementos mayores de 50");	
		
	
	
	
		}
	}
	
		

	

