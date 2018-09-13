package chapter4;

class Vehicle {
	
	int passengers;
	int fuelCapacity;
	int milesPerGallon;

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
	}

}
