package ejercicio2;

public class AreaProtegidaTerrestre extends AreaProtegida{

	private String terreno;

	public AreaProtegidaTerrestre(double km_, String nombre_, int numEspecies_,String ong_,double subvencion_,String terreno_){
		super(km_,nombre_,numEspecies_,ong_,subvencion_);
		terreno=terreno_;
	}
	
	public String getTerreno(){
		return terreno;
	}
	
	public void setTerreno(String terreno){
		this.terreno = terreno;
	}
	
	public String getInfo(){
		return super.getInfo() + "\nTipo de terreno: "+getTerreno();
	}
	
}
	