import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicio_6 {	
		public static void main (String args[]){
			
		
	
	// LEER FICHERO
	Scanner in = null;
	PrintWriter out = null; 
	
	try{
		in = new Scanner(new FileReader("preciosSinIVA.txt"));
		String productos;
		int precios;
		double precioIVA;
		
		while(in.hasNext()){
			productos=in.next();
			precios=in.nextInt();
			precioIVA = precios*1.21;
			out.println(productos+" " +precioIVA);
			
		}// while
		
	}// fin try
	
	catch (Exception error) {
		System.out.println("Error:"+ error.getMessage());

	}/*catch*/ finally {
		if (in != null)
			in.close();
		
	}// finally
	
	
	
	
		}// main

}//class
