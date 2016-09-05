
public class Autor {

	private String nombre;
	private int inicioContrato;
	private String DNI;
	

	public Autor(String nombre_,int inicioContrato_,String DNI_){
		
		setNombre(nombre_);
		setInicioContrato(inicioContrato_);
		setDNI(DNI_);
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public int getInicioContrato() {
		return inicioContrato;
	}


	public void setInicioContrato(int inicioContrato) {
		this.inicioContrato = inicioContrato;
	}
	
	public String toString(){
		String cadAutor="Nombre: "+nombre+"\n"+
						 "DNI: "+DNI+"|n"+
						 "InicioContrato: "+inicioContrato+"|n";
		return cadAutor;
	}
	
}