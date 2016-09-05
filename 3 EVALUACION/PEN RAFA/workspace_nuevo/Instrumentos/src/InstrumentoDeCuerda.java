
public abstract class InstrumentoDeCuerda extends Instrumento {
	
	private int numCuerdas;
	
	public InstrumentoDeCuerda(String n_,int numCuerdas_){
		super(n_);
		numCuerdas=numCuerdas_;
	}

	public InstrumentoDeCuerda(){
		this("zzz",0);
	}
	
	public int getNumCuerdas(){
		return numCuerdas;
	}
	
	
}
