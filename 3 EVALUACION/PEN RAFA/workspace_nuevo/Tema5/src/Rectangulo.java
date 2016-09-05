
public class Rectangulo {
	
	//atributos
	
	int x,y;
	int x1,y1;
	int x2, y2;
	int x3,y3;
	int x4,y4;


	// constructores
	
	 public Rectangulo(int valx, int valy, int valx1, int valy1, int valx2, int valy2,int valx3, int valy3,int valx4, int valy4){
		 x=valx;
		 y=valy;
		 x1=valx1;
		 y1=valy1;
		 x2=valx2;
		 y2=valy2;
		 x3=valx3;
		 y3=valy3;
		 x4=valx4;
		 y4=valy4;
	 }

	 public Rectangulo (int base, int altura){
		 x1=0;
		 y1=0;
		 x2=base;
		 y2=0;
		 x3=base;
		 y3=altura;
		 x4=0;
		 y4=altura;
	 }


//metodos
	 public int getBase(int base){
		 return base;
		 
	 }

	 public int getAltura(int altura){
		 return altura;
	 }
}


