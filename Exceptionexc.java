package exceptionhandling;
import java.util.*;

public class Exceptionexc {
	public static void main(String[] args) {
//		System.out.println("program start");
//		int a=10;
//		int b=2;
//		int c=a/b;
//		System.out.println(c);
//		System.out.println("program done");
		
		System.out.println("program start");
		try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException Ae) {
			Ae.printStackTrace();
			System.err.println("dont again give 0");
			
		}
		System.out.println("program done");
		// in this type of error called print stack trace
	}

}
