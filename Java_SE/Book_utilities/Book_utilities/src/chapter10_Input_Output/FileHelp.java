package chapter10_Input_Output;

public class FileHelp {

	public static void main(String[] args) {
		Help help = new Help("testing_files/helpFile.txt");
		String topic;

		System.out.println("Try help system. " + "Enter 'stop' to end.");
		do {
			topic = help.getSelection();
			if (!help.helpOn(topic))
				System.out.println("Topic not found.\n");
		} while (topic.compareTo("stop") != 0);

	}

}
