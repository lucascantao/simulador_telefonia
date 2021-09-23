import java.util.Random;
public class Main{

	public static void main(String args[]) throws InterruptedException {
		int duration=4000;
		while(true) {
		Chamada.iniciarchamada(1,2,3,4,5,6,7,8);
		Random rand = new Random();
		Thread.sleep(rand.nextInt(duration));
		}
		}

	}

