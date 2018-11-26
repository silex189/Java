package chapter12_Enum_Autoboxing_staticImport_annotations;

public enum Transport {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	private int speed;
	
	private Transport(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() { return speed; }
}