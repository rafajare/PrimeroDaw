package ejercicio2;

public abstract class Parque {

	private double km;
	private String nombre;
	private int numEspecies;
	
	public Parque(double km_,String nombre_,int numEspecies_){
		km=km_;
		nombre=nombre_;
		numEspecies=numEspecies_;
	}
	
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumEspecies() {
		return numEspecies;
	}
	public void setNumEspecies(int numEspecies) {
		this.numEspecies = numEspecies;
	}
	
	public String getInfo(){
		
		return "\n-----INFORMACI�N DEL PARQUE-----\nNombre: "+getNombre()+"\nExtensi�n: "+getKm()+"km cuadrados\nN�mero de especies: "+getNumEspecies();
	}
	
}