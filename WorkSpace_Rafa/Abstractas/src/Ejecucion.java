

public class Ejecucion {

	public static void main(String[] args) {
		

		GuitarraElectrica GuitarElectric = new GuitarraElectrica("Guitarra", 6);
		BajoElectrico DownElectric = new BajoElectrico("Bajo", 4);
		
		GuitarElectric.tocar();
		DownElectric.tocar();
		
	}

}
