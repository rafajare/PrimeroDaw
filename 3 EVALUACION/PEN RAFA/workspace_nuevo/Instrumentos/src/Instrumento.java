
public abstract class Instrumento {

	private String nombre;
	
	public Instrumento(String n_){
		nombre=n_;
	}
	
	public Instrumento(){
		this("zzz");
	}
	
	
	public abstract void getTocar();


	
}
