package ejercicio2;


	public class vehiculos{
	
		private String color;
	    private int numserie;

    public vehiculos(String color_, int numserie_)
    {
        color = color_;
        numserie = numserie_;
    }

    public String toString()
    {
        String cadena = "";
        cadena = "Color: "+ color+" \n" + " Numero de Serie: "+numserie+"\n";
        return cadena;
    }

    public int getNumserie()
    {
        return numserie;
    }
   
    public void setNumSerie(int numserie){
    	this.numserie=numserie;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

   
}
