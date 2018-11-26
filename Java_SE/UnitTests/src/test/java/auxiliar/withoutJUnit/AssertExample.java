package test.java.auxiliar.withoutJUnit;

public class AssertExample {

	public static void main(String[] args){
		int x = 5;
		int y = 6;
		assert x==y: "x=" + x + " e y=" + y + " deberían ser iguales";
	}
}
