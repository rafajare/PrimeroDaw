/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Taller {

    // Atributos de instancia 
    
	private String nombre="TallerDeCoches";
	private String direccion;
	private String hora_apertura;
	private String hora_cierre;
	private int numCoches;
	private Coche[] coches; 
	
    // Atributos de clase
    /** Numero maximo de coches en el taller. */
    private static int NUM_MAX_COCHES = 50;

    
    /** 
     *  Construye un objeto de la clase {@code Taller} con direccion {@code direccion}, hora_apertura {@code hora_apertura}, 
     *  hora_cierre {@code hora_cierre}, nombre {@code nombre} que será TallerdeCoches.
     *  
     *  @param direccion_ String. 
     *  @param hora_apertura_ String.
     *  @param hora_cierre_ String.
     */
    Taller(String direccion_, String hora_apertura_, String hora_cierre_) {
    	coches = new Coche[NUM_MAX_COCHES];
    	direccion=direccion_;
    	hora_apertura=hora_apertura_;
    	hora_cierre=hora_cierre_;
    	nombre=nombre;
    	
		//LLAMAR A CARGAR
    	Taller t = null;
    	t.cargar();
    	// FIN DE LLAMAR A CARGAR
    	
    
    }

    
    /** 
     *  Devuelve los coches que tiene o ha tenido {@code coches} el Taller {@code Taller}.
     *  @return String.
     */ 
    public Coche[] getCoches() {
        return coches;
    }

    /** 
     *  Devuelve la direccion {@code direccion} del {@code Taller}.
     *  @return String.
     */ 
    public String getDireccion() {
        return direccion;
    }

    /** 
     *  Devuelve la hora de apertura {@code hora_apertura} del {@code Taller}.
     *  @return String.
     */ 
    public String getHora_apertura() {
        return hora_apertura;
    }

    /** 
     *  Devuelve la hora de cierre {@code hora_cierre} del {@code Taller}.
     *  @return String.
     */ 
    public String getHora_cierre() {
        return hora_cierre;
    }


    
    /** 
     *   Dada una matricula {@code matricula}, 
     *   devuelve un valor true si existe un coche con esa matrícula que ha estado en el Taller.
     *   En caso contrario, devuelve un valor false.
     *   
     *   @param matricula String.
     */    
    public boolean existeCoche(String matricula )  {
        
    	
        boolean encontrado = false;

		for (int i = 0; i < NUM_MAX_COCHES && encontrado == false; i++) {
			if (coches[i] != null) {

				if (matricula.equals(coches[i].getMatricula())){
					encontrado = true;
				}

			}
		}
        return encontrado;
        
    }
    
    
    
    /** 
     *   Dada un coche {@code coche}, 
     *   añade el coche al array de coches del taller e incrementa el número 
     *   de coches que están en el taller.
     *   @param Coche coche
     *   @return String.
     */  
    public String anyadirCoche(Coche coche) {
        
        String msg = "";
        boolean anyadido = false;
        if (!existeCoche(coche.getMatricula())) {
            for (int i = 0; i < coches.length && !anyadido; i++) {
                if (coches[i] == null) {
                    coches[i] = coche;
                    anyadido = true;
                    numCoches++;
                    msg = "El coche ha sido anyadido con éxito\n";
                }
            }
        } else {
            msg = "El coche ya está en el taller\n";
        }
        return msg;
    }

    
    /** 
     *  Dado una matricula {@code matricula},
     *  si existe un coche con esa matricula, el coche se borra del array de coches {@code coches} del Taller {@code Taller}
     *  y devuelve el {@code String}: "El coche ha sido eliminado con éxito"
     *  En caso contrario, la cancelacion no es posible y devuelve el {@code String}:
     *  "El coche no está en el taller"
     *  @param String matricula.
     *  @return String.
     */ 
    public String borrarCoche(String matricula) {
        String msg = "";
       
		boolean existe = existeMatricula(matricula);
		boolean borrado = false;
		if (existe == true) {

			for (int i = 0; i < coches.length && borrado == false; i++) {
				if (coches[i].getMatricula().equals(matricula)) {
					coches[i] = null;
					numCoches--;
					msg = "El coche ha sido eliminado con �xito";
					borrado = true;
				}
			}
			
		}else{
			msg="El coche no est� en el taller";
		}
        return msg;
        
    }


    private boolean existeMatricula(String matricula) {
		// TODO Auto-generated method stub
		return false;
	}


	/** 
     *  Devuelve un {@code String} con los coches que están actualmente en el taller
     * y que sean de un determinado modelo y tengan una determinada antiguedad.
     *  @param String modelo.
     *  @param int antiguedad.
     *  @return String.
     */
    public String filtroCoches(String modelo, int antiguedad) { //REVISAR
        String listaCoches = "";
        
	for(int i=0;i<coches.length;i++){
			
		if(coches[i]!=null){
		listaCoches=listaCoches+coches[i].toString()+"\n";
	
		}
	}
        return listaCoches;
    }
    
    
    /** 
     *  Devuelve un {@code Coche} que tenga una matrícula igual a {@code matricula}.
     *  Si no encuentra el coche, devuelve un null.
     *  @param String matricula.
     *  @return Coche.
     */
    
    public Coche buscaCoche(String matricula){
        Coche cocheEncontrado = null;
        
		
		boolean encontrado = false;

		for (int i = 0; i < NUM_MAX_COCHES && encontrado == false; i++) {
			if (coches[i] != null) {

				if (matricula.equals(coches[i].getMatricula())) {
					encontrado = true;
					cocheEncontrado=coches[i];
					
				}

			}
		}
        
        return cocheEncontrado;
        
    }
    
    
    /** 
     *  Devuelve un {@code String} con un informe sobre las diferencias y las similitudes entre
     *  dos coches. El informe será un String que mostrará información sobre las antiguedades 
     *  de los coches, los colores, los modelos y los talleres. 
     *  @param Coche c1.
     *  @param Coche c2.
     *  @return String.
     */
    public String comparaCoches(Coche c1, Coche c2){ // ??
        
        String informe = "";
        
        int [ ] Coche = {1};
        for (int i=0; i<coches.length; i++) {
            System.out.print ("coches[" + i +"]= " + coches[i]+"; ");
        
            System.out.println("");
            int [ ] coches = {2};
            for (i=0; i<coches.length; i++) {
            System.out.print ("coches[" + i +"]= " + Coche[i]+"; ");}
            System.out.println("");
            System.out.println ("�Son el mismo objeto? ... " + (Coche==coches) );
            System.out.println("");
            coches = Coche;   
            for (i=0; i<coches.length; i++) {
                System.out.print ("coches[" + i +"]= " + coches[i]+"; ");}
            System.out.println("");
            System.out.println ("�Son el mismo objeto? ... " + (Coche==coches) );
        }
        return informe;
    }
    
    
    
    /** 
     *  Escribe en un fichero llamado {@code nombre}, nombre del {@code Taller}, toda la informacion del mismo.   
     */
    public void guardar()throws FileNotFoundException {
	 
	
    	PrintWriter out=new PrintWriter("TallerDeCoches.txt");
    	out.print("Numero de coches"+ numCoches);
    	for(int i =0; i < coches.length;i++){
		if(coches[i]!=null){
    			out.println(coches[i].toString());
    }
}
	out.close();
	System.out.println("GUARDADO CON EXITO");
    } // de guardar
    
    
   
    /** 
     *  Lee desde fichero toda la informacion de los coches 
     *  que están o que han estado en el Taller y los va almacenando en el 
     *  array de coches {@code coches}.
     */    
    public void cargar() {
    
        Scanner fichero=new Scanner ("TallerDeCoches.txt");
        	
     
        fichero.next();
        int numCoches_=fichero.nextInt();
        for(int i=0; i< coches.length; i++){
        fichero.nextLine();
        
        String matricula=fichero.next();
        String color=fichero.next();
        String modelo=fichero.next();
        int antiguedad = fichero.nextInt();
        boolean enTaller= fichero.nextBoolean();
        Coche c = new Coche(matricula, color , modelo , enTaller , antiguedad);
        coches[i] =c;
        i++;
        
        }
        
    
    } // de cargar
    
    
}
