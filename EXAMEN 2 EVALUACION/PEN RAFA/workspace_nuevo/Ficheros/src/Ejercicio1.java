import java.util.*;


public class Ejercicio1 {
	public static void main (String args[]){
		
		Scanner teclado=new Scanner(System.in);
		
		int n;
		
			
		System.out.println("¿Cuantas ciudades abarca la gira?");
		n=teclado.nextInt();
		
		 String ciudad[]=new String[n];
		 int actuaciones[]=new int[n];
		 int ingresos[]=new int[n];
		 int historigrama[]=new int[11];
		 int suma=0;
		 int media=0;
		 
		 // EMPEZAMOS A INTRODUCIR LOS DATOS CON EL FOR
		 
		 int i;
		 for(i=0;i<n;i++){
			 System.out.println("Introduzca el nombre de la ciudad");
			 ciudad[i]=teclado.next();
			 System.out.println("Introduzca el número de actuaciones hechas en "+ ciudad[i]);
			 actuaciones[i]=teclado.nextInt();
			 System.out.println("Introduzca los ingresos que ha recibido "+ ciudad[i]);
			 ingresos[i]=teclado.nextInt();
			 
			 suma=ingresos[i]+suma;
		 }// FIN FOR
		 
	     System.out.println("__________________________");
		 media=suma/n;
		 
		 
		 
		 
		// EMPIEZA EL SwITCH 
		 
			
		int opcion;
		do{
			System.out.println("Seleccione la opción que desea hacer");
			System.out.println("1. Mostrar las actuaciones de la ciudad");
			System.out.println("2. Mostrar la recaudación máxima");
			System.out.println("3. Mostrar la recaudación mínima");
			System.out.println("4. Mostrar las actuaciones de la ciudad");
			System.out.println("5. Mostrar la media de ganancias");
			System.out.println("6. Salir");
			opcion=teclado.nextInt();
			
			String ActCiudad;
			int max;
			int x=0;
			int min=0;
			int contador=0;
			int historiaAct;
			
			
		switch(opcion){
		case 1:
		
			System.out.println("Introduzca la ciudad de la que desea información");
			ActCiudad=teclado.next();
			boolean encontrado=false;
			 i=0;
			while (!encontrado){
				if(ActCiudad.equals(ciudad[i])){
					encontrado=true;
				}else {
					i++;
				}
			}
			
			System.out.println("En"+ ciudad[i]+" han actuado un total de "+ actuaciones[i]+ " veces");
			System.out.println("En"+ ciudad[i]+ " han recaudado "+ingresos[i]+" euros");
		     System.out.println("_______________________");
			 
		break;
		case 2:
			max=ingresos[0];
			for(i=0;i<n;i++){
				if(ingresos[i] >max){
					max=ingresos[i];
					x=i;
				}// fin if
			}// fin for
		
			System.out.println("La recaudación máxima ha sido "+ max +" y ha sido en "+ ciudad[x]);
		     System.out.println("_____________________________");
			
		break;
		case 3:
			min=ingresos[0];
			for(i=0;i<n;i++){
				if(ingresos[i]<min){
					min=ingresos[i];
					x=i;
				}// fin if
			}// fin for
			System.out.println("La recaudación mínima ha sido "+ min +" y ha sido en "+ ciudad[x]);
		     System.out.println("______________________________");
		break;
		case 4:
			System.out.println("Historigrama de la gira: ");
			
			
			for(i=0;i<=10;i++){
				for(int j = 0; j<n; j++){
					if(actuaciones[j]==i){
						historigrama[i]=historigrama[i]+1;
						
					}
				}
			}
				
			for(i=0;i<=10;i++){
				System.out.print(i+" act: ");
				for(int j=0; j<historigrama[i];j++){
					System.out.print("*");
					
				}
					System.out.println("");
			}
			 
		break;
		case 5:
			
			for(i=0;i<n;i++){
				if(media>ingresos[i]){
					x=i;
					System.out.println("La media de ingresos es de "+ media +" y una ciudad por encima de la media es "+ ciudad[x]);
				}// fin if
				
			}// FIN FOR
		     System.out.println("_________________________");
		break;
		case 6:
			// vacio . Indica el FIN del programa
		break;	
			
		
		}// FIN SWITCH
	  }while(opcion!=6); // FIN DO
		 
		 
	}// FIN MAIN

}// FIN CLASS
