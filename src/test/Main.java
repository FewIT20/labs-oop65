package test;

public class Main {

	public static void main(String[] args) throws Exception {
		Thread thread = new Thread(new PangWorker("Sila"));
		Thread thread_2 = new Thread(new PangWorker("Balloon"));
		thread.start();
		thread_2.start();
	}
	
	
}
