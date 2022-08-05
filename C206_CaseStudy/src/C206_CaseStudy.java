import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int OPTION_QUIT = 5;

	public static void main(String[] args) {
		ArrayList<Items> itemList = new ArrayList<Items>();
// test

	private static void addMenuItems(ArrayList<Items> itemList) {

		itemList.add(new Items(1001, "Chicken Chop", "Western", 4.50));
		itemList.add(new Items(1002, "Cripsy Chicken", "Western", 5.00));
		itemList.add(new Items(1003, "Aglio olio Pasta", "Western", 3.50));
		itemList.add(new Items(1004, "Baked Chicken Rice", "Western", 5.00));
		itemList.add(new Items(1005, "Creamy Chicken Pasta", "Western", 4.50));

		itemList.add(new Items(1006, "Pineapple Fried Rice", "Asian", 3.50));
		itemList.add(new Items(1007, "Beef Noodles", "Asian", 4.50));
		itemList.add(new Items(1008, "Hokkien Noodles", "Asian", 4.00));
		itemList.add(new Items(1009, "Wanton Mee", "Asian", 3.50));
		itemList.add(new Items(1010, "Chicken Rice", "Asian", 3.00));

		itemList.add(new Items(1011, "Carrot Cake", "Vegetarian", 2.00));
		itemList.add(new Items(1012, "Pumpkin Porridge", "Vegetarian", 2.50));
		itemList.add(new Items(1013, "Chicken Rice", "Vegetarian", 2.50));
		itemList.add(new Items(1014, "Rojak", "Vegetarian", 3.00));
		itemList.add(new Items(1015, "Salad Bowl", "Vegetarian", 3.50));

		itemList.add(new Items(1016, "Pokka Green Tea Packet", "Drink", 0.80));
		itemList.add(new Items(1017, "Pokka Lemon Tea Packet", "Drink", 0.80));
		itemList.add(new Items(1018, "Milo Packet", "Drink", 0.80));
		itemList.add(new Items(1019, "Yeos Soy Bean Packet", "Drink", 0.90));
		itemList.add(new Items(1020, "Pokka Peach Tea Packet", "Drink", 0.80));

		itemList.add(new Items(1021, "1 cup Apple", "Fruit", 0.90));
		itemList.add(new Items(1022, "1 cup Orange", "Fruit", 0.90));
		itemList.add(new Items(1023, "1 cup Honey Dew", "Fruit", 1.00));
		itemList.add(new Items(1024, "1 cup Kiwi", "Fruit", 1.20));
		itemList.add(new Items(1025, "1 cup Watermelon", "Fruit", 1.00));

		if (itemList.isEmpty() != true) {
			System.out.println("Items are successfully added!");
		} else {
			System.out.println("Items add Failed!");
		}
	}

	private static void viewMenuItems(ArrayList<Items> itemList) {

		String output = String.format("%-10s %-30s %-25s %-20s\n", "ID", "Name", "Category", "Price");

		for (Items i : itemList) {
			output += String.format("%-10s %-30s %-25s $%-20s\n", i.getItemID(), i.getName(), i.getCategory(),
					i.getPrice());
		}

		System.out.println(output);
	}

	private static void deleteMenuItems(ArrayList<Items> itemList) {

		int itemID = Helper.readInt("Enter Item ID to delete > ");

		for (Items i : itemList) {
			if (i.getItemID() == itemID) {
				itemList.remove(i.getItemID());
			}
		}
		System.out.println(itemList);
		
	}
}