
public abstract class Instrumento {


	private String nombre;


	
	public Instrumento(String nombre) {
		this.nombre = nombre;
	}
	
	

	abstract public void tocar();
	
	
	public String getNombre(){
		return nombre;
	}
	
}
