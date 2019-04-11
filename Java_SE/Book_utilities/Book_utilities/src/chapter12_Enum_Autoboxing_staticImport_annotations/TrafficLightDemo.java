package chapter12_Enum_Autoboxing_staticImport_annotations;

public class TrafficLightDemo {

	public static void main(String[] args) {
		TrafficLightSimulator trafficLightSimulator =
				new TrafficLightSimulator(TrafficLightColor.GREEN);
		
		for (int i=0; i < 9; i++) {
			System.out.println(trafficLightSimulator.getColor());
			trafficLightSimulator.waitForChange();
		}
		
		trafficLightSimulator.cancel();
	}

}
