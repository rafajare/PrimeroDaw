import java.util.Scanner;


public class Ejercicio5 {
	
		public static void main (String args[]){
			System.out.println("Introduce el número de alumnos ");
			int n;
			Scanner teclado = new Scanner(System.in);
			n=teclado.nextInt();
				
			int vectorFacultad[]= new int [n];
			int vectorSexo[]= new int [n];
			int vectorTrabajo[]= new int [n];
			int vectorSueldo[]= new int [n];
			double contadorH=0;
			double contadorM=0;
			double contadorTrabajoM=0;
			double contadorTrabajoH=0;
			
			
			for (int i=0; i<n; i++){
				System.out.println("Complete el siguiente formulario ");
				System.out.println("---------------------------------");
				System.out.println("Introduzca el número de su facultad ");
				vectorFacultad[i]=teclado.nextInt();
				System.out.println("Indique su sexo ");
				System.out.println("1. Masculino: ");
				System.out.println("2. Femenino : ");
				vectorSexo[i]=teclado.nextInt();
				System.out.println("¿Usted tiene trabajo? ");
				System.out.println("1. Si :");
				System.out.println("2. No :");
				vectorTrabajo[i]=teclado.nextInt();
				if (vectorTrabajo[i]==1){
				System.out.println("Indique cuanto cobra ");
				vectorSueldo[i]=teclado.nextInt();
				}
				}
			for (int i=0; i<n; i++){
			
			if (vectorSexo[i]==1){
				contadorH=contadorH+1;
				if (vectorTrabajo[i]==1){
					contadorTrabajoH=contadorTrabajoH+1;
				}
			}
			if(vectorSexo[i]==2){
				contadorM=contadorM+1;
				if (vectorTrabajo[i]==1){
					contadorTrabajoM=contadorTrabajoM+1;
			
			}
			
			System.out.println("El porcentaje de hombres en la UNI es : " + contadorH/n);
			System.out.println("El porcentaje de mujeres en la UNI es : " + contadorM/n);
			System.out.println("El porcentaje de hombres que trabajan es : " + 100*contadorTrabajoH/contadorH);
			System.out.println("El porcentaje de mujeres que trabajan es : " + 100*contadorTrabajoM/contadorM);
			
		}
		}
}
}