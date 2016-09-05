import java.util.Scanner;


public class Ejercicio3{
	
	public static void main ( String args []) {
		
		int vectorA[]=new int [6];
		int vectorB[]=new int [6];
		int sumaA=0;
		int sumaB=0;
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Introduce las notas del curso 'A' ");
		System.out.println("------------------------------");
		for (int i =1; i<6; i++){
			System.out.println("Introduce la nota " + i);
			vectorA[i]=teclado.nextInt();
			sumaA=sumaA+vectorA[i];
		}
		
		System.out.println("Introduce las noas del curso 'B'");
		System.out.println("------------------------------");
		for (int i=1; i<6; i++){
			System.out.println("Introduce la nota "+ i);
			vectorB[i]=teclado.nextInt();
			sumaB=sumaB+vectorB[i];
		}
		
			if (sumaA >sumaB ){
				System.out.println("EL mayor promedio es de la clase 'A'");
			}
			if (sumaB > sumaA){
				System.out.println("EL mayor promedio es de la clase 'B'");
			}
			}
}

