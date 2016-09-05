import java.util.Scanner;


public class Ejercicio14 {
	public static void main (String args[]){
		
		
		int edad;
		double altura=0;
		int contador=0;
		double contadorAltura=0;
		int contadorEdad=0;
		double mediaAlt;
		double sumaAltura=0;
		
		Scanner teclado=new Scanner (System.in);
		
		for(int i=1; i<=5;i++){
		
		System.out.println("Introduce la edad");
		edad=teclado.nextInt();
		System.out.println("Introduce la altura");
		altura=teclado.nextDouble();
		System.out.println("-------------------");
		contador=contador+1;
		if (edad>18){
			contadorEdad=contadorEdad+1;
		}
		if(altura>1.75){
			contadorAltura=contadorAltura+1;
		}
	
	   sumaAltura=sumaAltura+altura;
	}
		
			mediaAlt=sumaAltura/5;
		   System.out.println("La estatura media es de  "+mediaAlt);
		   System.out.println("Hay  "+contadorEdad+"  mayores de 18");
		   System.out.println("Hay  "+contadorAltura+" mas altos de 1.75");
		
	}

  }
