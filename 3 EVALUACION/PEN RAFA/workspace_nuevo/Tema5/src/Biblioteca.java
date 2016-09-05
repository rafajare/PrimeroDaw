import java.util.*;
import java.io.*;

public class Biblioteca {

	private Usuario[] usuarios;
	private Libro[] libros;
	private  Prestamo[] prestamos;
	
	public Biblioteca() throws FileNotFoundException{
		
		Scanner in = new Scanner(new FileReader("biblioteca.txt"));
		
		String cadenaString;
		int numero=0;
		int numprestamo;
		 String titulo;
		String autor;
		 int anyo;
		String editorial;
		 String isbn;
		int i=0;
		
			in.next();
			numero=in.nextInt();
			numprestamo=numero;
			in.next();
			numero=in.nextInt();
			libros = new Libro[numero]; 
			in.next();
			numero=in.nextInt();
			usuarios = new Usuario[numero]; 
			
			
			in.nextLine();
			in.nextLine();
			in.nextLine();
			in.useDelimiter(";"); 
		
		
			titulo=in.next();
			
		while(titulo.contains("Prestamos")==false){
			
			autor=in.next();
			
			anyo=in.nextInt();
			editorial=in.next();
			isbn=in.next();
			Libro l1 = new Libro(titulo,autor,anyo,editorial,isbn);
			libros[i]=l1;
		
			i++;
			titulo=in.next();
		}
		
		/*for (int c = 0; c < libros.length; c++) {
			
			if(libros[c]!=null){
				System.out.println(libros[c].toString());
			}
		}*/
		
		in.nextLine();
		
		while(in.hasNext()){
			System.out.println("---------------------");
			System.out.println("----USUARIO----------");
			System.out.println("---------------------");
			String lineausuario = in.nextLine();
			Scanner inusuario = new Scanner(lineausuario);
			inusuario.useDelimiter(";");
			int e=0;
			 String nombre=inusuario.next();
			 System.out.println("	nombre: "+nombre);
			 String dni=inusuario.next();
			 System.out.println("	dni: "+dni);
			 String direccion=inusuario.next();
			 System.out.println("	direccion: "+direccion);
			 int num_prestamos=inusuario.nextInt();
			 prestamos = new Prestamo[10];
			 
			 	
				int id;
				Libro libro=null;
				String titlibro;
				String fecha_inicio;
				String fecha_fin;
				boolean sanction;
				String estado;
				
				System.out.println("---------------------");
				System.out.println("----PRESTAMOS--------");
				System.out.println("---------------------");
				
				
			for (int j = 0; j < num_prestamos; j++) {
				System.out.println("	*prestamo: "+j);
				
				String lineaprestamo = in.nextLine();
				Scanner inprestamo = new Scanner(lineaprestamo);
				inprestamo.useDelimiter(";");
				id = inprestamo.nextInt();
				System.out.println("	id: "+id);
				titlibro=inprestamo.next();
				
				System.out.println("	titlibro: "+titlibro);
				for (int c = 0; c < libros.length; c++) {
					
					if(libros[c]!=null && libros[c].getTitulo().contains(titlibro)){
						libro=libros[c];
						
					}
				}
				fecha_inicio=inprestamo.next();
				System.out.println("	fecha_inicio: "+fecha_inicio);
				fecha_fin=inprestamo.next();
				System.out.println("	fecha_fin: "+fecha_fin);
				if(inprestamo.next().equals("+")){
					sanction=true;
				}else{
					sanction=false;
				}
			//	System.out.println(sanction);
				estado=inprestamo.next();
			//	System.out.println(estado);
				Prestamo p1 = new Prestamo(id,libro,fecha_inicio,fecha_fin,sanction,estado);
				//System.out.println(p1.toString());
				prestamos[j]=p1;
				
			
			}
			
			Usuario u1 = new Usuario(nombre,dni,direccion,prestamos);
			
			
			 usuarios[e]=u1;
			 e++;
			
			 
		}
		
			/*for (int h = 0; h < usuarios.length; h++) {
				
			
			 System.out.println(usuarios[h]);
			 }*/
			/* for (int k = 0; k < libros.length; k++) {
				 System.out.println(libros[i]);	
			 }*/
	}//bibliotetca
	
	//metodos
	
	public void altaUsuario(Usuario usuario_){
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i]!=null){
			usuarios[i] = usuario_;	
			}
		}
		
	}
	public void bajaUsuario(int dni_){
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i].getdni()==dni_){
			usuarios[i] = null;	
			}
		}
	}
	public void altaLibro(Libro libro_){
		for (int i = 0; i < libros.length; i++) {
			if(libros[i]==null){
			libros[i] = libro_;	
			}
		}
	}
	public int getNumPrestamosActivos(){
		 int numPrestamosActivos = 0;
	        for (int j = 0; j < usuarios.length; j++) {
	            if (usuarios[j] != null) {
	                Prestamo[] prestamosActivos = usuarios[j].getPrestamosActivos();
	                for (int i = 0; i < prestamosActivos.length; i++) {
	                    if (prestamosActivos[i] != null) {
	                        numPrestamosActivos++;
	                    }
	                }
	            }
	        }
	        return (numPrestamosActivos);
	}
	public int getNumPrestamosSanciones(){
		  int numPrestamosSanciones = 0;
	        for (int j = 0; j < usuarios.length; j++) {
	            if (usuarios[j] != null) {
	                Prestamo[] prestamosSancionados = usuarios[j].getPrestamosSancionados();
	                for (int i = 0; i < prestamosSancionados.length; i++) {
	                    if (prestamosSancionados[i] != null) {
	                        numPrestamosSanciones++;
	                    }
	                }
	            }
	        }
	        return (numPrestamosSanciones);
	}
	
	public Usuario getUsuario(int valor_dni) {
		//String valordni = String.valueOf(vdni);
		int valori=0;
		boolean encontrado=false;
		for (int i=0; i < usuarios.length; i++) {
			if(usuarios[i]!=null){
				if(usuarios[i].getdni()==(valor_dni)){
					valori=i;
					encontrado=true;
				}
			}
		}
		if(encontrado==true){
	return usuarios[valori];
		}else{
			return null;
		}
		
	}
	public Libro getLibro(String visbn) {
		boolean encontrado=false;
		int valori=0;
		for (int i=0; i < libros.length; i++) {
			if(libros[i]!=null){
				if(libros[i].getIsbn().equals(visbn)){
					valori=i;
					encontrado=true;
				}
			}
		}
		if(encontrado==true){
			return libros[valori];
				}else{
					return null;
				}
	}
	public String histograma(){
	
		String cadena="";
		
		for (int i = 0; i < 10; i++) {
			cadena=cadena+"usuarios con "+i+" prestamos: ";
			for (int j = 0; j < usuarios.length ; j++) {
				cadena=cadena+"*";
			}
			cadena=cadena+"\n";
		}
		return cadena;
	}
	public void guardar() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("bb.txt");
		out.println("last_id_prestamos 0");
		out.println("Num_max_libros 50");
		out.println("Num_max_usuarios 50");
		out.println("Libros:");
		out.println("----------------");
		for (int i = 0; i < libros.length; i++) {
			out.println(libros[i]);
		}
		out.println("Prestamos:");
		out.println("-------------;");
		for (int z = 0; z < usuarios.length; z++) {
			out.println(usuarios[z].toString());
			/*for (int j = 0; j < usuarios[z].getNumprestamos(); j++) {
				out.println(prestamos[j].toString());
			}*/
		}
		out.close();
		System.out.println("Se ha escrito en el fichero");
	}
}
