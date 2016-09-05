
package gestionbiblioteca;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Biblioteca {

    private Usuario[] usuarios;
    private Libro[] libros;

    public Biblioteca() {

        Scanner in = null;

        try {

            in = new Scanner(new FileReader("infoBiblioteca.txt"));
            in.next();
            int max_id_prestamos = in.nextInt();
            System.out.println("max_id_prestamos: "+max_id_prestamos);
            Prestamo.setNumPrestamos(max_id_prestamos);
            
            in.next();
            int maxLibros = in.nextInt();
            System.out.println(maxLibros);
            in.next();
            int maxUsuarios = in.nextInt();
            System.out.println(maxUsuarios);
            usuarios = new Usuario[maxUsuarios];
            libros = new Libro[maxLibros];

            in.nextLine();
            in.nextLine();
            in.nextLine();

            in.useDelimiter(";");

            int i = 0;

            String tituloLibro = in.next();

            System.out.println("--------------");
            System.out.println("Libros");
            System.out.println("--------------");
            
            while (!tituloLibro.contains("Prestamo")) {

                System.out.print(tituloLibro);
                String autorLibro = in.next();
                System.out.print(" "+autorLibro);
                int anyoLibro = in.nextInt();
                System.out.print(" "+anyoLibro);
                String editorial = in.next();
                System.out.print(" "+editorial);
                String isbn = in.next();
                System.out.println(" "+isbn);

                Libro libro = new Libro(tituloLibro, autorLibro, anyoLibro, editorial, isbn);
                libros[i] = libro;
                i++;
                in.nextLine();
                tituloLibro = in.next();
            }

            in.nextLine();

            System.out.println("--------------");
            System.out.println("Usuarios");
            System.out.println("--------------");
            i = 0;
            while (in.hasNext()) {

                String nombreUser = in.next();
                System.out.println("Nombre:" + nombreUser);
                String idUser = in.next();
                System.out.println("ID:" + idUser);
                String direccion = in.next();
                System.out.println("Direccion:" + direccion);
                int num_prestamos = in.nextInt();
                System.out.println("Num.Prestamos:" + num_prestamos);

                Prestamo[] prestamos = new Prestamo[10];

                in.nextLine();
                System.out.println("--------------");
                System.out.println("Prestamos del Usuario");
                System.out.println("--------------");

                for (int j = 0; j < num_prestamos; j++) {

                    int id_prestamo = in.nextInt();
                    System.out.println("    idPrestamo:" + id_prestamo);
                    String libroPrestamo = in.next();
                    System.out.println("    Titulo:" + libroPrestamo);
                    String inicioPrestamo = in.next();
                    System.out.println("    Inicio:" + inicioPrestamo);
                    String finPrestamo = in.next();
                    System.out.println("    Fin:" + finPrestamo);
                    String multa = in.next();
                    boolean sancion;
                    if (multa.equals("-")) {
                        sancion = false;
                    } else {
                        sancion = true;
                    }
                    System.out.println("    Sancion:" + sancion);
                    String estado = in.next();
                    System.out.println("    Estado:" + estado);
                    in.nextLine();

                    int posicion = 0;
                    System.out.println("    -----------------");
                    System.out.println("    Info del libro prestado");
                    System.out.println("    -----------------");
                    for (int l = 0; l < libros.length; l++) {//cambio

                        if (libros[l] != null && libros[l].getTitulo().contains(libroPrestamo)) {
                            Prestamo prestamosUsuario = new Prestamo(id_prestamo, inicioPrestamo, finPrestamo, sancion, estado, libros[l]);
                            prestamos[j] = prestamosUsuario;
                            System.out.println("    " + prestamos[j].toString());
                        }

                    }
                    System.out.println("    -----------------");

                }

                usuarios[i] = new Usuario(nombreUser, idUser, direccion, prestamos);
                i++;
            }
            

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se ha encontrado.");
        } finally {

            if (in != null) {
                in.close();
            }
        }
    }

    public void altaUsuario(Usuario usuario_) {
        boolean alta = false;
        for (int i = 0; i < usuarios.length && !alta; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario_;
                alta = true;
            }
        }
    }

    public void bajaUsuario(int dni) {
        boolean baja = false;
        for (int i = 0; i < usuarios.length && !baja; i++) {
            if (usuarios[i] != null && usuarios[i].getDNI().equals(String.valueOf(dni))) {
                usuarios[i] = null;
                baja = true;
                System.out.println("baja");
            }
        }

    }

    public void altaLibro(Libro libro_) {
        boolean alta = false;
        for (int i = 0; i < libros.length && !alta; i++) {
            if (libros[i] == null) {
                libros[i] = libro_;
                alta = true;
            }
        }
    }

    public int getNumPrestamosActivos() {

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

    public int getNumPrestamosSanciones() {

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

    public String histograma() {
        int[] histograma = new int[10];

        for (int j = 0; j < usuarios.length; j++) {
            if (usuarios[j] != null) {
                histograma[Integer.parseInt(usuarios[j].getNumPrestamos())]++;
            }
        }

        String cadenaHistograma = "";
        for (int j = 0; j < histograma.length; j++) {
            cadenaHistograma = cadenaHistograma + j + " prestamos:";
            for (int k = 0; k < histograma[j]; k++) {
                cadenaHistograma = cadenaHistograma + "*";
            }
            cadenaHistograma = cadenaHistograma + "\n";
        }
        return (cadenaHistograma);
    }

    public String listarLibros() {

        String listaLibros = "";
        for (int j = 0; j < libros.length; j++) {
            if (libros[j] != null) {
                listaLibros = listaLibros + libros[j].toString() + "\n";
            }
        }

        return (listaLibros);

    }

    public String listarUsuarios() {
        String listaUsuarios = "";
        for (int j = 0; j < usuarios.length; j++) {
            if (usuarios[j] != null) {
                listaUsuarios = listaUsuarios + usuarios[j].toString();
            }
        }

        return (listaUsuarios);
    }

    public Usuario getUsuario(int dni) {
        boolean encontrado = false;
        int posicion = 0;
        for (int i = 0; i < usuarios.length && !encontrado; i++) {

            if (usuarios[i] != null) {
                //System.out.println("usuarios[i].getDNI(): "+usuarios[i].getDNI());
                //System.out.println("String.valueOf(dni): "+String.valueOf(dni));
                if (usuarios[i].getDNI().equals(String.valueOf(dni))) {

                    posicion = i;
                    encontrado = true;
                    System.out.println("Usuario encontrado");
                }
            }
        }
        if (encontrado) {
            return usuarios[posicion];
        } else {
            return null;
        }
    }

    public Libro getLibro(String isbn) {
        boolean encontrado = false;
        int posicion = 0;
        for (int i = 0; i < libros.length && !encontrado; i++) {

            if (libros[i] != null) {
                //System.out.println("usuarios[i].getDNI(): "+usuarios[i].getDNI());
                //System.out.println("String.valueOf(dni): "+String.valueOf(dni));
                if (libros[i].getIsbn().equals(String.valueOf(isbn))) {

                    posicion = i;
                    encontrado = true;
                    System.out.println("Libro encontrado");
                }
            }
        }
        if (encontrado) {
            return libros[posicion];
        } else {
            return null;
        }
    }

    public Libro[] getLibros() {
        return libros;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void guardar() {
        PrintWriter fich = null;
        try {
            fich = new PrintWriter("InfoBibliotecaNew.txt");

            fich.print("Last_id_prestamos " + Prestamo.getNumPrestamos() + " \n"
                    + "Num_max_libros 50\n"
                    + "Num_max_usuarios 50\n"
                    + "Libros:\n"
                    + "-----------\n");

            fich.print(listarLibros());
            fich.print("Prestamos:\n");
            fich.print("------------;\n");
            fich.print(listarUsuarios());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally {
            fich.close();
        }

    }
}
