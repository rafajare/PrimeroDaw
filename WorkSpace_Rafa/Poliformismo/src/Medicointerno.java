
public class Medicointerno extends Medico{
	
	private String fechacomienzointerinidad;

    public Medicointerno(String nombre, String apellidos, int edad, String fechacomienzointerinidad)
    {
        super(nombre, apellidos, edad);
        this.fechacomienzointerinidad = fechacomienzointerinidad;
    }

    public String getFechacomienzointerinidad()
    {
        return fechacomienzointerinidad;
    }

    public void setFechacomienzointerinidad(String fechacomienzointerinidad)
    {
        this.fechacomienzointerinidad = fechacomienzointerinidad;
    }

    public void mostrardatos()
    {
        super.mostrardatos();
        System.out.println((new StringBuilder("Fecha del comienzo de su iterinidad")).append(fechacomienzointerinidad).toString());
        
    }

    
}
