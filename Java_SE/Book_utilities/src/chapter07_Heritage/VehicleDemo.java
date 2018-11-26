package chapter07_Heritage;

class Vehicle {

	private int passengers;
	private int fuelCapacity;
	private int milesPerGallon;

	Vehicle(int passengers, int fuelCapacity, int milesPerGallon) {
		this.passengers = passengers;
		this.fuelCapacity = fuelCapacity;
		this.milesPerGallon = milesPerGallon;
	}

	int range() {
		return milesPerGallon * fuelCapacity;
	}

	double fuelNeeded(int miles) {
		return (double) miles / milesPerGallon;
	}

	public int getPassengers() { return passengers; }

	public void setPassengers(int passengers) { this.passengers = passengers; }

	public int getFuelCapacity() { return fuelCapacity; }

	public void setFuelCapacity(int fuelCapacity) { this.fuelCapacity = fuelCapacity; }

	public int getMilesPerGallon() { return milesPerGallon; }

	public void setMilesPerGallon(int milesPerGallon) { this.milesPerGallon = milesPerGallon; }
	
}

class Truck extends Vehicle {
	private int cargoCapacity;

	Truck(int passengers, int fuelCapacity, int milesPerGallon, int cargoCapacity) {
		super(passengers, fuelCapacity, milesPerGallon);
		this.cargoCapacity = cargoCapacity;
	}

	int getCargoCapacity() {
		return cargoCapacity;
	}

	void putCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
}

public class VehicleDemo {

	public static void main(String[] args) {
		
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportCar = new Vehicle(2, 14, 12);

		double gallons;
		int distance = 252;

		gallons = minivan.fuelNeeded(distance);
		System.out.println("To go " + distance + " miles, minivan needs " + gallons + " gallons of fuel.");

		gallons = sportCar.fuelNeeded(distance);
		System.out.println("To go " + distance + " miles, minivan needs " + gallons + " gallons of fuel.");
		
		System.out.println();

		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		
		gallons = semi.fuelNeeded(distance);

		System.out.println("Semi can carry " + semi.getCargoCapacity() + " pounds.");
		System.out.println("To go " + distance + " miles semi needs " + gallons + " gallons of fuel.\n");

		gallons = pickup.fuelNeeded(distance);

		System.out.println("Pickup can carry " + pickup.getCargoCapacity() + " pounds.");
		System.out.println("To go " + distance + " miles pickup needs " + gallons + " gallons of fuel.");

	}
}
