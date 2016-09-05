
public class Circulo {
	// ATRIBUTOS
	
	public double radio;
	
	// METODOS
	
	public void asignaRadio(double valor){
		radio=valor;
	}
	
	public double daRadio(){
		return radio;
	}
	
	public double longitud(){
		double longitud=(2*3.14*radio);
		return longitud;
	}
	
	public double area(){
		double area=3*.14*radio*radio;
		return (area);
		
	}
	
	

}
