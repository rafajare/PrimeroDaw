
public class Punto {
	
	

	//Atributos
	
	private int x;

	private int y;
	
	//Constructor
	public Punto(){
		x=0;
		y=0;
	
	}
	
	public Punto(int valorX, int valorY){
	
		x=valorX;
		y=valorY;
	
	}
	
	
		
	//Metodos
	
	public int getCoordX(){
		
		return x;
	}
	
	public int getCoordY(){
		
		return y;
	}
	
	public void printPunto(){
		System.out.println("("+ x + " , " + y + ")");
	}

	public void setCoordX(int valorX){
		x=valorX;
	}


	
}// CLASS
