import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String args[]){
		Scanner in = null;
		try {
			in = new Scanner(new FileReader("fich2.txt"));
			String cadena = "";
			String cadenaMinuscula = "";

			while (in.hasNext()) {
				cadena = in.next();
				cadenaMinuscula = cadena.toLowerCase();
				System.out.println("" + cadenaMinuscula);
			}
		} catch (Exception error) {
			System.out.println("Error:"+ error.getMessage());

		} finally {
			if (in != null)
				in.close();
		}

	}
}
