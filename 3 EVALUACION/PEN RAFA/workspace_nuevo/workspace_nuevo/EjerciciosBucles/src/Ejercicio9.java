import java.util.Scanner;


public class Ejercicio9 {

		public static void main (String args []){
			
			int edad;
			int media;
			int maximo=0;
			int minimo=0;
			int medio;
			int jubilados;
			int contador=1;
			int contadorJubilados=0;
			int contadorMenores=0;
			int suma=0;
			
					
			Scanner teclado= new Scanner (System.in);
			
			System.out.println("Introduce la edad");
			edad=teclado.nextInt();
			suma=suma+edad;
			
			while (edad>1) {
			
			suma=suma+edad;
			System.out.println("Introduce la edad");
			edad=teclado.nextInt();
			
			contador=contador+1;
			
			
			if (edad==1) {
				
				 maximo=edad;
				 minimo=edad;
				 
			}
			
			if (edad<minimo) {
				
				
				 minimo=edad;
				
			}
			
			if (edad>maximo){
				
				maximo=edad;
			}
				
			
			
			if (edad>65) {
				
				contadorJubilados=contadorJubilados+1;
				
			}
			 
			if (edad<18){
				
				contadorMenores=contadorMenores+1;
				
			}
			
			
			
		}
			
			media=suma/contador;
			
			System.out.println("La edad media es   :"+media);
			System.out.println("------------------------------------");
			System.out.println("Jubilados hay   :"+contadorJubilados);
			
			System.out.println("------------------------------");
			System.out.println("Menores hay   :"+contadorMenores);
		    
			System.out.println("---------------------------------");
			System.out.println("La edad maxima es "+ maximo);
			System.out.println("--------------------------------");
			System.out.println("La edad minima es   :" +minimo);
		
		}
}
