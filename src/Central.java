import java.util.*;

public class Central {
	
	private Antena[] array_antenas = new Antena[5];
	private Numero[] array_numeros = new Numero[20];
	
	//METHODS
	
	public String generateId() {
		Random r = new Random();
		String id;
		
		while(true) {
			id = "";
			for(int i = 0; i < 6; i++) {
				id = String.join("", id, String.valueOf(r.nextInt(10)));
			}
			if(!validateId(id)) {
				continue;
			}
			break;	
		}
		return id;
	}
	
	public boolean validateId(String id) {

		for(int i=0; i<array_antenas.length; i++ ) {
			if(array_antenas[i] != null && array_antenas[i].getID_antenna() == id) {
				return false;
			}
		}
		return true;
	}
	
	public int generateNumero() {
		Random r = new Random();
		
		String n = "9";
		for(int i = 0; i < 8; i++) {
			n = String.join("", n, String.valueOf(r.nextInt(10)));
		}
		return Integer.parseInt(n);
	}
	
	public void InitAntenas() {
		for(int i = 0; i < array_antenas.length; i++) {
			array_antenas[i] = new Antena(generateId(), 3);
		}
	}
	
	public void InitNumeros() {
		Random r = new Random();
		for(int i = 0; i < array_numeros.length; i++) {
			array_numeros[i] = new Numero(generateNumero(), r.nextInt(3) + 1, array_antenas[r.nextInt(5)].getID_antenna());
		}
	}
	
	static public boolean realizarChamada(String antena, int num1, int num2) {
		if (num1 == num2) return false;
		
		
		return false;
	}
}
