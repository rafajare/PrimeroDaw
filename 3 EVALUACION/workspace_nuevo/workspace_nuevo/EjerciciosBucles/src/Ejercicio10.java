import java.util.Scanner;


public class Ejercicio10 {
	
			public static void main (String args[]){
				
				
				int notas;
				int aprobados=0;
				int suspendidos=0;
				int condicionados=0;
				int contador=0;
				
				
				Scanner teclado = new Scanner (System.in);
				
				for (contador=0; contador<6; contador++) {
				
					System.out.println("Introduzca la nota");
					notas=teclado.nextInt();
				
					
					
					if(notas==1){
					
						aprobados=notas;
						suspendidos=notas;
					}
					
					if (notas>=5){
						
						aprobados=aprobados+1;
						
					}
					
					if (notas<4) {
						
						suspendidos=suspendidos+1;
					}
				
					if(notas==4){
						
						condicionados=condicionados+1;
					}
				
				}
				
				System.out.println("El número de aprobados es  :"+aprobados);
				System.out.println("----------------------------------");
				System.out.println("El número de suspendidos es  :"+suspendidos);
				System.out.println("----------------------------------");
				System.out.println("El número de condicionados es  :"+condicionados);
				
				 
				
				
				
				
				
				
				
				
			}
}
