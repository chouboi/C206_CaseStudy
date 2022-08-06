import java.util.ArrayList;

public class C206_CaseStudy {
	private static final int ADMIN_OPTION_QUIT = 13;
	private static final int PARENT_OPTION_QUIT = 7;
	private static final int STUDENT_OPTION_QUIT = 5;
	private static int inputOption = 0;

	private static final int OPTION_QUIT = 3;

	public static void main(String[] args) {

		ArrayList<MonthlyMenu> weeklyList = new ArrayList<MonthlyMenu>();
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
							C206_CaseStudy.addAllMonthlyMenu(weeklyList);
							choice = Helper.readInt("Enter Admin option > ");
						} else if (choice == 8) {
							C206_CaseStudy.viewAllMonthlyMenu(weeklyList);
							choice = Helper.readInt("Enter Admin option > ");
						} else if (choice == 9) {
							C206_CaseStudy.deleteMenu(weeklyList);
							choice = Helper.readInt("Enter Admin option > ");
						} else if (choice == 10) {

						} else if (choice == 11) {

						} else if (choice == 12) {

						} else if (choice == 13) {

						}
					}
				} else if (inputOption == -2) {
					C206_CaseStudy.parentMenu();
					choice = Helper.readInt("Enter menu option > ");
					while (choice != PARENT_OPTION_QUIT)

						if (choice == 1) {
							C206_CaseStudy.checkEmpty(weeklyList);
							C206_CaseStudy.viewAllMonthlyMenu(weeklyList);
							choice = Helper.readInt("Enter Parent option > ");
						} else if (choice == 2) {
						
						} else if (choice == 3) {
							
						} else if (choice == 4) {
						
						} else if (choice == 5) {

						} else if (choice == 6) {

						} else if (choice == 7) {

						}
				} else if (inputOption == -3) {
					while (choice != STUDENT_OPTION_QUIT)
						if (choice == 1) {
							C206_CaseStudy.checkEmpty(weeklyList);
							C206_CaseStudy.viewAllMonthlyMenu(weeklyList);
							choice = Helper.readInt("Enter Parent option > ");
						} else if (choice == 2) {
							C206_CaseStudy.viewAllMonthlyMenu(weeklyList);
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
		System.out.println("4. Delete lunchbox order");
		System.out.println("5. View order bill");
		System.out.println("6. Make payment");
		System.out.println("7. Quit.");
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
		System.out.println("13. Return to Main Menu.");
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

	// check if weekylist is empty
	public static void checkEmpty(ArrayList<MonthlyMenu> weeklyList) {
		int a = 5;
		for (int i = 0; i < a; i++) {
			if (weeklyList.isEmpty() == true) {
				C206_CaseStudy.addAllMonthlyMenu(weeklyList);
			}
		}
	}

	private static void addMenuItems(ArrayList<Items> itemList) {

		itemList.add(new Items("1001", "Chicken Chop", "Western", "4.50"));
		itemList.add(new Items("1002", "Cripsy Chicken", "Western","5.00"));
		itemList.add(new Items("1003", "Aglio olio Pasta", "Western", "5.00"));
		itemList.add(new Items("1004", "Baked Chicken Rice", "Western", "5.00"));
		itemList.add(new Items("1005", "Creamy Chicken Pasta", "Western", "4.50"));

		itemList.add(new Items("1006", "Pineapple Fried Rice", "Asian", "3.50"));
		itemList.add(new Items("1007", "Beef Noodles", "Asian", "4.50"));
		itemList.add(new Items("1008", "Hokkien Noodles", "Asian", "4.00"));
		itemList.add(new Items("1009", "Wanton Mee", "Asian", "3.50"));
		itemList.add(new Items("1010", "Chicken Rice", "Asian", "3.00"));

		itemList.add(new Items("1011", "Carrot Cake", "Vegetarian", "2.00"));
		itemList.add(new Items("1012", "Pumpkin Porridge", "Vegetarian", "2.50"));
		itemList.add(new Items("1013", "Chicken Rice", "Vegetarian", "2.50"));
		itemList.add(new Items("1014", "Rojak", "Vegetarian", "3.00"));
		itemList.add(new Items("1015", "Salad Bowl", "Vegetarian", "3.50"));

		itemList.add(new Items("1016", "Pokka Green Tea Packet", "Drink", "0.80"));
		itemList.add(new Items("1017", "Pokka Lemon Tea Packet", "Drink", "0.80"));
		itemList.add(new Items("1018", "Milo Packet", "Drink", "0.80"));
		itemList.add(new Items("1019", "Yeos Soy Bean Packet", "Drink", "0.90"));
		itemList.add(new Items("1020", "Pokka Peach Tea Packet", "Drink","0.80"));

		itemList.add(new Items("1021", "1 cup Apple", "Fruit", "0.90"));
		itemList.add(new Items("1022", "1 cup Orange", "Fruit", "0.90"));
		itemList.add(new Items("1023", "1 cup Honey Dew", "Fruit", "1.00"));
		itemList.add(new Items("1024", "1 cup Kiwi", "Fruit", "1.20"));
		itemList.add(new Items("1025", "1 cup Watermelon", "Fruit", "1.00"));

		if (itemList.isEmpty() != true) {
			System.out.println("Items are successfully added!");
		} else {
			System.out.println("Items add Failed!");
		}

	}

	// main methods

	public static void viewMenuItems(ArrayList<Items> itemList) {

		String output = String.format("%-10s %-30s %-25s %-20s\n", "ID", "Name", "Category", "Price");

		for (Items i : itemList) {
			output += String.format("%-10s %-30s %-25s $%-20s\n", i.getItemID(), i.getName(), i.getCategory(),
					i.getPrice());
			
		}
		


		System.out.println(output);
	}

	public static void deleteMenuItems(ArrayList<Items> itemList) {

		String itemID = Helper.readString("Enter Item ID to delete > ");

		for (int i = 0; i < itemList.size(); i++) {
			if (itemID.equals(itemList.get(i).getItemID())) {
				itemList.remove(i);
			}
		}

	}

	// for test case methods

	public static String retrieveAllMenuItems(ArrayList<Items> itemList) {

		   String output="";
		    for (int i= 0; i < itemList.size();i++) {
		      output+=String.format("%-10s %-30s %-25s $%-20s\n", itemList.get(i).getItemID(),
		    		  itemList.get(i).getName(),itemList.get(i).getCategory(),itemList.get(i).getPrice());
		    }
		    
		    return output;

	}

	public static Items inputItem() {
		String itemid = Helper.readString("Enter item id > ");
		String name = Helper.readString("Enter item name > ");
		String category = Helper.readString("Enter category > ");
		String price = Helper.readString("Enter price > ");

		Items i = new Items(itemid, name, category, price);

		return i;

	}

	public static void addItems(ArrayList<Items> itemList, Items i) {

		itemList.add(i);

	}
	
	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}

	public static boolean doDeleteMenuItem(ArrayList<Items> itemList, String id) {

		boolean isDeleted = false;

		for (int i = 0; i < itemList.size(); i++) {

			String itemID = itemList.get(i).getItemID();

			if (id.equals(itemID) && itemList.get(i).getIsAvailable() == true) {

				itemList.get(i).setIsAvailable(false);
				isDeleted = true;

			}
		}
		return isDeleted;
	}

	public static void addAllMonthlyMenu(ArrayList<MonthlyMenu> weeklyList) {
		MonthlyMenu menu1 = new MonthlyMenu(1001, "01-09-2022", "Spaghetti", "Beef Noodles", "Spring roll",
				"Apple Juice", "Orange Juice", "Apple", "Papaya");

		MonthlyMenu menu2 = new MonthlyMenu(1002, "02-09-2022", "Burger", "Wanton Mee", "Salad bowl",
				"Watermelon Juice", "Orange Juice", "Orange", "Honeydew");

		MonthlyMenu menu3 = new MonthlyMenu(1003, "03-09-2022", "Tomato pasta", "Chicken rice", "Veggie Burger",
				"crysthanamum tea", "Apple Juice", "Watermelon", "Pear");

		MonthlyMenu menu4 = new MonthlyMenu(1004, "04-09-2022", "Chicken chop", "Fish soup with rice/noodles",
				"Mushroom pasta", "Ribena", "Iced Lemon Tea", "Orange", "Apple");

		MonthlyMenu menu5 = new MonthlyMenu(1005, "05-09-2022", "Fried fries", "Pork cutlets with rice", "Spring roll",
				"Orange Juice", "Watermelon Juice", "Honeydew", "Pear");

		weeklyList.add(menu1);
		weeklyList.add(menu2);
		weeklyList.add(menu3);
		weeklyList.add(menu4);
		weeklyList.add(menu5);
	}

	// view all and retrieve

	public static String retrieveAllMenu(ArrayList<MonthlyMenu> weeklyList) {
		String output = "";

		for (int i = 0; i < weeklyList.size(); i++) {

			output += String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n",
					weeklyList.get(i).getID(), weeklyList.get(i).GetWeekDate(), weeklyList.get(i).Getwestern(),
					weeklyList.get(i).Getasian(), weeklyList.get(i).Getvegg(), weeklyList.get(i).Getdrink1(),
					weeklyList.get(i).Getdrink2(), weeklyList.get(i).Getfruit1(), weeklyList.get(i).Getfruit2());
		}
		return output;
	}

	public static void viewAllMonthlyMenu(ArrayList<MonthlyMenu> weeklyList) {

		String output = String.format("%-10s %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n", "MenuID", "Date",
				"Western", "Asian", "Vegetarian", "Drink 1", "Drink 2", "Fruit 1", "Fruit 2");
		output += retrieveAllMenu(weeklyList);
		System.out.println(output);
	}

	public static void addMonthlyMenu(ArrayList<MonthlyMenu> weeklyList, MonthlyMenu mm) {

		weeklyList.add(mm);
		System.out.println("Add the menu successful!");

	}

	// delete the menu

	public static void deleteMenu(ArrayList<MonthlyMenu> weeklyList) {
		int id = Helper.readInt("Enter menu id > ");

		boolean isFound = false;
		for (int i = 0; i < weeklyList.size(); i++) {
			if (id == weeklyList.get(i).getID()) {
				weeklyList.remove(i);
				isFound = true;
			}
		}

		if (isFound == false) {
			System.out.println("This menu does not exist");
		} else {
			System.out.println("This menu has been deleted sucessfully");
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
				C206_CaseStudy.inputOption = -2;
			} else if (username.equals(i.getUsername()) && password.equals(i.getPassword())
					&& i.getRole().equalsIgnoreCase("Student")) {
				studentMenu();
				C206_CaseStudy.inputOption = -3;
			}

		}

	}

}