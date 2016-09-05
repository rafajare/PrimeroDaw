	import java.io.FileNotFoundException;
	import java.util.*;
public class GestorBiblioteca {

		
		
		public static int menu(Scanner tec){
			
			System.out.println("***********	MENU	PRINCIPAL	***********");
			System.out.println("1. Usuarios");
			System.out.println("2. Libros");
			System.out.println("3. Préstamos");
			System.out.println("4. Guardar");
			System.out.println("0.	Terminar");
			System.out.println("*******************************************");
			
			return tec.nextInt();	
		
		}//menu

		
		 public static int submenu(Scanner tec, int opcion) {
			 int subopcion = 0;
		        switch (opcion) {
		            case 1:
		                subopcion = submenuUsuario(tec);
		                break;
		            case 2:
		                subopcion = submenuLibros(tec);
		                break;
		            case 3:
		                subopcion = submenuPrestamos(tec);
		                break;
		        }
		        return subopcion;
		}
		public static int submenuUsuario(Scanner tec) {
			System.out.println("***********	MENU DE USUARIOS	***********");
			System.out.println("1. Alta usuario");
			System.out.println("2. Baja usuario");
			System.out.println("3. Información usuario");
			System.out.println("0. Terminar");
			System.out.println("*******************************************");
			 return (tec.nextInt());
		}
			
		public static int submenuLibros(Scanner tec) {
			System.out.println("***********	MENU DE LIBROS ***********");
			System.out.println("1. Alta libro");
			System.out.println("2. Baja libro");
			System.out.println("0. Terminar");
			System.out.println("*******************************************");
			 return (tec.nextInt());
		}
			
		public static int submenuPrestamos(Scanner tec) {
			System.out.println("***********	MENU DE PRESTAMOS	***********");
			System.out.println("1. Numero de prestamos activos");
			System.out.println("2. Numero de prestamo sancionados");
			System.out.println("3. Histograma de prestamos de un usuario");
			System.out.println("0. Terminar");
			System.out.println("*******************************************");
			 return (tec.nextInt());
			
		}
			
		
		
		
		public static void main(String args[]) throws FileNotFoundException{
			
			Biblioteca b = new Biblioteca();
	        Scanner in = new Scanner(System.in);

	        int subopcion = 0;
	        int opcion = 0;
	        do {
	            opcion = menu(in);
	            do {
	                switch (opcion) {
	                    //USUARIOS
	                    case 1:

	                        subopcion = submenu(in, opcion);
	                        switch (subopcion) {
	                            case 1://Alta usuario
	                                System.out.println("OpciÃ³n seleccionada: Alta usuario");
	                                System.out.println("Introduzca nombre:");
	                                String nombre = in.next();
	                                System.out.println("Introduzca dni:");
	                                String dni = in.next();
	                                System.out.println("Introduzca direcciÃ³n:");
	                                String direccion = in.next();
	                                Usuario u1 = new Usuario(nombre, dni, direccion);
	                                b.altaUsuario(u1);
	                                
	                                //EJEMPLOS PREDEFINIDOS
	                                //System.out.println("Alta usuario");
	                                //Usuario u1 = new Usuario("Elena", "18443546", "direccion");
	                                //System.out.println("Alta usuario");
	                                //Usuario u2 = new Usuario("Carlos", "18443544", "direccion");
	                                //b.altaUsuario(u1);
	                                //b.altaUsuario(u2);
	                                break;
	                            case 2://Baja usuario
	                                System.out.println("OpciÃ³n seleccionada: Baja usuario");
	                                System.out.println("Introduzca el dni del usuario:");
	                                int dniBaja = in.nextInt();
	                                b.bajaUsuario(dniBaja);
	                                
	                                //EJEMPLO PREDEFINIDO
	                                //b.bajaUsuario(18443544);
	                                break;
	                            case 3://InformaciÃ³n usuario
	                                System.out.println("OpciÃ³n seleccionada: Info usuario");
	                                System.out.println("Introduzca el dni del usuario:");
	                                int dniInfo = in.nextInt();
	                                Usuario u = b.getUsuario(dniInfo);
	                                if (u != null) {
	                                    System.out.println(u.toString());
	                                } else {
	                                    System.out.println("No existe el usuario");
	                                }
	                                //EJEMPLO PREDEFINIDO
	                                //Usuario u = b.getUsuario(18465678);
	                                //if (u != null) {
	                                //    System.out.println(u.toString());
	                                //} else {
	                                //    System.out.println("No existe el usuario");
	                                //}
	                                break;
	                            case 0://Terminar
	                                System.out.println("OpciÃ³n seleccionada: Salir del submenÃº usuario");
	                                System.out.println("Saliendo de usuario");
	                                break;
	                        }

	                        break;
	                    //LIBROS
	                    case 2:

	                        subopcion = submenu(in, opcion);
	                        switch (subopcion) {
	                            case 1:
	                                System.out.println("OpciÃ³n seleccionada: Alta Libro");
	                                System.out.println("Titulo:");
	                                String titulo = in.next();
	                                System.out.println("Autor:");
	                                String autor = in.next();
	                                System.out.println("Anyo:");
	                                int anyo = in.nextInt();
	                                System.out.println("Editorial:");
	                                String editorial = in.next();
	                                System.out.println("ISBN:");
	                                String isbn = in.next();
	                                
	                                Libro l = new Libro(titulo, autor, anyo, editorial, isbn);
	                                b.altaLibro(l);
	                                
	                                //EJEMPLO PREDEFINIDO
	                                //Libro l = new Libro("Titulo", "autor", 2015, "editorial", "isbnyy");
	                                //b.altaLibro(l);
	                                break;
	                            case 2:
	                                System.out.println("OpciÃ³n seleccionada: Info Libro");
	                                System.out.println("Introduzca el ISBN del libro:");
	                                String isbnInfo = in.next();
	                                Libro lib = b.getLibro(isbnInfo);
	                                if (lib != null) {
	                                    System.out.println(lib.toString());
	                                }else{
	                                    System.out.println("No existe el libro");
	                                }
	                                //Libro lib = b.getLibro("ISBNX");
	                                //if (lib != null) {
	                                //    System.out.println(lib.toString());
	                                //} else {
	                                //    System.out.println("No existe el libro");
	                                //}
	                                break;

	                            case 0:
	                                System.out.println("OpciÃ³n seleccionada: Salir del submenÃº Libros");
	                                break;
	                        }

	                        break;
	                    //PRESTAMOS
	                    case 3:

	                        subopcion = submenu(in, opcion);
	                        switch (subopcion) {
	                            case 1://Num prestamos activos
	                                System.out.println("Opción seleccionada: Número de préstamos activos");
	                                System.out.println("Num prestamos activos:"+b.getNumPrestamosActivos());
	                                break;
	                            case 2://Num prestamos sancionados
	                                System.out.println("Opción seleccionada: Número de prÃ©stamos sancionados");
	                                System.out.println("Num prestamos sancionados: "+b.getNumPrestamosSanciones());
	                                break;
	                            case 3://Histograma
	                                System.out.println("Opción seleccionada: Histograma");
	                                System.out.println(b.histograma());
	                                break;
	                            case 4://Nuevo prestamos
	                                System.out.println("Opción seleccionada: Nuevo Préstamo");
	                                System.out.println("Dni del usuario que va a realizar el prestamo");
	                                int dniPrestamo = in.nextInt();
	                                Usuario u = b.getUsuario(dniPrestamo);
	                                System.out.println("Isbn del libro que se va a prestar:");
	                                String isbnPrestamo = in.next();
	                                Libro l = b.getLibro(isbnPrestamo);
	                                Prestamo p = new Prestamo(l);
	                                u.addPrestamo(p);
	                                //EJEMPLO PREDEFINIDO
	                                //Usuario u = b.getUsuario(18443546);
	                                //Libro l = b.getLibro("ISBNX");
	                                //Prestamo p = new Prestamo(l);
	                                //u.addPrestamo(p);
	                                
	                                break;
	                            case 0://Terminar
	                                System.out.println("Opción seleccionada: salir del submenú préstamos");
	                                break;
	                        }

	                        break;
	                    //GUARDAR
	                    case 4:
	                        
	                        System.out.println("Guardando...");
	                        b.guardar();
	                        break;
	                    //SALIR
	                    case 0:
	                        
	                        System.out.println("Saliendo...");
	                        break;
	                }
	            } while (subopcion != 0);
	        } while (opcion != 0);
	    }
	}

