import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Account A1;
	private Account A2;
	private Account A3;
	private Account A4;
	private Account A5;
	
	private ArrayList<Account> accountList;
	
	@Before
	public void setUp() throws Exception {
		A1 = new Account("amelia", "1925", "Student");
		A2 = new Account("lexin", "1234", "Student");
		A3 = new Account("chouzhen", "9876", "Admin");
		A4 = new Account("Jarrett", "5678", "Parent");
		A5 = new Account("Jeva", "9753", "Parent");
		
		accountList= new ArrayList<Account>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testcreateAccount() { 
		//fail("Not yet implemented"); 
		assertNotNull("Check if the username, password and role is being added to the arrayList", accountList);
		C206_CaseStudy.addAccount(accountList, A1);
	    assertEquals("Check that account arraylist size is 1", 1, accountList.size());
	    assertSame("Check that new account is added", A1, accountList.get(0));
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	  public void testViewAllAccount() {
	    // Test if Item list is not null but empty, so that can add a new item
	    assertNotNull("Test if there is valid Account arraylist to add to", accountList);

	    // test if the list of Items retrieved from the SourceCentre is empty
	    String allAcc = C206_CaseStudy.retrieveAllUserAccount(accountList);
	    String output = "";
	    assertEquals("Check that ViewAllitemList", output, allAcc);

	    // Given an empty list, after adding 2 items, test if the size of the list is 2
	    C206_CaseStudy.addAccount(accountList, A1);
	    C206_CaseStudy.addAccount(accountList, A2);
	    assertEquals("Test if that Account arraylist size is 2?", 2, accountList.size());
	    allAcc = C206_CaseStudy.retrieveAllUserAccount(accountList);
		
	    output += String.format("%-25s %-10s %-10s\n", "amelia", "1925", "Student");
	    output += String.format("%-25s %-10s %-10s\n", "lexin", "1234", "Student");
	    assertEquals("Check that ViewAllitemsList", output, allAcc);

	}
	
	@Test
	  public void testDeleteAccount() {

	    // boundary
	    assertNotNull("test if there is valid Account arraylist to delete from", accountList);
	    C206_CaseStudy.addAccount(accountList, A1);

	    // normal
	    Boolean ok = C206_CaseStudy.doDeleteAccount(accountList, "amelia", "1925");
	    assertFalse(accountList.get(0).getIsAvailable());

	    // error condition
	    ok = C206_CaseStudy.doDeleteAccount(accountList, "amelia", "1925");
	    assertFalse("Test if an same account is NOT ok to delete again?", ok);

	    // error condition
	    C206_CaseStudy.addAccount(accountList, A2);
	    A2.setIsAvailable(false);
	    ok = C206_CaseStudy.doDeleteAccount(accountList, "lexin", "1234");
	    assertFalse("Test that un-available account is NOT ok to delete?", ok);

	    // error condition
	    ok = C206_CaseStudy.doDeleteAccount(accountList, "chouzhen", "9876");
	    assertFalse("Test that non-existing account is NOT ok to delete?", ok);

	  }

}
