package exceptionhandling;
import java.util.*;

public class VoterEligibility {
	public static void main(String[] args) throws AgeException {
		int age=10;
		if(age>=18) {
			System.out.println("eligible");
		}
		else {
			throw new AgeException("age not eligible");
		}
	}

}
