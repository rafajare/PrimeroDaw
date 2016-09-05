

public class GuitarraElectrica extends InstrumentoDeCuerda{

	
	public GuitarraElectrica(String nombre, int numeroDeCuerdas) {
		super(nombre, numeroDeCuerdas);
		
	}


	public void tocar(){
			System.out.println("Una " +getNombre()+ " eléctrica de "+getnumeroDeCuerdas()+"-cuerdas está sonando!");
	}
}
