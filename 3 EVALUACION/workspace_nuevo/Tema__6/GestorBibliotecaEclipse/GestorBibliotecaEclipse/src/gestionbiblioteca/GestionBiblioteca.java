
package gestionbiblioteca;

import java.util.Scanner;


public class GestionBiblioteca {

    public static int menu(Scanner tec) {
        System.out.println("*********** MENU PRINCIPAL ***********\n"
                + "1.Usuario\n"
                + "2.Libros\n"
                + "3.Prestamos\n"
                + "4.Guardar\n"
                + "0.Terminar\n"
                + "**************************************");
        return (tec.nextInt());
    }

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
        System.out.println("----------- SUBMENU USUARIOS -----------\n"
                + "1. Alta Usuario\n"
                + "2. Baja Usuario\n"
                + "3. Informacion Usuario\n"
                + "0. Terminar\n"
                + "-------------------------------------------------------*");
        return (tec.nextInt());
    }

    public static int submenuLibros(Scanner tec) {
        System.out.println("----------- SUBMENU LIBROS -----------\n"
                + "1. Alta libro\n"
                + "2. Informacion libro\n"
                + "0. Terminar\n"
                + "-------------------------------------------------------");
        return (tec.nextInt());
    }

    public static int submenuPrestamos(Scanner tec) {
        System.out.println("----------- SUBMENU PRESTAMOS -----------\n"
                + "1. Numero de prestamos activos\n"
                + "2. Numero de prestamos sancionados\n"
                + "3. Histograma de prestamos de usuarios\n"
                + "4. Nuevo prestamo\n"
                + "0. Terminar\n"
                + "-------------------------------------------------------");
        return (tec.nextInt());
    }

   
    public static void main(String[] args) {
        

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
                                System.out.println("Opcion seleccionada: Alta usuario");
                                System.out.println("Introduzca nombre:");
                                String nombre = in.next();
                                System.out.println("Introduzca dni:");
                                String dni = in.next();
                                System.out.println("Introduzca direccion:");
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
                                System.out.println("Opcion seleccionada: Baja usuario");
                                System.out.println("Introduzca el dni del usuario:");
                                int dniBaja = in.nextInt();
                                b.bajaUsuario(dniBaja);
                                
                                //EJEMPLO PREDEFINIDO
                                //b.bajaUsuario(18443544);
                                break;
                            case 3://Información usuario
                                System.out.println("Opcion seleccionada: Info usuario");
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
                                System.out.println("Opcion seleccionada: Salir del submenu usuario");
                                System.out.println("Saliendo de usuario");
                                break;
                        }

                        break;
                    //LIBROS
                    case 2:

                        subopcion = submenu(in, opcion);
                        switch (subopcion) {
                            case 1:
                                System.out.println("Opcion seleccionada: Alta Libro");
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
                                System.out.println("Opcion seleccionada: Info Libro");
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
                                System.out.println("Opcion seleccionada: Salir del submenú Libros");
                                break;
                        }

                        break;
                    //PRESTAMOS
                    case 3:

                        subopcion = submenu(in, opcion);
                        switch (subopcion) {
                            case 1://Num prestamos activos
                                System.out.println("Opcion seleccionada: Numero de prestamos activos");
                                System.out.println("Num prestamos activos: "+b.getNumPrestamosActivos());
                                break;
                            case 2://Num prestamos sancionados
                                System.out.println("Opcion seleccionada: Numero de prestamos sancionados");
                                System.out.println("Num prestamos sancionados: "+b.getNumPrestamosSanciones());
                                break;
                            case 3://Histograma
                                System.out.println("Opcion seleccionada: Histograma");
                                System.out.println(b.histograma());
                                break;
                            case 4://Nuevo prestamos
                                System.out.println("Opcion seleccionada: Nuevo Prestamo");
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
                                System.out.println("Opcion seleccionada: salir del submenu prestamos");
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