

import java.io.ObjectInputStream.GetField;
import java.util.*;
public class App {

	public static void main(String[] args){
		
		Windsurf deporteW = new Windsurf(120, 25, true, 54, 3);
		Baloncesto deporteB = new Baloncesto(90, 32);
		Futbol deporteF = new Futbol(90, 19, 11);
		
		
		ArrayList <Deporte> deportes = new ArrayList();
		
		deportes.add(deporteW);
		deportes.add(deporteB);
		deportes.add(deporteF);
		
		for(Deporte tipo:deportes){
			System.out.println("El consumo total de calorias es de: "+tipo.consumoCalorias()+" calorias"); //poner dfutbol windsurf o baloncesto
		}
		
		/*Iterator <Deporte> itDeportes = deportes.iterator();
		
		while(itDeportes.hasNext()){
			System.out.println("\nEl consumo total de calorias es de: "+itDeportes.next().consumoCalorias()+" calorias");
		}
		*/
		
		
	}
	
	
	
}

