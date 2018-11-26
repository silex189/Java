package chapter05_Other_Data_Types_And_Operators;

public class XORencoder {

	public static void main(String[] args) {
		
		String message = "This is a test";
		String encodedMessage = "";
		String decodedMessage = "";
		int key = 88;

		System.out.println("Original message: " + message);

		for(int i=0; i < message.length(); i++)
			encodedMessage = encodedMessage + (char) (message.charAt(i) ^ key);

		System.out.println("Encoded message: " + encodedMessage);

		for(int i=0; i < message.length(); i++)
			decodedMessage = decodedMessage + (char) (encodedMessage.charAt(i) ^ key);

		System.out.println("Decoded message: " + decodedMessage);

	}

}
