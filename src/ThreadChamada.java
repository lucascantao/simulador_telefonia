import java.util.Random;

public  class ThreadChamada implements Runnable {
int duration=4000;
public void run() {
System.out.println("Dialing...");
Random rand = new Random();
try {
	Thread.sleep(rand.nextInt(duration));
	System.out.println("Dial ended...");	
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}
