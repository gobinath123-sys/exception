package exceptionhandling;

public class FinalyblockException {
	public static void main(String[] args) {
		System.out.println("Program start");
		try {
		Main1 var1=null;
		System.out.println(var1.var1);
		}
		catch(NullPointerException Ne) {
			Ne.printStackTrace();
		}
		finally {
			System.out.println("Final program work");
		}
		System.out.println("program end");
	}

}
