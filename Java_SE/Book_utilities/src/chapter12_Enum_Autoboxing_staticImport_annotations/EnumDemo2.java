package chapter12_Enum_Autoboxing_staticImport_annotations;

public class EnumDemo2 {

	public static void main(String[] args) {
		Transport transport;
		System.out.println("Here all Transport constants");

		Transport allTransports[] = Transport.values();

		for (Transport t : allTransports)
			System.out.println(t);

		System.out.println();

		transport = Transport.valueOf("AIRPLANE");
		System.out.println("transport contains " + transport);

	}

}
