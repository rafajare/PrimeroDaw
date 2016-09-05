
package gestionbiblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Prestamo {

    private static int num_prestamos;
    private int id;
    private Libro libro;
    private String fecha_inicio;
    private String fecha_fin;
    private boolean sanction;
    private String estado;

    Prestamo(Libro libro_) {
        num_prestamos++;
        
        id = num_prestamos;
        System.out.println("num_prestamos: "+num_prestamos);
        libro = libro_;

        //Decidimos el formato que van a tener nuestras fechas
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        //creamos un calendario que por defecto toma la fecha actual
        Calendar calendar = new GregorianCalendar();
        //accedemos a la fecha actual y la guardamos en
        //un objeto de tipo Date
        //fecha inicio tipo Date
        Date date_inicio = calendar.getTime();
        //podemos convertir la fecha de tipo Date a String
        //con un formato determinado utilizando el objeto
        //formatoFecha de la clase SimpleDateFormat
        //fecha inicio tipo String
        fecha_inicio = formatoFecha.format(date_inicio);


        //Primero, establecemos la fecha en el calendario a la
        //fecha que contiene el objeto date_inicio
        calendar.setTime(date_inicio);
        //incrementamos la fecha en 30 dias
        calendar.add(Calendar.DATE, 30);
        //Ahora, el objeto calendar contendrá la nueva fecha
        //que será la inicial + 30 dias
        //fecha fin tipo Date +30 dias
        Date date_fin = calendar.getTime();
        //fecha fin tipo String
        fecha_fin = formatoFecha.format(date_fin);

        sanction = false;
        estado = "activo";
    }

    Prestamo(int id_, String fecha_inicio_, String fecha_fin_, boolean sanction_, String estado_, Libro libro_) {
        id = id_;
        fecha_inicio = fecha_inicio_;
        fecha_fin = fecha_fin_;
        sanction = sanction_;
        estado = estado_;
        libro = libro_;
        
    }
    
    public String getId (){
        return String.valueOf(id);
    }
    public Libro getLibro (){
        return libro;
    }
    public String getFechaInicio(){
        return fecha_inicio;
    }
    public String getFechaFin(){
        return fecha_fin;
    }
    public boolean getSancion(){
        return sanction;
    }
    public boolean getEstado(){
        if(estado.equals("activo")){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        String cadenaPrestamo = "";
        if(sanction){
         cadenaPrestamo = id+";"+libro.toString()+fecha_inicio+";"+fecha_fin+";+;"+estado+";";
        }else{
         cadenaPrestamo = id+";"+libro.toString()+fecha_inicio+";"+fecha_fin+";-;"+estado+";";   
        }
        return cadenaPrestamo;
    }
    
    public void ampliarPrestamo(int dias) throws ParseException{
        
    	SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatoFecha.parse(fecha_fin);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        //incrementamos la fecha en 30 dias
        calendar.add(Calendar.DATE, dias);
        fecha_fin = formatoFecha.format(date);
    }
    
    public void setEstado(String estado_){
        estado = estado_;
    }
    
    public void setSancion(boolean sanction_){
        sanction = sanction_;
    }
    
   
   public static void setNumPrestamos(int num_prestamos_){
        num_prestamos = num_prestamos_;
        
    }
   
   public static int getNumPrestamos(){
        return (num_prestamos);
    }
    
}
