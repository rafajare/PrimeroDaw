import java.util.Scanner;

public class Ejercicio {
	public static void main (String args[]) {
		
		Scanner teclado=new Scanner (System.in);
		
		int lluvia [] =new int [6];
		int suma=0;
		int media;
		
		for (int l=0; l<6;l++){
			
			System.out.println("Introduce la lluvia (medidad en litros)");
			lluvia[l]=teclado.nextInt();
			suma=suma+lluvia[l];
			}// Fin 1ª For
		
			media=suma/6;
			System.out.println("La media de lluvia es  :"+ media);
			
			for(int l=0;l<6;l++){
			
			if  (lluvia[l]>media*2){
				System.out.println("El dia "+l +  "  hubo "  + lluvia[l] +"  litros de agua. ( Más del doble de la media)");
				
			}// Fin if	
		}//Fin 2ª For
	}// Fin main
}//Fin class
