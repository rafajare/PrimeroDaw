import java.util.ArrayList;


public class Prueba {
	public static void  main (String args[]){

	

		Autor autor1=new Autor("Luis",1990,"7575757H");
		Autor autor2=new Autor("Luis",1990,"7575757H");
		Autor autor3=new Autor("Luis",1990,"7575757H");
		Autor autor4=new Autor("Luis",1990,"7575757H");
	
	
		Publicacion p1 = new Publicacion("Publicacion1",1900,"isbn1");
	
		p1.addAutor(autor1);
		p1.addAutor(autor2);
		
		ArrayList<Autor>listaAutores=new ArrayList<Autor>();
		listaAutores.add(autor3);
		listaAutores.add(autor4);
		Publicacion p2= new Publicacion("Publicacion2",1990,"isbn2");
		
	
	}	
}