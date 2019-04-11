package chapter05_Other_Data_Types_And_Operators;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int sample[] = new int[10];

		for(int i = 0; i < sample.length; i++)
			sample[i] = i;

		for(int i = 0; i < sample.length; i++)
			System.out.println("This sample[" + i + "]:" + sample[i]);
	}
}
