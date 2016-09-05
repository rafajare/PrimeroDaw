	package ejercicio3;

	public abstract class Figura {
	
	private String color;
	
	public Figura(String color_){
		setColor(color_);
	}
	
	public void cambiaColor(){
		
	}
	
	public void borrar(){
		
	}
	
	abstract public void dibujar();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
