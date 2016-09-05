
import java.util.Scanner;

public class Ejercicio{

	public static void main (String args[]){
		
		double nota;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la nota del examen");
		nota=teclado.nextDouble();
		
		if (nota>=5) {
			       System.out.printf("El examen está aprobado",nota);
			       } 
		
		     else  { System.out.printf("El examen está suspendido");
		
		           }	
	      }
	
}