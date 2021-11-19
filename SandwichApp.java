import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
public class SandwichApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bread;
		double price;
		ArrayList<String> vegetables = new ArrayList<String>();
		String meat;
		String name;
		String time;
		char repeat = 'n';
		do {
		String[] breadType = {"White Bread", "Wheat Bread", "French Bread", "Organic Bread"};
		double[] breadPrice = {1.50, 1.60, 1.70, 1.80};
		
		System.out.println("=== Select Sandwich Bread: ===");
		System.out.println("1 White Bread $1.5");
		System.out.println("2 Wheat Bread $1.6");
		System.out.println("3 French Bread $1.7");
		System.out.println("4 Organic Bread $1.8");
		System.out.println("Select a bread [1,4]:");
		int num = Validator.getInt(sc, "Please enter a number between 1 and 4", 1, 4);
		bread = breadType[num-1];
		
		String[] vegetableType = {"red onions", "olives", "pickles", "lettuce", "green peppers", "tomatoes", "cheese",};
		double[] vegetablePrice = {0.10, 0.10, 0.15, 0.15, 0.20, 0.20, 0.50};
		int num2 = 0;
		double price2 = 0.00;
		
		do {
		System.out.println("=== Select Sandwich Vegetables: ===");
		System.out.println("1 red onions $0.10");
		System.out.println("2 olives $0.10");
		System.out.println("3 pickles $0.15");
		System.out.println("4 lettuce $0.15");
		System.out.println("5 green peppers $0.20");
		System.out.println("6 tomatoes $0.20");
		System.out.println("7 cheese $0.50");
		System.out.println("8 Quit vegetable selection");
		System.out.println("Select vegetables [1,8]:");
		num2 = Validator.getInt(sc, "Please enter a number between 1 and 8", 1, 8);
		if(num2 !=8)
			{
			vegetables.add(vegetableType[num2 - 1]);
			price2 += vegetablePrice[num2-1];
			}
		}while (num2 != 8);
		
		String[] meatType = {"Ham", "Roasted Chicken Breast", "Turkey Breast", "Roast Beef", "No Meat"};
		double[] meatPrice = {1.10, 1.20, 1.30, 1.40, 0.00};
		System.out.println("=== Select Sandwich Meat: ===");
		System.out.println("1 Ham $1.1");
		System.out.println("2 Roasted Chicken Breast $1.2");
		System.out.println("3 Turkey Breast $1.3");
		System.out.println("4 Roast beef $1.4");
		System.out.println("5 No meat $0.00");
		System.out.println("Select a meat [1,5]:");
		int num3 = Validator.getInt(sc, "Please enter a number between 1 and 5", 1, 5);
		meat = meatType[num3-1];
		
		price = breadPrice[num-1] + price2 + meatPrice[num3-1];
		Sandwich s1 = new Sandwich(bread, vegetables, meat, price);
		
		name = Validator.getString(sc, "Enter customer's name: ");
		
		Date now = new Date();
		DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		time = defaultDate.format(now);
		
		Order o1 = new Order(name, s1, time);
		
		System.out.println(o1.toString());
		
		SandwichIO.writeOrderToFile(o1);
		vegetables.clear();

		System.out.println("Continue to order more sandwich? (y/n): ");
		repeat = sc.next().charAt(0);
		} while (repeat == 'y');

	
		
		
		


		
		
		
		
		
	}
} 
