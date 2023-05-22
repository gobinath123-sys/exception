package exceptionhandling;

public class StringOutofBounds {
	public static void main(String[] args) {
		try {
		String s = "GEEKSFORGEEKS";

		System.out.println(s.charAt(1));

		System.out.println(s.charAt(30));
		}
		catch(StringIndexOutOfBoundsException Se) {
			Se.printStackTrace();
			System.err.println("String index out of range");
		}
	}
}
