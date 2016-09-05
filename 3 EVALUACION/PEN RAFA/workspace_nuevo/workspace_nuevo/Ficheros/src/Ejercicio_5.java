import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio_5 {
	public static void main (String args[]){

		Scanner in = null;
		
		try{
			in = new Scanner(new FileReader("num_enteros.txt"));
			int num=0;
			int suma=0;
			int contador=0;
			
			while (in.hasNext()){
				num=in.nextInt();
				contador=contador+1;
				suma=suma+num;
				System.out.println(num);
				
			}// while
		
			System.out.println("________________");
			System.out.println("Se han leido un total de "+ contador+" números");
			System.out.println("________________");
			System.out.println("La suma total del fichero es "+ suma );
			
			
		}// try 
		
		
		
		catch (Exception error) {
			System.out.println("Error:"+ error.getMessage());

		}/*catch*/ finally {
			if (in != null)
				in.close();
		}// finally
		
		
		
		
		
	}// main
}// class
