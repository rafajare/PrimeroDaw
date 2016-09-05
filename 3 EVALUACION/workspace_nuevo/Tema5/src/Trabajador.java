

public class Trabajador {

//atributos	
	
	 private String Nombre;
	 private String DNI;
	 private int Antiguedad;
	 private int Salario;
	 private String Departamento;
	
// constructores
	 
	public Trabajador(String valorNombre, String valorDNI, int valorAntiguedad, int valorSalario, String valorDepartamento){
		Nombre=valorNombre;
		DNI=valorDNI;
		Antiguedad=valorAntiguedad;
		Salario=valorSalario;
		Departamento=valorDepartamento;
	}
	
	//METODOS
	
	
	
	public String getNombre(){
		return Nombre;

		
	}
	public String getDNI(){
		return DNI;
		
	}
	public int getAntiguedad(){
		return Antiguedad;
		
	}
	public int getSalario(){
		
		return Salario;
	}
	public String getDepartamento(){
		return Departamento;
		
	}
	public String toString(){
		String Trabajador=DNI+" "+Nombre+" "+Antiguedad+" "+Departamento;
		return Trabajador;
	}
	
	
}//FIN
