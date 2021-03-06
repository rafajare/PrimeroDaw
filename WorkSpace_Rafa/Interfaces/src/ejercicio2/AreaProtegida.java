package ejercicio2;

public class AreaProtegida extends Parque implements Visitable{

	private String ong;
	private double subvencion;
	
	public AreaProtegida(double km_, String nombre_, int numEspecies_,String ong_,double subvencion_){
		super(km_,nombre_,numEspecies_);
		ong=ong_;
		subvencion=subvencion_;
	}

	public String getOng() {
		return ong;
	}

	public void setOng(String ong) {
		this.ong = ong;
	}

	public double getSubvencion() {
		return subvencion;
	}

	public void setSubvencion(double subvencion) {
		this.subvencion = subvencion;
	}
	
	public String visitar(){
		return "Visitando �rea protegida "+getNombre();
	}
	
	public String toString(){
		return super.getInfo() + "\nONG a cargo: "+getOng()+"\nSubvenci�n recibida: "+getSubvencion()+"euros.";
	}
	
}