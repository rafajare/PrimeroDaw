import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String args[]) {

		int unidades;
		int totaloferta;
		int porcentaje;
		int producto1;
		int coste;
		double ahorro1;
		double ahorro2;


		Scanner teclado = new Scanner(System.in);

		System.out.println("introduzca número de unidades que desea");
		unidades = teclado.nextInt();

		producto1 = 3;
		coste = unidades * 3;

		System.out.println("el coste de cada unidad es :" + producto1 + "€");
		
		System.out.println("El coste total sin oferta  :" + coste + "€");

		totaloferta = (coste * 2) / 3;

		if (unidades > 3) {
		
			System.out.println("coste con la oferta del 3x2 es  : "
					+ totaloferta + "€");
		}

		porcentaje = (30 * coste) / 100;
		System.out.println("con el descuento del 30% es  :" + porcentaje + "€");

		if (totaloferta < porcentaje) {
			ahorro1 = coste- totaloferta;
			System.out.println("le recomendamos la oferta del 3x2");
			System.out.println("	Te ahorras :" + ahorro1 + "€");
		}

		if (porcentaje < totaloferta) {
			
			ahorro2 = coste - porcentaje;
			System.out.println("Le recomendamos la oferta del 30% del descuento");
			System.out.println("	Te ahorras :" + ahorro2 + "€");
		}

	}
}
