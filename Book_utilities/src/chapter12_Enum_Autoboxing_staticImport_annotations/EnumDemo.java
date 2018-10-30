package chapter12_Enum_Autoboxing_staticImport_annotations;

enum Transport {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {

	public static void main(String[] args) {
		Transport transport;

		transport = Transport.AIRPLANE;
		System.out.println("Value of transport: " + transport);
		System.out.println();

		transport = Transport.TRAIN;
		if (transport == Transport.TRAIN)
			System.out.println("transport contains TRAIN.\n");

		switch (transport) {
		case CAR:
			System.out.println("A car carries people.");
			break;
		case TRUCK:
			System.out.println("A truck carries freight.");
			break;
		case AIRPLANE:
			System.out.println("An airplane flies.");
			break;
		case TRAIN:
			System.out.println("A train runs on rails.");
			break;
		case BOAT:
			System.out.println("A boat sails on water.");
			break;
		}

	}

}
