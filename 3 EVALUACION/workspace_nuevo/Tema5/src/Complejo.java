
public class Complejo {
	//ATRIBUTOS
	
	double pReal;
	double pImag;
	
	//METODOS
	
	public void asignar(double r, double i){
		pReal =r;
		pImag =i;
	}
	public void sumar(Complejo n){
		pReal=pReal+n.pReal;
		pImag=pImag+n.pImag;
		
	}
	
	public void sumar2(double r, double i){
		pReal=pReal+r;
		pImag=pImag+i;
	}
	
	public void imprimir(){
			System.out.println("pReal :"+pReal);
			System.out.println("pImag :" +pImag);
	}
	}// FIN
