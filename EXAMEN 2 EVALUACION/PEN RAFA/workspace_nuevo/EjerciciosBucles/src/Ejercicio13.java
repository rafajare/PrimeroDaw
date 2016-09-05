import java.util.Scanner;


public class Ejercicio13 {

	public static void main (String args[]) {
		
		int factura;
		int contador=0;
		int facturacionTotal;
		int litros;
		int facturasMayores;
		int contadorFacturacionAlta=0;
		
		Scanner teclado=new Scanner (System.in);
		
		for (int i=1; i<=5; i++){
		 
		System.out.println("Introduce el numero de factura:");
		factura=teclado.nextInt();
		System.out.println("Introduce la facturacion total");
		facturacionTotal=teclado.nextInt();
		System.out.println("Introduce el numero de litros vendidos:");
		litros=teclado.nextInt();
		System.out.println("-------------------------------");
		contador=contador+1;
		
		if(facturacionTotal>600){
			contadorFacturacionAlta=contadorFacturacionAlta+1;
			
		}
		}
		 System.out.println("Hay  "+contadorFacturacionAlta+" facuras superiores a los 600 euros");
	}
}
