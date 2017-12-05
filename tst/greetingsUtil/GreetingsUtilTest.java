package greetingsUtil;

import static org.junit.Assert.*;
import org.junit.*;

public class GreetingsUtilTest {
	static GreetingsUtil gu;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
		gu = new GreetingsUtil();
	}


	@After
	public void tearDown() throws Exception {
		gu = null;
	}
//* Tests must cover each decision in the code

	@Test
	public void testDecisions() {
		//fail("your tests here");
		assertEquals("You already said that",gu.Hello());
		gu.ChangeState();
		assertEquals("going",gu.currentState);
		assertEquals("You already said that",gu.GoodBye());
	}
//	* Tests must cover all statements in the code
	@Test
	public void testStatements() {
		//fail("your tests here");
		assertEquals("You already said that",gu.Hello());
		assertEquals("bye",gu.GoodBye());
		assertEquals("You already said that",gu.GoodBye());
		assertEquals("Hi!",gu.Hello());
		
		gu.ChangeState();
		gu.ChangeState();
	}	
}


