package chapter14_Lambdas;

import java.io.*;

@FunctionalInterface
interface MyIOAction {
	boolean ioAction(Reader reader) throws IOException;
}

public class LambdaException {

	public static void main(String[] args) {
		
		
		MyIOAction myIOAction = (reader) -> {
			int ch = reader.read();
			
			//....
			return true;
		};

	}

}
