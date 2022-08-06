import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Order o1;
	private Order o2;
	private Order o3;

	private Items i1;
	private Items i2;
	private Items i3;


	private MonthlyMenu mm1;
	private MonthlyMenu mm2;
	private MonthlyMenu mm3;
	private MonthlyMenu mm4;
	private MonthlyMenu mm5;

	private ArrayList<MonthlyMenu> weeklyList;
	private ArrayList<Items> itemList;
	private ArrayList<Order> orderList;
	

	@Before
	public void setUp() throws Exception {

		o1 = new Order(1001, "01-09-2022", "Spaghetti", "Apple Juice", "Apple");
		o2 = new Order(1002, "01-10-2022", "Beef noodles", "Iced Lemon Tea", "Pear");
		o3 = new Order(1003, "01-11-2022", "Spring roll", "Orange Juice", "Papaya");

		

		i1 = new Items("1001", "Chicken Chop", "Western", "4.50");
		i2 = new Items("1002", "Cripsy Chicken", "Western", "5.00");
		i3 = new Items("1003", "Aglio olio Pasta", "Western", "3.50");

		mm1 = new MonthlyMenu(1006, "02-09-2022", "Spaghetti", "Beef Noodles", "Spring roll", "Apple Juice",
				"Orange Juice", "Apple", "Papaya");

		mm2 = new MonthlyMenu(1008, "03-09-2022", "Burger", "Wanton Mee", "Salad bowl", "Watermelon Juice",
				"Orange Juice", "Orange", "Honeydew");

		mm3 = new MonthlyMenu(1010, "04-09-2022", "Tomato pasta", "Chicken rice", "Veggie Burger", "crysthanamum tea",
				"Apple Juice", "Watermelon", "Pear");

		mm4 = new MonthlyMenu(1011, "05-09-2022", "Chicken chop", "Fish soup with rice/noodles", "Mushroom pasta",
				"Ribena", "Iced Lemon Tea", "Orange", "Apple");

		mm5 = new MonthlyMenu(1009, "09-09-2022", "Fried fries", "Pork cutlets with rice", "Spring roll",
				"Orange Juice", "Watermelon Juice", "Honeydew", "Pear");

		weeklyList = new ArrayList<MonthlyMenu>();
		itemList = new ArrayList<Items>();
		orderList = new ArrayList<Order>();
	}

	// 3rd func
	@Test
	public void testViewAllOrders() {
	// Test if order list is not null but empty, so that can add a new item
	assertNotNull("Test if there is valid Items arraylist to add to", orderList);

	// test if the list of orders retrieved from the SourceCentre is empty
	String allOrders = C206_CaseStudy.retrieveAllOrders(orderList);
	String output = "";
	assertEquals("Check that ViewAllOrderList", output, allOrders);

	// Given an empty list, after adding 2 orders, test if the size of the list is 2
	C206_CaseStudy.addOrders(orderList, o1);
	C206_CaseStudy.addOrders(orderList, o2);
	assertEquals("Test if that Order arraylist size is 2?", 2, orderList.size());
	allOrders = C206_CaseStudy.retrieveAllOrders(orderList);

	output = String.format("%-10d %-10s %-10s %-10s %-10s\n", 1001 , "01-09-2022", "Spaghetti", "Apple Juice", "Apple");
	output += String.format("%-10d %-10s %-10s %-10s %-10s\n", 1002,"01-10-2022","Beef noodles","Iced Lemon Tea","Pear");
	assertEquals("Check that ViewAllitemsList", output, allOrders);

}

	@Test
	public void testAddOrder() {

	assertNotNull("Test if there is valid Order arraylist to add to", orderList);

	// Given an empty list, after adding 1 order, the size of the list is 1
	C206_CaseStudy.addOrders(orderList, o1);
	assertEquals("Test if that Items arraylist size is 1?", 1, orderList.size());

	// The order just added is as same as the first order of the list
	assertSame("Test that Items is added same as 1st item of the list?", o1, orderList.get(0));

	// Add another order test The size of the list is 2?
	C206_CaseStudy.addOrders(orderList, o2);
	C206_CaseStudy.addOrders(orderList, o3);
	assertEquals("Test that Items arraylist size is 3?", 3, orderList.size());
	assertSame("Test that Item is added same as 3rd item of the list?", o3, orderList.get(2));

} 
	@Test
	public void testDeleteOrder() {

	// boundary
	assertNotNull("test if there is valid Order arraylist to delete from", orderList);
	C206_CaseStudy.addOrders(orderList, o1);

	// normal
	Boolean ok = C206_CaseStudy.doDeleteOrder(orderList, 1001);
	assertFalse(orderList.get(0).getIsAvailable());

	// error condition
	ok = C206_CaseStudy.doDeleteOrder(orderList, 1001);
	assertFalse("Test if an same order is NOT ok to delete again?", ok);

	// error condition
	C206_CaseStudy.addOrders(orderList, o2);
	o2.setIsAvailable(false);
	ok = C206_CaseStudy.doDeleteOrder(orderList, 1002);
	assertFalse("Test that un-available order is NOT ok to delete?", ok);

	// error condition
	ok = C206_CaseStudy.doDeleteOrder(orderList, 1003);
	assertFalse("Test that non-existing order is NOT ok to delete?", ok);

}

	

	@Test
	public void c206_test() {

		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	@Test
	public void testViewMonthlyMenu() {
		// Test if Menu list is not null but empty -boundary
		assertNotNull("Test if there is valid Menu arraylist to retrieve item", weeklyList);

		String allMenu = C206_CaseStudy.retrieveAllMenu(weeklyList);
		String testOutput = "";
		assertEquals("Check that ViewAllWeeklylist", testOutput, allMenu);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addMonthlyMenu(weeklyList, mm1);
		C206_CaseStudy.addMonthlyMenu(weeklyList, mm2);
		C206_CaseStudy.addMonthlyMenu(weeklyList, mm3);
		C206_CaseStudy.addMonthlyMenu(weeklyList, mm4);
		assertEquals("Test that Menu arraylist size is 4", 4, weeklyList.size());

		// check that test output you put is equal to you store inside the arrayList
		// if the add there is 4, then had to also the same for same output (4)
		allMenu = C206_CaseStudy.retrieveAllMenu(weeklyList);
		testOutput = String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n", 1006, "02-09-2022",
				"Spaghetti", "Beef Noodles", "Spring roll", "Apple Juice", "Orange Juice", "Apple", "Papaya");
		testOutput += String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n", 1008, "03-09-2022",
				"Burger", "Wanton Mee", "Salad bowl", "Watermelon Juice", "Orange Juice", "Orange", "Honeydew");

		testOutput += String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n", 1010, "04-09-2022",
				"Tomato pasta", "Chicken rice", "Veggie Burger", "crysthanamum tea", "Apple Juice", "Watermelon",
				"Pear");

		testOutput += String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n", 1011, "05-09-2022",
				"Chicken chop", "Fish soup with rice/noodles", "Mushroom pasta", "Ribena", "Iced Lemon Tea", "Orange",
				"Apple");

		assertEquals("Test that ViewAllMenulist", testOutput, allMenu);

	}

	@Test
	public void testViewAllMenuItems() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Items arraylist to add to", itemList);

		// test if the list of Items retrieved from the SourceCentre is empty
		String allItems = C206_CaseStudy.retrieveAllMenuItems(itemList);
		String output = "";
		assertEquals("Check that ViewAllitemList", output, allItems);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addItems(itemList, i1);
		C206_CaseStudy.addItems(itemList, i2);
		assertEquals("Test if that Items arraylist size is 2?", 2, itemList.size());
		allItems = C206_CaseStudy.retrieveAllMenuItems(itemList);

		output += String.format("%-10s %-30s %-25s $%-20s\n", "1001", "Chicken Chop", "Western", "4.50");
		output += String.format("%-10s %-30s %-25s $%-20s\n", "1002", "Cripsy Chicken", "Western", "5.00");
		assertEquals("Check that ViewAllitemsList", output, allItems);

	}

	@Test
	public void testAddItemsMenu() {

		assertNotNull("Test if there is valid Items arraylist to add to", itemList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addItems(itemList, i1);
		assertEquals("Test if that Items arraylist size is 1?", 1, itemList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Items is added same as 1st item of the list?", i1, itemList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addItems(itemList, i2);
		C206_CaseStudy.addItems(itemList, i3);
		assertEquals("Test that Items arraylist size is 3?", 3, itemList.size());
		assertSame("Test that Item is added same as 3rd item of the list?", i3, itemList.get(2));

	}

	@Test
	public void testdeleteMenuItem() {

		// boundary
		assertNotNull("test if there is valid Items arraylist to delete from", itemList);
		C206_CaseStudy.addItems(itemList, i1);

		// normal
		Boolean ok = C206_CaseStudy.doDeleteMenuItem(itemList, "1001");
		assertFalse(itemList.get(0).getIsAvailable());

		// error condition
		ok = C206_CaseStudy.doDeleteMenuItem(itemList, "1001");
		assertFalse("Test if an same item is NOT ok to delete again?", ok);

		// error condition
		C206_CaseStudy.addItems(itemList, i2);
		i2.setIsAvailable(false);
		ok = C206_CaseStudy.doDeleteMenuItem(itemList, "1002");
		assertFalse("Test that un-available item is NOT ok to delete?", ok);

		// error condition
		ok = C206_CaseStudy.doDeleteMenuItem(itemList, "1003");
		assertFalse("Test that non-existing item is NOT ok to delete?", ok);

	}
	
	@After
	public void tearDown() throws Exception {

		i1 = null;
		i2 = null;
		i3 = null;
		o1 = null;
		o2 = null;
		o3 = null;
		mm1= null;
		mm2 = null;
		mm3 = null;
		itemList = null;
		orderList = null;
		weeklyList = null;

	}
	

	
}
