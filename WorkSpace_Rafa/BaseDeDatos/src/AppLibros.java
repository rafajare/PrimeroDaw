
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AppLibros {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection prueba=Conexion.createConexion();
		Connection prueba1=Conexion.getConexion();
		try {
			Statement tt=prueba.createStatement();
			Statement tt1=prueba1.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Conectado....o no");
		Libros tengo = new Libros();
		tengo.setAutor("Miguel Garcia");
		tengo.setGenero("Policiaco");
		tengo.setPrecio(25.50);
		tengo.setTitulo("La amenaza de Java");
		tengo.grabarRegistro(tengo);

		Libros grabados = new Libros(1);
		System.out.println(grabados.toString());	
		tengo.listarRegistro();
		while (!tengo.eof){
			System.out.println(tengo.toString());
			tengo.next();
		}
		
	}

}