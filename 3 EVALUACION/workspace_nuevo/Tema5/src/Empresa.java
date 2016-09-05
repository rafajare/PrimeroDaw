import java.io.*;
import java.util.Scanner;


public class Empresa {

	// ATRIBUTOS

	Scanner teclado = new Scanner(System.in);

	private String nombreEmpresa;
	private int antiguedadEmpresa;
	private int maxTrabajadores;
	private int numTrabajadores;
	private Trabajador[] trabajadores;

	/*
	 * Un constructor que lee del fichero “TrabajadoresEmpresa.txt” el número de
	 * trabajadores e inicializa el array/vector de trabajadores con la
	 * información de cada trabajador que aparece en el fichero.
	 */

	// CONSTRUCTORES

	public Empresa(String nombre_, int antiguedad) throws FileNotFoundException {

		nombreEmpresa = nombre_;
		antiguedadEmpresa = antiguedad;

		Scanner in = new Scanner(new FileReader("TrabajadoresEmpresa.txt"));

		maxTrabajadores = in.nextInt();
		in.nextLine();

		trabajadores = new Trabajador[maxTrabajadores];//IMPORTANTE 

		int i = 0;
		while (in.hasNext()) {

			String nombre = in.next();
			String DNI = in.next();
			int Antiguedad = in.nextInt();
			int Salario = in.nextInt();
			String Departamento = in.next();

			Trabajador t = new Trabajador(nombre, DNI, Antiguedad, Salario,Departamento);

			trabajadores[i] = t;
			i++;

		}// While

		numTrabajadores = i;

	}// constructor

	// METODOS

	public int getNumMáximoTrabajadores() {
		return maxTrabajadores;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;

	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void anyadirEmpleado(Trabajador e) throws FileNotFoundException {
		boolean existe = existeEmpleado(Integer.parseInt(e.getDNI()));//Se llama asi porque esta dentro de la clase
		if (existe == false && numTrabajadores != maxTrabajadores) {
			boolean insertado = false;
			for (int i = 0; i < trabajadores.length && insertado ==false; i++) {
				if (trabajadores[i] == null) {
					trabajadores[i] = e;
					numTrabajadores++;
					insertado = true;
				}
			}
		}
	}

	public String cancelarEmpleado(int numDni) {

		String mensaje = " ";
		boolean existe = existeEmpleado(numDni);
		boolean borrado = false;
		if (existe == true) {

			for (int i = 0; i < trabajadores.length && borrado == false; i++) {
				if (trabajadores[i].getDNI().equals(String.valueOf(numDni))) {
					trabajadores[i] = null;
					numTrabajadores--;
					mensaje = "Empleado borrado del sistema";
					borrado = true;
				}

			}

		} else {
			mensaje = "Imposible realizar la cancelacion";
		}
		
		return mensaje;
	}

	public Boolean existeEmpleado(int numDni) {
		
		String cadenaDni = String.valueOf(numDni);
		boolean encontrado = false;

		for (int i = 0; i < maxTrabajadores && encontrado == false; i++) {
			if (trabajadores[i] != null) {

				if (cadenaDni.equals(trabajadores[i].getDNI())) {
					encontrado = true;
				}

			}
		}

		return encontrado;
	}// metodo

	public String listarEmpleados() {
		String lista=" ";
		
	for(int i=0;i<trabajadores.length;i++){
			// lista=trabajadores.toString(); (METODO YA CREADO)
		if(trabajadores[i]!=null){
		lista=lista+trabajadores[i].toString()+"\n";
	
		}
	}
	
	return lista;
	
	
	}// metodo
	
	
	public int getIdEmpleado(int numDni){
		
		int posicion=1;
		boolean encontrado=false;
		String cadenaDni=String.valueOf(numDni);
		for (int i=0;i<trabajadores.length;i++){
			if(cadenaDni.equals(trabajadores[i].getDNI())){
				posicion=i;
				encontrado=true;
			}
		}
		return posicion;
	}//Metodo

	
	public String getInfoEmpleado(int numDni){
		
		int posicion=getIdEmpleado(numDni);
		//String cadenaInfo= trabajadores[posicion].toString();
		
		return trabajadores[getIdEmpleado(numDni)].toString();
		
	}//metodo
	
	
	public String toHistograma(){
		
		String cadenaHistograma="";
		
		int[] histograma = new int [antiguedadEmpresa+1] ;		
		
		for(int i=0; i<trabajadores.length;i++){
			if(trabajadores[i]!=null){
			histograma[trabajadores[i].getAntiguedad()]++;
			}
		}
		for(int i=0;i<histograma.length;i++){
			cadenaHistograma=cadenaHistograma+i+"años";
			for(int j=0; j<histograma[i];j++){
				cadenaHistograma=cadenaHistograma+"*";
			}
			cadenaHistograma=cadenaHistograma+"\n";
		}
		return cadenaHistograma;
	}//Metodo
	
	public void guardar(PrintWriter fich) throws FileNotFoundException{
		
		fich=new PrintWriter("TrabajadoresEmpresa.txt");
		fich.print(listarEmpleados());
		fich.close();
		System.out.println("FIN DEL PROGRAMA");
		
	}//Metodo
	
}// FIN
