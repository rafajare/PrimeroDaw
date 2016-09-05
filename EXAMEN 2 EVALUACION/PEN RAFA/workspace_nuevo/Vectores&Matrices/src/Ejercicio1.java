import java.util.Scanner;


public class Ejercicio1 {
	public static void main (String args[]){
	
		Scanner teclado=new Scanner (System.in);
		
	int grupoPracticas=14;
	int sesiones=15;
	int numAlumnos;
	int numAlumnosAsist;
	int sesionesBajaAsist=0;
	int sumaAsistencia=0;
	int sesionAsistMin=0;
	
	
	// bucle de los grupos
	for (int i=0; i<grupoPracticas;i++){
		
		System.out.println("Introduzca el número de alumnos del grupo"+ i);
		numAlumnos=teclado.nextInt();
	// bucle de las sesiones	
	for (int j=0;j<sesiones;j++){
		System.out.println("Introduzca los alumnos que han asistido a las 15 sesiones");
		numAlumnosAsist=teclado.nextInt();
		if (j==0){
			int sesionAsistMin=numAlumnosAsist;
		} else{
			if (numAlumnosAsist<asistMin){
				sesionasistMin=numAlumnos
				
			}
		}
		
		sumaAsistencia=sumaAsistencia+numAlumnosAsist;
		
	if (numAlumnosAsist<(numAlumnos/2)){
		sesionesBajaAsist++;
		}// primer if
	if (sesionesBajaAsist>=10){
		System.out.println("Baja asistencia del grupo");
		j=sesiones;
	}
	
	if (sesionesBajaAsist<10){
		System.out.println("Asistencia media"+ sumaAsistencia/(double)sesiones);
		j=sesiones;
	}
	
	}// bucle sesiones
	
	}// bucle grupos
		
		
	
	}
	

}