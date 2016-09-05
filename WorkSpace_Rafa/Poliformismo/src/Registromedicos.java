import ejercicio2.vehiculos;



public class Registromedicos{
	
	  private Medico arrayMedicos[];
	 

    public Registromedicos(/*No necesita declararse aqui los arryas*/)    {
        arrayMedicos = new Medico[50];
    }

    public void addmedico(Medico medico_){
        boolean insertado = false;
        for(int i = 0; i < arrayMedicos.length && insertado==false; i++)
            if(arrayMedicos[i] == null)
            {
                arrayMedicos[i] = medico_;
                insertado = true;
                
               
            }
      

    }
    
    public void eliminarmedico(String nombre){
    	
    
    	
        
		boolean existe = existeMedico(nombre);
		boolean borrado = false;
		if (existe == true) {

			for (int i = 0; i < arrayMedicos.length && borrado == false; i++) {
				if (arrayMedicos[i].getNombre().equals(nombre)) {
					arrayMedicos[i] = null;
					borrado = true;
				}
			}
			
		}
    }
    
    private boolean existeMedico(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}


    public void listar()
    {
        for(int i = 0; i < arrayMedicos.length; i++)
        {
            Medico m = arrayMedicos[i];
            if(m != null)
                m.mostrardatos();
            	System.out.println();
            
        }
       

    }

  
}
