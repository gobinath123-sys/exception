package exceptionhandling;

public class GmailWork {
	public static void main(String[] args) throws GmailId {
		String g="@gmailcom";
		if(g.contains("@gmail.com")) {
			System.out.println("Gmail is work");
		}
		else {
			throw new GmailId("Gmail Id wrong");
		}
		
	}

}
