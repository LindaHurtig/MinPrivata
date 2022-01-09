package kund;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import varukorg.Varukorg;

class KundTest {

	private static Kund k1;
	private static Kund k2;
	static Varukorg varukorg1;
	static Varukorg varukorg2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		k1 = new Kund();
		varukorg1 = new Varukorg(100, 75);
		varukorg2 = new Varukorg(1000, 750);

		k2 = new Kund("Testare2", "Testarevägen 32", 752121213, 2, varukorg2);
	}

	@Test
	void testKund() {
		k1.setKundNr(1);
		k1.setNamn("Testare Testsson");
		k1.setAdress("Testgatan 29");
		k1.setMobilNr(77654311);

	}

	@Test
	void testKundNr() {

		assertEquals(1, k1.getKundNr());
		assertEquals(2, k2.getKundNr());
	}

	@Test
	void testMobilNr() {
		k1.setMobilNr(77654311);

		assertEquals(77654311, k1.getMobilNr());
		assertEquals(752121213, k2.getMobilNr());

	}

	@Test
	void testVarukorg1() {
		k1.setVarukorg(varukorg1);

		assertEquals("\nSaldo ex moms: 75,00\nSaldo ink moms: 100,00", k1.getVarukorg().toString());
		assertEquals("\nSaldo ex moms: 750,00\nSaldo ink moms: 1000,00", k2.getVarukorg().toString());
	}

	@AfterAll
	static void testToString() {
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		assertEquals("Kund [kundNr=1, namn=Testare Testsson, adress=Testgatan 29, mobilNr=77654311\nVarukorg: "
				+ varukorg1 + "]", k1.toString());
		assertEquals("Kund [kundNr=2, namn=Testare2, adress=Testarevägen 32, mobilNr=752121213\nVarukorg: " + varukorg2
				+ "]", k2.toString());

	}
}
