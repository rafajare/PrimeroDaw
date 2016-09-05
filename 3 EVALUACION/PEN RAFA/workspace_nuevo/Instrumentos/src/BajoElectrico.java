
public class BajoElectrico extends InstrumentoDeCuerda{
	
	public BajoElectrico(String n_,int numCuerdas_){
		super(n_,numCuerdas_);
		
	}

	public BajoElectrico(){
		this("zzz",0);
	}
	
	public void getTocar(){
		
		System.out.println("Este bajo tiene "+getNumCuerdas()+" número de cuerdas");
	}
}
