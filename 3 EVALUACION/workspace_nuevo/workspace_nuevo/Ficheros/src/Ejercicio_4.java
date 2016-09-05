import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		PrintWriter out = null;
		int numPalabras = 0;
		int contador_ = 0;
		

		System.out.println("¿Cuantas palabras va a introducir?");
		numPalabras = teclado.nextInt();
		String palabras[] = new String[numPalabras];

		try {
			out = new PrintWriter("fich4.txt");

			for (int i = 0; i < numPalabras; i++) {

				System.out.println("Introduce las palabras");
				palabras[i] = teclado.next();
				out.println( palabras[i]);
				out.println( "");

			}// for
			out.close();

		}// try
		catch (Exception error) {
			System.out.println("Error:" + error.getMessage());

		} finally {
			if (out != null)
				out.close();

		}// finally

	}// main

}// class

