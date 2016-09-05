import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicio_3 {
	public static void main (String args[]){
		
		Scanner teclado=new Scanner(System.in);
		PrintWriter out = null; 
		int N=0;
		int numeros;
		
		System.out.println("Introduce el número de números");
		N=teclado.nextInt();
		try{
			out = new PrintWriter("fich3a.txt"); 
	
			for (int i=0;i<N;i++){
				System.out.println("Introduce los números del fichero 1");
				numeros=teclado.nextInt();
				out.println(""+ numeros);
				
			}
			out.close();
			
			out = new PrintWriter("fich3b.txt"); 
			
			for (int i=0;i<N;i++){
				System.out.println("Introduce los números del fichero 2");
				numeros=teclado.nextInt();
				out.print(""+ numeros + " ");
				
			}
			out.close();
		
		} catch (Exception error) {
			System.out.println("Error:"+ error.getMessage());

		} finally {
			if (out != null)
				out.close();
		}
		
	
	}
}
