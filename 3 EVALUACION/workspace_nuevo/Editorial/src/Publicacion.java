
import java.util.*;


public class Publicacion{
	
	private String titulo;
	private int Anyo;
	private String ISBN;
	private ArrayList <Autor> autores ;
	
	
	
	public Publicacion(String titulo_,int Anyo_,String ISBN_) {
		
		
	titulo=titulo_;
	Anyo=Anyo_;
	ISBN=ISBN_;	
	autores= new ArrayList <Autor>();
	
	}
	
	public Publicacion(String titulo_,int Anyo_,String ISBN_, ArrayList<Autor>autores_) {
		
		
		titulo=titulo_;
		Anyo=Anyo_;
		ISBN=ISBN_;	
		autores= autores_;
		
		}

public void addAutor(Autor autor){
	
		autores.add(autor);
	}

public String toString(){
	
	String cadPub="Titulo: "+titulo+"\n"+
					"Anyo: "+ Anyo+"\n"+
					"isbn:" + ISBN+"\n";
	
	for(Autor autor: autores){
			cadPub=cadPub+" "+autor.toString();
	
	}
	
	return cadPub;
	}
	public String getIsbn(){
		return ISBN;
	}
}
