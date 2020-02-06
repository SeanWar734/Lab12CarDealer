
public class UsedCar extends Car {
	
	double miles = 100000.00;

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}
	
	public UsedCar(String make, String model, int year, double price, double miles) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.miles = miles;
	}
	
	public UsedCar() {
		super();
	}
	
}
