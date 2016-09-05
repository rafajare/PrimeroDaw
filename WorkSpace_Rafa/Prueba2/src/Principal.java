import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Principal {
	
	public static void main(String[] args) {

		String fechaS = "07/05/2015";
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fechaD = null;
		
		try {
			fechaD = formato.parse(fechaS);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("La fecha queda como "+fechaD);
		
	}

}
