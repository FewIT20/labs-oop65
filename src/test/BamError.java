package test;

public class BamError extends Exception {
	
	public BamError(String message, double weight) {
		// TODO Auto-generated constructor stub
		super(message);
		System.out.println(weight);
	}

}
