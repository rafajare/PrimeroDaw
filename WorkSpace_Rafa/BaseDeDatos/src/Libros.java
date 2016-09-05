
import java.sql.*;

public class Libros {

	private int idLibro;
	private String titulo;
	private String genero;
	private String autor;
	private double precio;

	Statement sql;
	private ResultSet rs;

	public boolean error = false;
	public boolean eof = false;
	Connection miConexion;

	
	

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double d) {
		this.precio = d;
	}
	

	
	
	
	
	
	
	
	//CONSTRUCTORES
	public Libros() {
	}

	public Libros(int numero) {
		leerRegistro(numero);
	}
	//CONSTRUCTORES

	
	
	
	
	
	
	//BORRAR REGISTRO
	public void borrarRegistro(int numero) {
		miConexion = Conexion.getConexion();
		String sentencia = "DELETE FROM Libros WHERE idLibro=" + numero;
		error = false;
		try {
			sql = miConexion.createStatement();
			sql.executeUpdate(sentencia);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//BORRAR REGISTRO
	
	
	//LISTAR REGISTRO
	public boolean listarRegistro() {
		return listarRegistro("");
	}

	public boolean listarRegistro(String where) {
		miConexion = Conexion.getConexion();
		eof = false;
		String sentencia = "SELECT * FROM Libros ";
		if (where.length() > 0) {
			sentencia += " WHERE " + where;
		}
		try {
			sql = miConexion.createStatement();
			rs = sql.executeQuery(sentencia);
			if (rs.next()) {
				carga(rs);
			} else
				eof = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eof;
	}

	public boolean next() {
		try {
			if (rs.next()) {
				carga(rs);
				eof = false;
			} else
				eof = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eof;
	}

	public boolean first() {
		try {
			if (rs.first()) {
				carga(rs);
				eof = false;
			} else
				eof = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eof;
	}

	public boolean previous() {
		try {
			if (rs.previous()) {
				carga(rs);
				eof = false;
			} else
				eof = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eof;
	}

	public boolean last() {
		try {
			if (rs.last()) {
				carga(rs);
				eof = false;
			} else
				eof = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eof;
	}
	//LISTAR REGISTRO

	
	
	
	
	
	
	
	
	//TO STRING
	public String toString() {
		return "IdLibro:" + idLibro + "\tTitulo:" + titulo + "\tAutor:" + autor;

	}
	//TO STRING
	
	
	
	
	
	
	
	
	
	
	public void leerRegistro(int numero) {
		ResultSet rs;
		miConexion = Conexion.getConexion();
		error = false;
		try {
			sql = miConexion.createStatement();
			rs = sql.executeQuery("SELECT * FROM Libros WHERE idLibro="
					+ numero);
			if (rs.next()) {
				carga(rs);
			} else
				error = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
	
	
	
	
	
	private void carga(ResultSet rs) {
		try {
			idLibro = rs.getInt("idLibro");
			titulo = rs.getString("Titulo");
			autor = rs.getString("Autor");
			precio = rs.getDouble("Precio");
			genero = rs.getString("Genero");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//====================CARGA========================================
	
	
	
	
	
	
	//====================GRABAR REGISTRO========================================
	public void grabarRegistro(Libros libro) {
		String sentencia;
		sentencia = "INSERT INTO Libros" + "(Titulo,Autor,Genero,Precio) "
				+ " VALUES (" + "'" + titulo + "'," + "'" + autor + "'," + "'"
				+ genero + "'," + precio + ")";
		System.out.println(sentencia);
		try {
			miConexion = Conexion.getConexion();
			sql = miConexion.createStatement();
			sql.executeUpdate(sentencia);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//LOS METE EN UN ARRAY
	public Object[] toArray() {
		Object[] sal = new Object[5];

		try {
			sal[0] = rs.getObject("idLibro");
			sal[1] = rs.getObject("Titulo");
			sal[2] = rs.getObject("Autor");
			sal[3] = rs.getObject("Precio");
			sal[4] = rs.getObject("Genero");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sal;
	}
	

	
	
	
	
	
	
	
	public void modificarRegistro(int idLibro, String titulo){
		
	}
	


}
