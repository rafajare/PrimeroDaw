

public abstract class InstrumentoDeCuerda extends Instrumento {

	
	private int numeroDeCuerdas;
	
	public InstrumentoDeCuerda(String nombre, int numeroDeCuerdas) {
		super(nombre);
		this.numeroDeCuerdas = numeroDeCuerdas;
		
	}
	
	
	
	public int getnumeroDeCuerdas(){
		return numeroDeCuerdas;
	}
	
}
