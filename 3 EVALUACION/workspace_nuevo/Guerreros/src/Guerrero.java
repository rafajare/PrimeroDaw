
public  abstract class Guerrero {
	
	private String nombre;
	private int edad;
	private int fuerza;
	private boolean herido;
	private boolean muerto;
	

	public Guerrero(String nombre,int edad,int fuerza){
	this.nombre=nombre;
	herido=false;
	muerto=false;
	
	if(comprobaredad(edad)){
		this.edad=edad;
	}else{
		this.edad=25;
	}//IF
		
	if(comrpobarfuerza(fuerza)){
		
	}else{
		
	}//IF
	
	}
	
	public Guerrero(){
		this.nombre="GuerreroX";
		this.edad=15;
		this.fuerza=1;
	}
	public Guerrero(Guerrero warrior,String nombre)
	
	
	public  int getEdad(){
		return edad;
	}
	
	public void setBonificacion(int edad){
		this.edad=edad;
	}
	
	public abstract void retirarse();
}
