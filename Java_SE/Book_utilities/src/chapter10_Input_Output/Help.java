package chapter10_Input_Output;

import java.io.*;

public class Help {
	String helpFile;

	Help(String helpFile) {
		this.helpFile = helpFile;
	}

	boolean helpOn(String what) {
		int character;
		String topic, info;

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(helpFile))) {

			do {
				character = bufferedReader.read();
				if (character == '#') {
					topic = bufferedReader.readLine();
					if (what.compareTo(topic) == 0) {
						do {
							info = bufferedReader.readLine();
							if (info != null)
								System.out.println(info);
						} while ((info != null) && (info.compareTo("") != 0));
						return true;
					}
				}
			} while (character != -1);
		} catch (IOException exception) {
			System.out.println("Error accessing help file.");
			return false;
		}
		return false;
	}

	String getSelection() {
		String topic = "";

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter topic: ");
		try {
			topic = bufferedReader.readLine();
		} catch (IOException exception) {
			System.out.println("Error reading console.");
		}
		return topic;
	}

}
