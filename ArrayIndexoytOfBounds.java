package exceptionhandling;

public class ArrayIndexoytOfBounds {
    public static void main(String[] args) {
    	try {
        int ar[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i <= ar.length; i++)
            System.out.println(ar[i]);
    	}
    	catch(ArrayIndexOutOfBoundsException Aie) {
    		Aie.printStackTrace();
    		System.err.println("Intex out of bounds for length");
    	}
    }
}


