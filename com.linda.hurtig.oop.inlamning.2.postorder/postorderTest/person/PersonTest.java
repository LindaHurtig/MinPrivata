package person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonTest {
	private static Person p1;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		p1 = new Person("Testare", "Testvägen 23", 0701234567);
		
		
	}

	@Test
	public void testPerson() {
		assertEquals("Testare" , p1.getNamn());
	}

//	@Test
//	void testGetNamn() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetNamn() {
//		
//	}
//
//	@Test
//	void testGetAdress() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetAdress() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetMobilNr() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetMobilNr() {
//		fail("Not yet implemented");
//	}

}
