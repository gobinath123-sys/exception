package exceptionhandling;

public class StackOverFlowError {
	public static void methodA() {
		methodB();
		
	}
	public static void methodB() {
		methodA();
		
	}
	public static void main(String[] args) {
		methodA();
	}

}
