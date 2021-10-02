import java.util.*;

public class Central {
	
	private Antena[] array_antenas = new Antena[5];
	private Numero[] array_numeros = new Numero[20];
	
	public Central() {
		InitAntenas();
		InitNumeros();
	}
	
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
			array_numeros[i] = new Numero(generateNumero(), r.nextInt(3) + 1, array_antenas[r.nextInt(5)]);
		}
	}
	
	public Numero getNumero(int num) {
		for(int i = 0; i < array_numeros.length; i++) {
			if(array_numeros[i].getNum() == num)
				return array_numeros[i];
		}
		return null;
	}
	
	public Antena getAntena(String id) {
		for(int i = 0; i < array_antenas.length; i++) {
			if(array_antenas[i].getID_antenna() == id)
				return array_antenas[i];
		}
		return null;
	}
	
	public boolean realizarChamada(Antena antena, int req, int dest) {
		if (req == dest) return false;
		Numero request = getNumero(req); //OBJETO DO PRIMEIRO NUMERO
		Numero destiny = getNumero(dest); //OBJETO DO SEGUNDO NUMERO
		Antena antDestiny = getAntena(destiny.getAtenaID()); //ANTENA DESTINO
		
		//INIT LIGAÇÃO AQUI
		
		return false;
	}
}
