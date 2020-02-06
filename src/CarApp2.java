import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		List<Car> carList = new ArrayList<Car>();

		Car car1 = new Car("Chevrolet", "Camaro", 1980, 9999.99);
		Car car2 = new Car("Ford", "Mustang", 1994, 12999.99);
		Car car3 = new Car("Toyota", "Supra", 1999, 39999.99);
		UsedCar car4 = new UsedCar("Tesla", "Model S", 2019, 7999.99, 100001);
		UsedCar car5 = new UsedCar("Porsche", "Cayman", 2020, 5989.99, 200000);
		UsedCar car6 = new UsedCar("Lamborghini", "Aventador S", 2018, 2999.99, 195000);

		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
		carList.add(car6);
		System.out.println("Here is the current stock for Warchuck Motors: ");

		int i = 1;
		for (Car car : carList) {
			if (car.getClass().equals(Car.class)) {
				System.out.print(i + ") ");
				System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f", car.make, car.model, car.year,
						car.price);
				System.out.println();
				i++;
			} else if (car.getClass().equals(UsedCar.class)) {
				UsedCar car99 = (UsedCar) car;
				System.out.print(i + ") ");
				System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f Miles: %-15.2f", car99.make,
						car99.model, car99.year, car99.price, car99.miles);
				System.out.println();
				i++;
			}
		}
		System.out.println("What would you like to pick up today?");
		int choice = scnr.nextInt();

		switch (choice) {
		case 1:
			System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f", car1.make, car1.model, car1.year,
					car1.price);
			System.out.println();
			System.out.println("Is this the car you would like? (y/n)");
			String choice2 = scnr.nextLine();
			scnr.nextLine();
			if (choice2.equalsIgnoreCase("y")) {
				carList.remove(0);
			}
			break;
		case 2:
			System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f", car2.make, car2.model, car2.year,
					car2.price);
			System.out.println();
			System.out.println("Is this the car you would like? (y/n)");
			String choice3 = scnr.nextLine();
			scnr.nextLine();
			if (choice3.equalsIgnoreCase("y")) {
				carList.remove(1);
			}
			break;
		case 3:
			System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f", car3.make, car3.model, car3.year,
					car3.price);
			System.out.println();
			System.out.println("Is this the car you would like? (y/n)");
			String choice4 = scnr.nextLine();
			scnr.nextLine();
			if (choice4.equalsIgnoreCase("y")) {
				carList.remove(2);
			}
			break;
		case 4:
			System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f Miles: %-15.2f", car4.make,
					car4.model, car4.year, car4.price, car4.miles);
			System.out.println();
			System.out.println("Is this the car you would like? (y/n)");
			String choice5 = scnr.nextLine();
			scnr.nextLine();
			if (choice5.equalsIgnoreCase("y")) {
				carList.remove(3);
			}
			break;
		case 5:
			System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f Miles: %-15.2f", car5.make,
					car5.model, car5.year, car5.price, car5.miles);
			System.out.println();
			System.out.println("Is this the car you would like? (y/n)");
			String choice6 = scnr.nextLine();
			scnr.nextLine();
			if (choice6.equalsIgnoreCase("y")) {
				carList.remove(4);
			}
			break;
		case 6:
			System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f Miles: %-15.2f", car6.make,
					car6.model, car6.year, car6.price, car6.miles);
			System.out.println();
			System.out.println("Is this the car you would like? (y/n)");
			String choice7 = scnr.nextLine();
			scnr.nextLine();
			if (choice7.equalsIgnoreCase("y")) {
				carList.remove(5);
			}
			break;
		}

		i = 1;
		System.out.println("Here is your new Stock: ");
		for (Car car : carList) {
			if (car.getClass().equals(Car.class)) {
				System.out.print(i + ") ");
				System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f", car.make, car.model, car.year,
						car.price);
				System.out.println();
				i++;
			} else if (car.getClass().equals(UsedCar.class)) {
				UsedCar car99 = (UsedCar) car;
				System.out.print(i + ") ");
				System.out.printf("Make: %-15s Model: %-15s Year: %-15d Price: %-15.2f Miles: %-15.2f", car99.make,
						car99.model, car99.year, car99.price, car99.miles);
				System.out.println();
				i++;
			}
		}
		System.out.println("Enjoy your new Ride!");
		scnr.close();
	}

}
