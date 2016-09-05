import java.util.Scanner;


public class pruebaTicket {
	
	public static void main (String args[]){
		
		
		int precioTicket=10;
		ticket miMaquina=new ticket(10);
		System.out.println("El precio del ticket es: "+ miMaquina.getPrice());
		System.out.println("El balance es : "+ miMaquina.getBalance());
		System.out.println("Introduce una moneda: ");
		Scanner teclado= new Scanner(System.in);
		int moneda=teclado.nextInt();
		miMaquina.insertMoney(moneda);
		System.out.println("El balance es : "+ miMaquina.getBalance());
		 miMaquina.printTicket();
		
		
		
	}

}
