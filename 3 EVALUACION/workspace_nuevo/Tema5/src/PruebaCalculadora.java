import java.util.Scanner;


public class PruebaCalculadora {
	public static void main (String args[]){
		
	

	Scanner teclado=new Scanner(System.in);
	
	Calculadora c1 =new Calculadora(7,5);
	
	System.out.println(c1.printValores());
	c1.suma();
	System.out.println(c1.printValores());
	
	}
}
