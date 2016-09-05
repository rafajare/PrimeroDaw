
public class Banco {
	private long numCuenta;
	private long DNI;
	private long saldo;
	private int interes;
	

//CONSTRUUCTOR

public Banco(){
	numCuenta=987654;
	DNI=456478984;
	saldo=250550;
}
 public void Ingresar(int valorX){
	 saldo=saldo+valorX;
 }

public void  Retirar(int valorX){
	saldo=saldo-valorX;
}

public void printCuenta(){
	System.out.println("Numero de cuenta "+numCuenta);
	System.out.println("DNI "+ DNI);
	System.out.println("Saldo disponible "+saldo);
	
}
	
	
}// FIN
