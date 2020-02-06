import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		List<Car> newList = new ArrayList<Car>();

		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to Warchuck Motor admin console.");
		System.out.println("How many cars are you looking at inputing today??");
		
		int numChoice = scnr.nextInt();
		
		for (int i = 0; i < numChoice; i++) {
			scnr.nextLine();

			Car car = new Car();

			String tempMake = Validator.getString(scnr, "Please enter the Make: ");
			car.setMake(tempMake);

			String tempModel = Validator.getString(scnr, "Please enter the Model: ");
			car.setModel(tempModel);

			int tempYear = Validator.getInt(scnr, "Please enter the Year:  ");
			car.setYear(tempYear);

			double tempPrice = Validator.getDouble(scnr, "Please enter the Price:  ");
			car.setPrice(tempPrice);

			newList.add(car);
		}
		System.out.println("Here is the inventory you added: ");
		for (Car car : newList) {
			
			System.out.printf("Make: %-15s Model: %-15s Year %-15d Price: %-15.2f",car.make, car.model, car.year, car.price);
			System.out.println();
		}
		scnr.close();
	}

}
