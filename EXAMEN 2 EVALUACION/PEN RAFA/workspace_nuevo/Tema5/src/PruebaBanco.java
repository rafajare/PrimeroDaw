import java.util.Scanner;


public class PruebaBanco {
	public static void main(String args[]){
		
	Scanner teclado=new Scanner(System.in);
	
	Banco b1=new Banco();
	

	b1.Ingresar(5000);
	b1.Retirar(14789);
	
	b1.printCuenta();
	
	
	}
}
