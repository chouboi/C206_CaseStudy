import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Order> orderList = new ArrayList<Order>();

	}

	public static void addOrder(ArrayList<Order> orderList) {

		int addOption = 0;
		int id = 1001;

		while (addOption != 2) {
			boolean isAdded = false;
			System.out.println("1. Add Lunchbox order");
			System.out.println("2. Return to mainpage");
			addOption = Helper.readInt("Enter option > ");
			if (addOption == 1) {
				String Date = Helper.readString("Enter Date > ");
				String meal = Helper.readString("Enter meal > ");
				String drink = Helper.readString("Enter drink > ");
				String fruit = Helper.readString("Enter fruit > ");
				if (Date.isEmpty() == false && meal.isEmpty() == false && drink.isEmpty() == false
						&& fruit.isEmpty() == false) {
					orderList.add(new Order(id, Date, meal, drink, fruit));
					isAdded = true;
					id += 1;
					System.out.println("Added sucessfully!");
				} else if (isAdded = false) {
					System.out.println("Add Failed!");
				}
			} else if (addOption == 2) {
				// C206_CaseStudy.parentMenu();
			}

		}
	}

	public static void viewLunchBox(ArrayList<Order> orderList) {
		String output = String.format("%-10s %-10s %-10s %-10s %-10s\n", "ID", "Date", "Meal", "Drink", "Fruit");

		for (Order i : orderList) {
			output += String.format("%-10s %-10s %-10s %-10s %-10s\n", i.getID(), i.getDate(), i.getMeal(),
					i.getDrink(), i.getFruit());
		}

		System.out.println(output);
	}

	private static void deleteLunchBoxOrder(ArrayList<Order> orderList) {

		int orderID = Helper.readInt("Enter Item ID to delete > ");

		for (int i = 0; i < orderList.size(); i++) {
			if (orderID == orderList.get(i).getID()) {
				orderList.remove(i);
			}
		}

	}

	
	// for test case methods

	public static String retrieveAllOrders(ArrayList<Order> orderList) {

		String output = "";

		for (int i = 0; i < orderList.size(); i++) {
			output += String.format("%-10d %-10s %-10s %-10s %-10s\n", orderList.get(i).getID(),
					orderList.get(i).getDate(), orderList.get(i).getMeal(), orderList.get(i).getDrink(),
					orderList.get(i).getFruit());
		}

		return output;

	}

	public static Order inputOrder() {
		int id = Helper.readInt("Enter ID > ");
		String Date = Helper.readString("Enter Date > ");
		String meal = Helper.readString("Enter meal > ");
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");

		Order o = new Order(id, Date, meal, drink, fruit);

		return o;

	}

	public static void addOrders(ArrayList<Order> orderList, Order o) {

		orderList.add(o);

	}

	public static boolean doDeleteOrder(ArrayList<Order> orderList, int id) {

		boolean isDeleted = false;

		for (int i = 0; i < orderList.size(); i++) {

			int itemID = orderList.get(i).getID();

			if (id == itemID && orderList.get(i).getIsAvailable() == true) {

				orderList.get(i).setIsAvailable(false);
				isDeleted = true;

			}
		}
		return isDeleted;
	}

}
