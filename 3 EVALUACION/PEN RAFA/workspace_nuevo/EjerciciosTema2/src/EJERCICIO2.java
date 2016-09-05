import java.util.Scanner;


public class EJERCICIO2 {

	
	public static void main (String [] args){
		
		double a;
		double b;
		double c;
		double P;
		double A;
		double Heron;
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca valor de 'a':");
		a = teclado.nextDouble();
		
		System.out.println("Introduzca valor de 'b'");
		b = teclado.nextDouble();
		
		System.out.println("Introduzca valor de 'c'");
		c = teclado.nextDouble();
		
		P = (a+b+c)/2;
		
		System.out.println("El resultado de P = " + P);
		
		A = P*(P-a)*(P-b)*(P-c); 
		
    Heron = Math.pow(A , 2);
    
    System.out.println("A =" + A + "=" + Heron);
    
    
    
    

    
    if (a == b && a != c  && b != c)
    System.out.println("isosceles");
    
    if (a == c && a != b  && b != c)
    	
    	System.out.println("isosceles");
    
    if (b == c && a != b  && a != c)
    	
    	System.out.println("isosceles");
    
    if (a == c && a == b  )
     System.out.println("equilatero");
     
   
      if(a != b && a != c && b!= c)
    	System.out.println("escaleno");
    	
    }
	}
		
	
	

