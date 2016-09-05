import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String args[]) {

		String vehiculo;
		int mediaHora;
		int hora;
		boolean tiempo;

		Scanner teclado = new Scanner(System.in);
		System.out.println("vehiculo a elegir");
		vehiculo = teclado.nextLine(); 
		System.out.println("vehiculo: "+vehiculo);
		System.out.println("Quiere alquilar por fracción de media hora? :");
		tiempo = teclado.nextBoolean();

		if (tiempo) {
			
			System.out.println("introduzca tiempo de medias horas :");
			mediaHora = teclado.nextInt();


			if (vehiculo.equals("Patin de pedales")) {
				System.out.println("Total a pagar :" + (mediaHora * 1));

			} else {

				if (vehiculo.equals("Patín a motor")) {
					System.out.println("total a pagar es: " + (mediaHora * 3));

				}

				if (vehiculo.equals("Tabla de windsurf")) {
					System.out.println("total a pagar es: " + (mediaHora * 2));

				}

				if (vehiculo.equals("Moto acuática")) {
					System.out.println("total a pagar es: " + (mediaHora * 3.5));
				}

			}
		} else {

			System.out.println("introduzca tiempo de horas");
			hora = teclado.nextInt();

			if (vehiculo.equals("Patin de pedales")) {
				System.out.println("Total a pagar :" + (hora * 2));

			} else {

				if (vehiculo.equals("Patín a motor")) {
					System.out.println("total a pagar es: " + (hora * 2));

				}

				if (vehiculo.equals("Tabla de windsurf")) {
					System.out.println("total a pagar es: " + (hora * 4));

				}

				if (vehiculo.equals("Moto acuática")) {
					System.out.println("total a pagar es: " + (hora * 7));
				}

			}

		}

	}

}
