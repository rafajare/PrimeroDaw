import java.util.Scanner;


public class EjercicioSueldos {
	public static void main (String args[]){
		
		Scanner teclado=new Scanner(System.in);
		
		int sueldos[] = new int [9];
		char turno;
		
		
		for(int i=1;i<9;i++){
		System.out.println("Introduzca un sueldo");
		sueldos[i]=teclado.nextInt();
		System.out.println("Indique el turno (Mañanas) O (Tardes)");
		turno=teclado.next().charAt(0);
		
		if (turno=='M'){
			System.out.println("--------------------------------------------");
			System.out.println("El empleado nº" + i +"  cobra  "+ sueldos[i] +" y trabaja de "+ turno+"añanas");
		}		
		
		if (turno=='T'){
			System.out.println("--------------------------------------------");
			System.out.println("El empleado n" + i +"  cobra  "+ sueldos[i] +" y trabaja de "+ turno+"ardes");
		}	System.out.println("--------------------------------------------");
				
		}
		
	}

}
