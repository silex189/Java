package chapter12_Enum_Autoboxing_staticImport_annotations;

public class EnumDemo4 {

	public static void main(String[] args) {
		Transport transport1, transport2, transport3;
		
		System.out.println("Here are all Transport constants and their ordinal values: ");
		for (Transport t : Transport.values())
			System.out.println(t + " " + t.ordinal());
		
		transport1 = Transport.AIRPLANE;
		transport2 = Transport.TRAIN;
		transport3 = Transport.AIRPLANE;
		
		System.out.println();
		
		if (transport1.compareTo(transport2) < 0)
				System.out.println(transport1 + " comes before " + transport2);
		
		if (transport1.compareTo(transport2) > 0)
				System.out.println(transport2 + " comes before " + transport1);
		
		if (transport1.compareTo(transport3) == 0)
				System.out.println(transport1 + " equals " + transport3);

	}

}
