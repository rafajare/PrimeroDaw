public class ticket {

	// Atributos

	private int price;
	private int balance;
	private int total;

	// Constructor

	public ticket(int ticketCost) {

		price = ticketCost;
	}

	// Metodos
	public int getPrice() {
		return price;
	}

	public int getBalance() {
		return balance;

	}

	public void insertMoney(int amount){
		 if(amount>0){
			 balance=balance+amount;
		 }
	}
	
	 public void printTicket(){
			 if(balance>=price){
				 	balance=balance-price;
				 	total=total+price;
				 	System.out.println("Se ha imprimido el ticket");
				 	System.out.println("Cantidad a devolver"+balance);
			 }else{
			System.out.println("No se puede imprimir el ticket");
			int cantidadFalta=price-balance;
			System.out.println("La cantidad que falta es: "+cantidadFalta);
			 
			 }
	 	}//print ticket
				 
	 
	 
	 }//clase


