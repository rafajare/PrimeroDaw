
public class Ejecucion {
	public static void main (String args[]){

	Instrumento g1= new GuitarraElectrica ("guitarra",6);
	Instrumento g2= new BajoElectrico ("bajo",3);
	Instrumento g3= new GuitarraElectrica ("guitarra",4);
	Instrumento g4= new BajoElectrico ("bajo",7);
	
	g1.getTocar();
	g2.getTocar();
	g3.getTocar();
	g4.getTocar();
	

	}
}
