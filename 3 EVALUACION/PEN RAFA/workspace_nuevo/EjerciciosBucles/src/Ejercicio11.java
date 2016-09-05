import java.util.Scanner;


public class Ejercicio11 {
	public static void main (String args []) {
		
		int numeros=0;
		int sueldo=0;
		int contador=0;
		int maximo=0;
		
		Scanner teclado = new Scanner (System.in);
		 
		System.out.println("Introduce el número de sueldos que desea calcular");
		 numeros=teclado.nextInt();
		
		 while (contador<numeros){
		
			 System.out.println("Introduce el sueldo");
			 sueldo=teclado.nextInt();
		  
		 
			 if(contador==0){
				 maximo=sueldo;
			 }
			 if(sueldo>maximo)
				 maximo=sueldo;
			 
			 contador=contador+1;
		 }
		 
		 System.out.println("El sueldo maximo es  :"+maximo);
		
		
	}

}
