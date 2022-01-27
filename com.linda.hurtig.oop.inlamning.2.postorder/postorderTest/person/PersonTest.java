package person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonTest {
	private static Person p1;
	private static Person p2;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		p1 = new Person("Testare1", "Testvägen 23", 0701234567);
		p2 = new Person();

	}


	@Test
	void testNamn() {
		assertEquals("Testare1", p1.getNamn());
		
		p2.setNamn("Testare2");
		assertEquals("Testare2", p2.getNamn());
	}


	@Test
	void testAdress() {
		assertEquals("Testvägen 23", p1.getAdress());
		
		p2.setAdress("Testgatan 52");
		assertEquals("Testgatan 52", p2.getAdress());
	}


	@Test
	void testMobilNr() {
		
		assertEquals(0701234567, p1.getMobilNr());
		
		p2.setMobilNr(077654321);
		assertEquals(077654321, p2.getMobilNr());
	}


}
