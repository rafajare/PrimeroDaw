import java.util.*;


public class Editorial {

	private HashMap <String,Publicacion> publicaciones;
	
	public Editorial(HashMap<String,Publicacion> publicaciones_){
		
		publicaciones= publicaciones_;
	
	}
	
	public Editorial(){
		publicaciones= new HashMap<String,Publicacion>();
	}

	
	public String buscarPublicacion(String ISBN){
		return publicaciones.get(ISBN).toString();
	
	}
	
	public void addPublicacion(Publicacion nuevaPublicacion){
		HashMap publicaciones=new HashMap();
		publicaciones.put(nuevaPublicacion.getIsbn(), nuevaPublicacion);
	}
	
	
	public void removePublicaicon(String isbn){
		
		publicaciones.remove(isbn);
	}
	
	public String toString(){
		
		String cadEditorial="";
		
		for(Iterator <String> it= publicaciones.keySet().iterator(); it.hasNext();){
			String clave_ISBN=(String)it.next();
			Publicacion p=(Publicacion)publicaciones.get(clave_ISBN);
			cadEditorial=cadEditorial+p.toString()+"|n";
		}
		return cadEditorial;
	}
}	

