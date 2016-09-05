import java.util.*;
import java.io.*;
public class Gestor {

	//metodos
	
	public static int menu(Scanner tec){
		
			
		System.out.println("***********	MENU	PRINCIPAL	***********");
		System.out.println ("1.Número de trabajadores");
		System.out.println("2.Buscar datos de un trabajador");
		System.out.println("3.Añadir un	trabajador");	
		System.out.println("4.Borrar un	trabajador");	
		System.out.println("5.Listar trabajadores");	
		System.out.println("6.Histograma");	
		System.out.println("0.Terminar");
		System.out.println("**************************************");
		
		System.out.println("Elige una opcion");
		int opcion=tec.nextInt();
		return opcion;
	}//metodo

	public static void main(String[] args) throws FileNotFoundException{
		
		Empresa e1= new Empresa ("Empresa1", 5);/* Objeto */ 
		Scanner teclado = new Scanner (System.in);
		int opcionUsuario;
		
		do{
				opcionUsuario=menu(teclado);
				
				switch(opcionUsuario){
				
		case 1:
			System.out.println("1. Número de trabajadores");
			System.out.println(e1.getNumTrabajadores());
				break;
		case 2:
			System.out.println("2.Buscar datos de un trabajador");
			System.out.println("Introduzca el dni del trabajador");
			int dni=teclado.nextInt();
			if(e1.existeEmpleado (dni)==true){
				System.out.println(e1.getInfoEmpleado(dni));
			}//IF
				
			else{
					System.out.println("ERROR AL ENCONTRAR EL TRABAJADOR");
					
				
			}// ELSE
			
		break;
		
		case 3:
			System.out.println("3. Añadir un trabajador");
			System.out.println("Introduzca el nombre");
			String nombre=teclado.next();
			System.out.println("Introduzca el DNI");
			String DNI=teclado.next();
			System.out.println("Introduzca la antiguedad");
			int antiguedad=teclado.nextInt();
			System.out.println("Introduzca el sueldo");
			int sueldo=teclado.nextInt();
			System.out.println("Introduzca el departamento");
			String departamento=teclado.next();
			
			Trabajador t1= new Trabajador(nombre,DNI,antiguedad,sueldo,departamento);
			e1.anyadirEmpleado(t1);
			break;
			
		case 4:
			System.out.println("4. Borrar empleado");
			System.out.println("Introduce el DNI");
			dni=teclado.nextInt();
			if(e1.existeEmpleado(dni)==true){
				System.out.println(e1.cancelarEmpleado(dni));
			} else {
				System.out.println("ERROR AL ENCONTRAR EL TRABAJDOR");
			}
			
			
			
			break;
		case 5:
			System.out.println("5.Mostrar empelados");
			System.out.println(e1.listarEmpleados());
			
			break;
		case 6:
			System.out.println("6. Histograma");
			System.out.println(e1.toHistograma());
			
			break;
		case 0:
			PrintWriter fich = null;
			e1.guardar(fich);
	
		}//SWITCH
				
		}/*DO*/ while(opcionUsuario!=0);
		
		
					
		
	}//metodo
	

}//FIN
