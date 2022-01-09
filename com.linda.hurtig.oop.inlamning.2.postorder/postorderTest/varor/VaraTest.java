package varor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class VaraTest {
	
	private static Vara v1; 
	private static Vara v2; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		v1 = new Vara();
		v2 = new Vara(2, "Lego", 149f, 25);
		
		v1.setArtNr(1);
		v1.setVaraNamn("Smör");
		v1.setNettoPris(19f);
		v1.setMomsSats(12);
	}


	@Test
	void testGetArtNr() {
		assertEquals(1, v1.getArtNr());
		assertEquals(2, v2.getArtNr());
	}


	@Test
	void testGetVaraNamn() {
		assertEquals("Smör", v1.getVaraNamn());
		assertEquals("Lego", v2.getVaraNamn());
	}


	@Test
	void testGetNettoPris() {
		assertEquals(19f, v1.getNettoPris());
		assertEquals(149f, v2.getNettoPris());
	}


	@Test
	void testGetMomsSats() {
		assertEquals(12, v1.getMomsSats());
		assertEquals(25, v2.getMomsSats());
	}


	@Test
	void testKopa() {
		
		
		
	}

	@Test
	void testToString() {
		System.out.println(v1.toString());
		System.out.println(v2.toString());
	}

}
