
public class Calculadora {
	
	// ATRIBUTOS
	private int n1;
	private int n2;
	private int operacion=0;
	
	
	// CONSTRUCTOR
	
	public Calculadora(int valor1, int valor2){
		n1=valor1;
		n2=valor2;
	}

	// METODOS
	
	public void suma(){
		 operacion=n1+n2;
	}
	
	public void resta(){
	  operacion=n1-n2;
	}
	
	public void division(){
		 operacion=n1/n2;
	}
	
	public void multipliacion(){
		 operacion=n1*n2;
	}
	
	public int printValores(){
		return operacion;
	}

	
	
	
}// CLASS
