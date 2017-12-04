package greetingsUtil;

import static org.junit.Assert.*;
import org.junit.*;

public class GreetingsUtilTest {
	static GreetingsUtil gu;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		gu = new GreetingsUtil();
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
	}


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("your tests here");
	}

	@Test 
	public void testChangeState() {
		String expected = "coming";
		String actual = gu.currentState;
		assertTrue("Expected: " + expected + " Actual: "+actual, expected.equals(actual));
		
		expected = "going";
		gu.ChangeState();
		actual = gu.currentState;
		assertTrue("Expected: " + expected + " Actual: "+actual, expected.equalsIgnoreCase(actual));
		
		expected = "coming";
		gu.ChangeState ();
		actual = gu.currentState;
		assertTrue("Expected:" + expected + " Actual: "+actual, expected.equals(actual));
	}
	
	@Test 
	public void testHello() {
		String expected;
		String actual;
		String state = gu.currentState;
		if (state.equals("coming")) {
			expected = "You already said that";
			actual = gu.Hello();
			assertEquals("Expected: " + expected + " Actual: " +actual, expected, actual);
		}else {
			expected = "Hi!";
			actual = gu.Hello();
			assertEquals ("Expected: " + expected + " Actual: "+actual, expected, actual);
			expected = "coming";
			actual = gu.currentState;
			assertEquals ("Expected: " + expected + " Actual: "+actual, expected, actual);
		}
	}
	
	public void testGoodBye() {
		String expected;
		String actual;
		String state = gu.currentState;
		if (state.equals("going")) {
			expected = "You already said that";
			actual = gu.Hello();
			assertEquals ("Expected: " +expected + "Actual: " +actual, expected, actual);
		} else {
			expected = "bye";
			actual = gu.Hello();
			assertEquals("Expected:" + expected + "Actual: "+actual, expected, actual);
			expected = "going";
			actual = gu.currentState;
			assertEquals("Expected:" + expected + "Actual: "+actual, expected, actual);
		}
	}
}


