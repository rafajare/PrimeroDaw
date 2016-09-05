
public class Cafetera {
	//Atributos
	private int capacidadMaxima;
	private int cantidadActual;
	
	//Constructores
	
	public Cafetera(){
		capacidadMaxima=1000;
		cantidadActual=0;
	}
	

	public Cafetera(int capM){
		capacidadMaxima=capM;
	}
		
		public Cafetera(int capM, int cantidadA){
			
			capacidadMaxima=capM;
			cantidadActual=cantidadA;
			
		if(cantidadActual>capacidadMaxima){
			cantidadActual=capacidadMaxima;
		}
	
	}
	
	
	//METODOS
	
		public void llenarCafe(){
			cantidadActual=capacidadMaxima;
		}
	
		public void servirTaza(int taza){
			cantidadActual=cantidadActual-taza;
			System.out.println("Se ha servido una taza de " +taza+ " ml");
		}
		
		public void vaciarCafetra(){
			cantidadActual=0;
		}
	
		public void Mostrar(){
			System.out.println("La capacidad maxima es : "+capacidadMaxima+" y la cafetera tiene "+ cantidadActual+" ml");
		}
		
		public void agregarCafe(int agregar){
			cantidadActual=cantidadActual+agregar;
			if(cantidadActual>capacidadMaxima){
				cantidadActual=capacidadMaxima;
			}
			
		}
}//FIN

