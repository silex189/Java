package chapter12_Enum_Autoboxing_staticImport_annotations;

class TrafficLightSimulator implements Runnable {

	private Thread thread;
	private TrafficLightColor trafficLightColor;
	boolean stop = false;
	boolean changed = false;

	TrafficLightSimulator(TrafficLightColor trafficLightColor) {
		this.trafficLightColor = trafficLightColor;
		thread = new Thread(this);
		thread.start();
	}

	TrafficLightSimulator() {
		trafficLightColor = TrafficLightColor.RED;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				switch (trafficLightColor) {
				case GREEN:
					Thread.sleep(10000);
					break;
				case YELLOW:
					Thread.sleep(2000);
					break;
				case RED:
					Thread.sleep(12000);
					break;
				}
			} catch (InterruptedException exception) {
				System.out.println(exception);
			}
			changeColor();
		}
	}

	synchronized void changeColor() {
		switch (trafficLightColor) {
			case RED:
				trafficLightColor = TrafficLightColor.GREEN;
				break;
			case YELLOW:
				trafficLightColor = TrafficLightColor.RED;
				break;
			case GREEN:
				trafficLightColor = TrafficLightColor.YELLOW;
			}

		changed = true;
		notify();
	}
	
	synchronized void waitForChange() {
		try {
			while (!changed) {
				wait();
			} changed = false;
		
		} catch (InterruptedException exception) {
			System.out.println(exception);
		}
	}
	
	synchronized TrafficLightColor getColor() {
		return trafficLightColor;
	}
	
	synchronized void cancel() {
		stop = true;
	}
	
	
	
	
}
