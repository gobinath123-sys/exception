package exceptionhandling;
import java.util.*;

public class NullpointException {

    public static void main(String[] args) {
    	try {
    	int val=10;
        Main m = null; 
        System.out.println(m.val);
        
    	}
    	catch(NullPointerException Ne) {
    		Ne.printStackTrace();
    		System.err.println("cannot read field val because m is null");
    	}
		finally {
			System.out.println("Final program work");
		}
		System.out.println("program end");

    }
}
