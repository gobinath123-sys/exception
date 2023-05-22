package exceptionhandling;
import java.util.*;

public class NumberformatException {
	public static void main(String[] args) {
 
//	         int a = Integer.parseInt(null);
	         //throws Exception as     //the input string is of illegal format for parsing as it is null.  
		
		
		
		try {
	         int a = Integer.parseInt(null);
	         System.out.println(a);
		}
		catch(NumberFormatException Ne) {
			Ne.printStackTrace();
			System.err.println("cannot parse null String");
		}
	    }  
	}

