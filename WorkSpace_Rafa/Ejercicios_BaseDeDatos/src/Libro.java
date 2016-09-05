import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class Libro {
	
	private int idLibro;
	private String titulo;
	private String genero;
	private String autor;
	private Double precio;
	private Statement sql;
	private ResultSet rs;
	private Connection miConexion;
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Statement getSql() {
		return sql;
	}
	public void setSql(Statement sql) {
		this.sql = sql;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	public Connection getMiConexion() {
		return miConexion;
	}
	public void setMiConexion(Connection miConexion) {
		this.miConexion = miConexion;
	}
	
	
	public Libro(){
		
	} //CONSTRUCTOR
	
	public Libro (int numero){
		
		//id libro
		
	}
	
	public void createConexion(){
		
		String driver = "org.postgresql.Driver";
		String connectString = "jdbc:postgresql://localhost:5432/nombreBD";
		String user = "postgres";
		String password = "tonphp";
		
         try{
            Class.forName(driver);
            Connection miConexion=(Connection) DriverManager.getConnection(connectString,user,password);
            Statement consulta=(Statement) miConexion.createStatement();
           

         } catch(Exception e){
        	 System.out.println(e.toString());
         }
	} //FIN CONEXION
	
	public void closeConexion(){
		try {
			miConexion.close();
			}catch(SQLException e){
	        	 e.printStackTrace();
	             JOptionPane.showMessageDialog(null,"error al cerrar conexion");                              
			}
		}//FIN CERRAR CONEXION 

	public void borrarRegistro(int numero){
		int id=numero;
		
		//createConexion();
		String driver = "org.postgresql.Driver";
		String connectString = "jdbc:postgresql://localhost:5432/ventaentradas";
		String user = "postgres";
		String password = "tonphp";
		
         try{
            Class.forName(driver);
            Connection connect=(Connection) DriverManager.getConnection(connectString,user,password);
            Statement consulta=(Statement) connect.createStatement();
            consulta.executeUpdate("delete from tabla where id='"+id+"'");
           

         } catch(Exception e){
        	 System.out.println(e.toString());
         }

	}//FIN BORRARREGISTRO
	
	public String listarRegistro(String listar){
		
		createConexion();
		Statement consulta;
		//listar=consulta.executeUpdate("SELECT * FROM tabla where (condicion) values());

		
		return listar;
	}//FIN LISTARREGISTRO
	
	public String toString(String titulo){
		
		createConexion();
		String titulo_=titulo;
		String informacion = null;
		Statement consulta;
		//inforamcion = consulta.executeQuery("SELECT idLibro, titulo, autor FROM tabla where titulo ='"+titulo_+"''");
		return informacion;
	}

	}// FIN CLASE
