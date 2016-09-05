import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String args[]){
		Scanner in = null;
		try {
			in = new Scanner(new FileReader("fich1.txt"));
			String cadena = "";
			String cadenaMayucula = "";

			while (in.hasNext()) {
				cadena = in.next();
				cadenaMayucula = cadena.toUpperCase();
				System.out.println("" + cadenaMayucula);
			}
		} catch (Exception error) {
			System.out.println("Error:"+ error.getMessage());

		} finally {
			if (in != null)
				in.close();
		}

	}
}
