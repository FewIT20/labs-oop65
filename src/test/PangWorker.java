package test;

public class PangWorker implements Runnable {

	private String name;

	public PangWorker(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.name + " : " + i);
		}
	}

}
