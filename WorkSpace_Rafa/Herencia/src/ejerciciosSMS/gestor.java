package ejerciciosSMS;

public class gestor {

	public static void main(String args[]){
		
		MensajeSMS m1 = new MensajeSMS(5514151, 1451512, "Rafa");
		
		m1.enviarMensaje("Hola Rafa. �Como estas?");
		m1.visualizarMensaje();
		System.out.println();
		MensajeMMS m2 = new MensajeMMS(5514151, 1451512, "Rafa","Esto es una imagen");
		m2.enviarMensaje("Te dejo la imagen");
		m2.visualizarMensaje();
	}
}
