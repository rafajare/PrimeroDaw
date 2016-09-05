
package gestionbiblioteca;


public class Usuario {

    private String nombre;
    private String dni;
    private String direccion;
    private int num_prestamos;
    private Prestamo[] prestamos;

    Usuario(String nombre_, String dni_, String direccion_) {
        nombre = nombre_;
        dni = dni_;
        direccion = direccion_;
        num_prestamos = 0;
        prestamos = new Prestamo[10];
    }

    Usuario(String nombre_, String dni_, String direccion_, Prestamo[] prestamos_) {
        nombre = nombre_;
        dni = dni_;
        direccion = direccion_;
        prestamos = prestamos_;

        int cont = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null) {
                cont++;
            }
        }
        num_prestamos = cont;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumPrestamos() {
        return (String.valueOf(num_prestamos));
    }

    public Prestamo[] getPrestamosActivos() {

        Prestamo[] prestamosActivos = new Prestamo[10];
        int j = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null && prestamos[i].getEstado() == true) {
                prestamosActivos[j] = prestamos[i];
                j++;
            }
        }
        return prestamosActivos;
    }

    public Prestamo[] getPrestamosSancionados() {

        Prestamo[] prestamosSancionados = new Prestamo[10];
        int j = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null && prestamos[i].getSancion() == true) {
                prestamosSancionados[j] = prestamos[i];
                j++;
            }
        }
        return prestamosSancionados;
    }

    public void addPrestamo(Prestamo prestamo_) {

        if(!existePrestamo(Integer.parseInt(prestamo_.getId()))){
        	boolean anyadido = false;
        	for (int i = 0; i < prestamos.length && !anyadido; i++) {
        		if (prestamos[i] == null) {
        			prestamos[i] = prestamo_;
        			anyadido = true;
        			num_prestamos++;
        		}
        	}
        }
    }

    public boolean existePrestamo(int id_prestamo) {

        boolean encontrado = false;
        for (int i = 0; i < prestamos.length && !encontrado; i++) {
            if (prestamos[i] != null && prestamos[i].getId().equals(String.valueOf(id_prestamo))) {
                encontrado = true;
            }
        }
        return encontrado;

    }

    public void cancelarPrestamo(int id_prestamo) {

        boolean cancelado = false;
        for (int i = 0; i < prestamos.length && !cancelado; i++) {
            if (prestamos[i] != null && prestamos[i].getId().equals(String.valueOf(id_prestamo))) {
                prestamos[i] = null;
                cancelado = true;
                num_prestamos--;
            }
        }
    }

    public String toString() {
        
        String cadenaUsuario = nombre + ";" + dni + ";" + direccion + ";" + num_prestamos + ";\n";
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null) {
                cadenaUsuario = cadenaUsuario + prestamos[i].toString() + "\n";
            }
        }
        return cadenaUsuario;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }
}
