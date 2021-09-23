import java.util.Random;

public class Chamada extends ThreadChamada{
		
	static public void iniciarchamada(int  num1, int cod1, int ante11, int ante12, int num2, int cod2, int ante21, int ante22) {
		System.out.println("Chamada de: "+num1 + " para" +num2 + "...");
		(new Thread(new ThreadChamada())).start();
		
	}
}
