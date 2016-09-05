

public class prueba{
	
    public static void main(String args[]){
    	
    	
        Medico m = new Medico("pedro", "assadfafds", 23);
        Medicoconplaza m2 = new Medicoconplaza("nombre", "apellidos", 44, 0x4e720);
        Medicointerno mi1 = new Medicointerno("sfadasdf", "fasdjajgf", 22, "12/24/45");
        Registromedicos r = new Registromedicos();
        r.addmedico(m);
        r.addmedico(m2);
        r.addmedico(mi1);
        r.listar();
       
    }
}
