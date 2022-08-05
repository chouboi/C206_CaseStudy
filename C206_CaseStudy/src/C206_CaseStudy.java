import java.util.ArrayList;

public class C206_CaseStudy {
	private static final int ADMIN_OPTION_QUIT = 13;
	private static final int PARENT_OPTION_QUIT = 6;
	private static final int STUDENT_OPTION_QUIT = 5;
	private static int inputOption = 0;

	private static final int OPTION_QUIT = 3;

	public static void main(String[] args) {
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(new Account("admin", "admin", "admin"));
		ArrayList<Items> itemList = new ArrayList<Items>();

		int option = 0;
		int choice = 0;
		while (option != OPTION_QUIT) { // this is similar to saying (option != 3)
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > "); // prompt user to input an option
			
			if (option == 1) { // create an account
				C206_CaseStudy.createAccount(accountList);
			} else if (option == 2) { // create login
				C206_CaseStudy.login(accountList);
				if (inputOption == -1) {
					choice = Helper.readInt("Enter menu option > ");
					while (choice != ADMIN_OPTION_QUIT) {
						if (choice == 1) {

						} else if (choice == 2) {

						} else if (choice == 3) {

						} else if (choice == 4) {
							C206_CaseStudy.addMenuItems(itemList);
							choice = Helper.readInt("Enter Admin options > ");
						} else if (choice == 5) {
							C206_CaseStudy.viewMenuItems(itemList);
							choice = Helper.readInt("Enter Admin option > ");
						} else if (choice == 6) {
							C206_CaseStudy.deleteMenuItems(itemList);
							choice = Helper.readInt("Enter Admin option > ");
						} else if (choice == 7) {

						} else if (choice == 8) {

						} else if (choice == 9) {

						} else if (choice == 10) {

						} else if (choice == 11) {

						} else if (choice == 12) {

						} else if (choice == 13) {
						}
					}
				} else if (inputOption == -2) {
					choice = Helper.readInt("Enter menu option > ");
					while (choice != PARENT_OPTION_QUIT)
						if (choice == 1) {

						} else if (choice == 2) {

						} else if (choice == 3) {

						} else if (choice == 4) {

						} else if (choice == 5) {

						} else if (choice == 6) {
							
						}
				} else if (inputOption == -3) {
					while (choice != STUDENT_OPTION_QUIT)
						if (choice == 1) {

						} else if (choice == 2) {

						} else if (choice == 3) {

						} else if (choice == 4) {

						} else if (choice == 5) {

						}
				}

			} else if (option == 3) {
				System.out.println("Bye!");
			}

		}
	}

	public static void menu() {
		C206_CaseStudy.setHeader("WELCOME TO SCHOOL LUNCH BOX MENU ORDERING APP");
		System.out.println("1. Create new account");
		System.out.println("2. Login");
		System.out.println("3. Quit");

	}

	public static void parentMenu() {
		C206_CaseStudy.setHeader("WELCOME TO SCHOOL LUNCH BOX MENU ORDERING APP");
		System.out.println("1. View monthly menu");
		System.out.println("2. Place lunchbox order");
		System.out.println("3. View lunchbox order");
		System.out.println("4. View order bill");
		System.out.println("5. Make payment");
		System.out.println("6. Quit.");
	}

	public static void adminMenu() {
		C206_CaseStudy.setHeader("WELCOME TO SCHOOL LUNCH BOX MENU ORDERING APP");
		System.out.println("1. Add user account");
		System.out.println("2. View user account");
		System.out.println("3. Delete user account");
		System.out.println("4. Add menu items");
		System.out.println("5. View menu items");
		System.out.println("6. Delete menu items");
		System.out.println("7. Create monthly menu");
		System.out.println("8. View monthly menu");
		System.out.println("9. Delete monthly menu");
		System.out.println("10. Delete/cancel lunch box order");
		System.out.println("11. Create order bill");
		System.out.println("12. View order bill");
		System.out.println("13. Quit.");
	}

	public static void studentMenu() {
		C206_CaseStudy.setHeader("WELCOME TO SCHOOL LUNCH BOX MENU ORDERING APP");
		System.out.println("1. View monthly menu");
		System.out.println("2. Place lunchbox order");
		System.out.println("3. View lunchbox order");
		System.out.println("4. View order bill");
		System.out.println("5. Quit.");
	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

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

		for (int i = 0; i < itemList.size(); i++) {
			if (itemID == itemList.get(i).getItemID()) {
				itemList.remove(i);
			}
		}

	}

	public static void createAccount(ArrayList<Account> accountList) {
		// prompt user to enter username/password/role
		String username = Helper.readString("Enter username > ");
		String password = Helper.readString("Enter password > ");
		String role = Helper.readString("Enter role (Admin/Parent/Student) > ");

		accountList.add(new Account(username, password, role)); // add into the arrayList

		if (accountList.isEmpty() != true) { // if accountList is empty, it will print "successful"
			System.out.println("successful");
		} else { // if accountList is not empty, it will print "failed"
			System.out.println("failed");
		}
	}

	public static void login(ArrayList<Account> accountList) {
		// prompt user to enter username/password
		String username = Helper.readString("Enter username > ");
		String password = Helper.readString("Enter password > ");

		// enhanced for loop
		for (Account i : accountList) {
			if (username.equals(i.getUsername()) && password.equals(i.getPassword())
					&& i.getRole().equalsIgnoreCase("Admin")) {
				adminMenu();
				C206_CaseStudy.inputOption = -1;
			} else if (username.equals(i.getUsername()) && password.equals(i.getPassword())
					&& i.getRole().equalsIgnoreCase("Parent")) {
				parentMenu();
				C206_CaseStudy.inputOption = -2;
			} else if (username.equals(i.getUsername()) && password.equals(i.getPassword())
					&& i.getRole().equalsIgnoreCase("Student")) {
				studentMenu();
				C206_CaseStudy.inputOption = -3;
			}

		}

	}

}