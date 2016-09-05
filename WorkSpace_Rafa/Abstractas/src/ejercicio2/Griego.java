package ejercicio2;

public class Griego extends Guerrero{
	
	
		public Griego(String nombre, int edad, int fuerza) {
			super(nombre, edad, fuerza);
			
		}
		
		
		public Griego(Guerrero griego, String nombre) {
			super(griego, nombre);
		
		}
	
		
		
	public boolean retirarse(){
			if(getHerido() && !isMuerto()){ 
				return true;
			}else{
				return false;
			}
	}
		
	}
