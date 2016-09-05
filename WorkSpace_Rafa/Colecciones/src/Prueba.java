
import java.util.*;

public class Prueba {

	public static void main(String[] args) {

		Autor a1 = new Autor("Raul", 1901, "9j98v54532");
		Autor a2 = new Autor("Raul22", 1922, "9j32432532");

		Autor a3 = new Autor("Raul33", 1933, "9j98fadsf32");
		Autor a4 = new Autor("Raul44", 1944, "9j985v34532");

		Publicacion p1 = new Publicacion("Publicacion1", 1990, "isbn1");
		p1.addAutor(a1);
		p1.addAutor(a2);

		
		Publicacion p2 = new Publicacion("Publicacion2", 1990, "isbn2");
		p2.addAutor(a3);
		p2.addAutor(a4);
		
		Editorial editorial = new Editorial();
		editorial.addPublicaciones(p1);
		editorial.addPublicaciones(p2);
		
		System.out.println("Antes de borrar");
		System.out.println(editorial.toString());
		
		System.out.println("Despues de borrar");
		editorial.removePublicaciones(p1.getIsbn());
		System.out.println(editorial.toString());
		
		
		
		
	}

}