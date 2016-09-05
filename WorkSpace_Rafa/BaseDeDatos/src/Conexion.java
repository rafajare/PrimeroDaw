
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conexion;

	
	
	public static Connection createConexion() {

		try {
			Class.forName("org.postgresql.Driver");
			try {
				conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gestorentradas", "postgres", "root");
				return conexion;
			} catch (SQLException e) {
				System.out.println("NO SE PUEDE REALIZAR LA CONEXION ");
			} // Fin catch.
		} catch (ClassNotFoundException e) {
			System.out.println("Error del controlador ");
		} // Fin catch.

		
		return conexion;
	}
	
	
	
	public static Connection getConexion(){
		
			createConexion();
		
			return conexion;
	}
	

	
	
	
	
}