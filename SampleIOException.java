package exceptionhandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SampleIOException {
	public static void main(String[]args) throws IOException {
    try {
	File f=new File("D\\Hello.txt");
	FileReader fr=new FileReader(f);
	int temp=0;
	while((temp=fr.read())!=-1) {
		System.out.print((char)(temp));

	}
    }
    catch(Exception Ec) {
    	Ec.printStackTrace();
    	System.err.println("File not found");
    }
	}

}
