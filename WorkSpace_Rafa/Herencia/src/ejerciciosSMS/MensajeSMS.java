package ejerciciosSMS;

public class MensajeSMS extends Mensaje {

	public MensajeSMS(int remitente, int numerodestinatario, String destinatario) {
		super(remitente, numerodestinatario, destinatario);
		
	}

	public void enviarMensaje(String mensaje){
		super.setMensaje(mensaje);
		
	}
	
	
	public void visualizarMensaje(){
		super.visualizarMensaje();
		
	}
	

	
	
}
