import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Order o1;
	private Order o2;
	private Order o3;

	private ArrayList<Order> orderList;

	@Before
	public void setUp() throws Exception {
		o1 = new Order(1001, "01-09-2022", "Spaghetti", "Apple Juice", "Apple");
		o2 = new Order(1002, "01-10-2022", "Beef noodles", "Iced Lemon Tea", "Pear");
		o3 = new Order(1003, "01-11-2022", "Spring roll", "Orange Juice", "Papaya");

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

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {

		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
