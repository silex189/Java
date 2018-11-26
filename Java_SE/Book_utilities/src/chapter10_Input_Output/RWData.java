package chapter10_Input_Output;

import java.io.*;

public class RWData {

	public static void main(String[] args) {
		int i = 10;
		double d = 1023.56;
		boolean b = true;

		try (DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream("testing_files/testdata"))) {

			System.out.println("Writing " + i);
			dataOutput.writeInt(i);

			System.out.println("Writign " + d);
			dataOutput.writeDouble(d);

			System.out.println("Writing " + b);
			dataOutput.writeBoolean(b);

			System.out.println("Writing " + 12.2 * 7.4);
			dataOutput.writeDouble(12.2 * 7.4);

		} catch (IOException exception) {
			System.out.println("Write error.");
			return;
		}

		System.out.println();

		try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("testing_files/testdata"))) {

			i = dataInputStream.readInt();
			System.out.println("Reading " + i);

			d = dataInputStream.readDouble();
			System.out.println("Reading " + d);

			b = dataInputStream.readBoolean();
			System.out.println("Reading " + b);

			d = dataInputStream.readDouble();
			System.out.println("Reading " + d);

		} catch (IOException exception) {
			System.out.println("Read error.");
		}

	}

}
