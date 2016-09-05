import java.util.Scanner;


public class Ejercicio6 {

	public static void main (String args[]){
		
		String vectorNombre[]=new String [5];
		int vectorSueldo []=new int [5];
		int i=0;
		Scanner teclado=new Scanner (System.in);
		int max = vectorSueldo[0];
		
		for (i=0; i<5; i++){
		System.out.println("Introduce el nombre del operario");
		vectorNombre[i]=teclado.next();
		System.out.println("Introduce el sueldo del operario");
		vectorSueldo[i]=teclado.nextInt();
		}
		
		if (vectorSueldo[i]>max){
			max=vectorSueldo[i];
	}
		
		System.out.println("El sueldo mayor es" + max);	
			System.out.println("El operario con mayor sueldo es "+ vectorNombre[i]);
	}
	
}
