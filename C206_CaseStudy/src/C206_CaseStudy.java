import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MonthlyMenu> weeklyList = new ArrayList<MonthlyMenu>();
		
		MonthlyMenu menu1 = new MonthlyMenu(1001,"01-09-2022","Spaghetti","Beef Noodles","Spring roll","Apple Juice",
				"Orange Juice","Apple","Papaya");
		
		MonthlyMenu menu2 = new MonthlyMenu(1002,"02-09-2022","Burger","Wanton Mee","Salad bowl","Watermelon Juice",
				"Orange Juice","Orange","Honeydew");
		
		MonthlyMenu menu3 = new MonthlyMenu(1003,"03-09-2022","Tomato pasta","Chicken rice","Veggie Burger","crysthanamum tea",
				"Apple Juice","Watermelon","Pear");
		
		MonthlyMenu menu4 = new MonthlyMenu(1004,"04-09-2022","Chicken chop","Fish soup with rice/noodles","Mushroom pasta","Ribena",
				"Iced Lemon Tea","Orange","Apple");
		
		MonthlyMenu menu5 = new MonthlyMenu(1005,"05-09-2022","Fried fries","Pork cutlets with rice","Spring roll","Orange Juice",
				"Watermelon Juice","Honeydew","Pear");

		
		weeklyList.add(menu1);
		weeklyList.add(menu2);
		weeklyList.add(menu3);
		weeklyList.add(menu4);
		weeklyList.add(menu5);
		
		
		

		

	
	
	
	
	
	//view all and retrieve 
	
	public static String retrieveAllMenu(ArrayList<MonthlyMenu> weeklyList) {
		String output = "";

		for (int i = 0; i < weeklyList.size(); i++) {

			output += String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n",weeklyList.get(i).getID(),weeklyList.get(i).GetWeekDate(),weeklyList.get(i).Getwestern(),
					weeklyList.get(i).Getasian(),weeklyList.get(i).Getvegg(),weeklyList.get(i).Getdrink1(),weeklyList.get(i).Getdrink2(),
					weeklyList.get(i).Getfruit1(),weeklyList.get(i).Getfruit2());
		}
		return output;
	}
	public static void viewAllMonthlyMenu(ArrayList<MonthlyMenu> weeklyList) {
		C206_CaseStudy.setHeader("View Monthly Menu");
		String output = String.format("%-10s %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n","MenuID","Date","Western","Asian",
				"Vegetarian","Drink 1","Drink 2", "Fruit 1", "Fruit 2");
		 output += retrieveAllMenu(weeklyList);	
		System.out.println(output);
	}
	
	
	//add new menu
	
	public static MonthlyMenu inputMenu() {
		int id = Helper.readInt("Enter menu id > ");
		String date = Helper.readString("Enter the date > ");
		String western = Helper.readString("Enter the western > ");
		String asian = Helper.readString("Enter the asian> ");
		String veg = Helper.readString("Enter the vegetarian > ");
		String drink1 = Helper.readString("Enter the drink 1> ");
		String drink2 = Helper.readString("Enter the drink 2> ");
		String fruit1 = Helper.readString("Enter the fruit 1 > ");
		String fruit2 = Helper.readString("Enter the fruit 2 > ");

		
		
		MonthlyMenu mm= new MonthlyMenu(id, date, western,asian,veg,drink1,drink2,fruit1,fruit2);
		return mm;
		
		
	}
	public static void addMonthlyMenu(ArrayList<MonthlyMenu> weeklyList, MonthlyMenu mm) {
		
		weeklyList.add(mm);
		System.out.println("Add the menu successful!");
		
	}
	
	//delete the menu
	
	public static void deleteMenu(ArrayList<MonthlyMenu> weeklyList) {
		int id = Helper.readInt("Enter menu id > ");
		
		boolean isFound = false;
		for(int i = 0; i < weeklyList.size();i++) {
			if(id == weeklyList.get(i).getID()) {
				weeklyList.remove(i);
				isFound = true;
			}
		}
		
		if(isFound == false) {
			System.out.println("This menu does not exist");
		}else {
			System.out.println("This menu has been deleted sucessfully");
		}
		
		
	}
	

}
