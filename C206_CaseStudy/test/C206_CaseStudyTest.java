import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private MonthlyMenu mm1;
	private MonthlyMenu mm2;
	private MonthlyMenu mm3;
	private MonthlyMenu mm4;
	private MonthlyMenu mm5;
	
	
	
	private ArrayList<MonthlyMenu> weeklyList;
	
	
	
	@Before
	public void setUp() throws Exception {
		
		 mm1 = new MonthlyMenu(1006,"02-09-2022","Spaghetti","Beef Noodles","Spring roll","Apple Juice",
					"Orange Juice","Apple","Papaya");
			
		mm2 = new MonthlyMenu(1008,"03-09-2022","Burger","Wanton Mee","Salad bowl","Watermelon Juice",
					"Orange Juice","Orange","Honeydew");
			
		mm3 = new MonthlyMenu(1010,"04-09-2022","Tomato pasta","Chicken rice","Veggie Burger","crysthanamum tea",
					"Apple Juice","Watermelon","Pear");
			
		mm4 = new MonthlyMenu(1011,"05-09-2022","Chicken chop","Fish soup with rice/noodles","Mushroom pasta","Ribena",
					"Iced Lemon Tea","Orange","Apple");
			
		mm5 = new MonthlyMenu(1009,"09-09-2022","Fried fries","Pork cutlets with rice","Spring roll","Orange Juice",
					"Watermelon Juice","Honeydew","Pear");
		
		weeklyList = new ArrayList<MonthlyMenu>();
		
		
		
	}



	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	@Test
	public void testViewMonthlyMenu() {
			// Test if Menu list is not null but empty -boundary
			assertNotNull("Test if there is valid Menu arraylist to retrieve item", weeklyList);
			
	
			String allMenu= C206_CaseStudy.retrieveAllMenu(weeklyList);
			String testOutput = "";
			assertEquals("Check that ViewAllWeeklylist", testOutput, allMenu);
			
			//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
			C206_CaseStudy.addMonthlyMenu(weeklyList, mm1);
			C206_CaseStudy.addMonthlyMenu(weeklyList, mm2);
			C206_CaseStudy.addMonthlyMenu(weeklyList, mm3);
			C206_CaseStudy.addMonthlyMenu(weeklyList, mm4);
			assertEquals("Test that Menu arraylist size is 4", 4, weeklyList.size());
			
			//check that test output you put is equal to you store inside the arrayList 
			//if the add there is 4, then had to also the same for same output (4)
			allMenu = C206_CaseStudy.retrieveAllMenu(weeklyList);
			testOutput = String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n",1006,"02-09-2022","Spaghetti","Beef Noodles","Spring roll","Apple Juice",
					"Orange Juice","Apple","Papaya");
			testOutput += String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n",1008,"03-09-2022","Burger","Wanton Mee","Salad bowl","Watermelon Juice",
					"Orange Juice","Orange","Honeydew" );
			
			testOutput += String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n",1010,"04-09-2022","Tomato pasta","Chicken rice","Veggie Burger","crysthanamum tea",
					"Apple Juice","Watermelon","Pear");
			
			testOutput += String.format("%-10d %-20s %-20s %-30s %-25s %-20s %-20s %-20s %-20s\n",1011,"05-09-2022","Chicken chop","Fish soup with rice/noodles","Mushroom pasta","Ribena",
					"Iced Lemon Tea","Orange","Apple");
			
		
		
			assertEquals("Test that ViewAllMenulist", testOutput, allMenu);
			
	}
	
	public void testAddMenu() {
		
	}
	
	
	public void testDelete() {
		
	}
		
		
		
		
	
	
	
	@After
	public void tearDown() throws Exception {
		
		mm1= null;
		mm2= null;
		mm3= null;
		mm4= null;
		mm5=null;
		
		
	}
}
