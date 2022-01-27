package varukorg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import varor.Vara;

class VarukorgTest {

	private static Varukorg varukorg1;
	static Vara vara;
	static Vara vara2;
	static Vara vara3;
	static Vara vara4;

	@BeforeAll

	static void setUpBeforeClass() throws Exception {
		varukorg1 = new Varukorg(0, 0);
		vara = new Vara(1, "Lego", 100f, 25);

		vara2 = new Vara(2, "Majs", 12f, 12);
		vara3 = new Vara(3, "Örter", 25f, 12);
		vara4 = new Vara(4, "Plåt", 150f, 25);

	}

	@Test
	void testGetIVarukorg() {

		assertEquals(
				"[4 Plåt 150,00 25 , 2 Majs 12,00 12 , 1 Lego 100,00 25 , 4 Plåt 150,00 25 , 1 Lego 100,00 25 , 3 Örter 25,00 12 ]",
				varukorg1.getiVarukorg().toString());

	}

	@Test
	void testSaldoInkMoms() {
		varukorg1.setSaldoInkMoms(varukorg1.saldoInkMoms);
		assertEquals(666.4400024414062, varukorg1.getSaldoInkMoms());
	}

	@Test
	void testGetSaldoExMoms() {
		varukorg1.setSaldoExMoms();
		assertEquals(537, varukorg1.getSaldoExMoms());

	}

	@Test
	void testSetSaldoExMoms() {
		varukorg1.setSaldoExMoms();

	}

	@Test
	void testlaggiVarukorg() {

		Varukorg.laggiVarukorg(true, vara4);
		Varukorg.laggiVarukorg(true, vara2);
		Varukorg.laggiVarukorg(true, vara);
		Varukorg.laggiVarukorg(true, vara4);
		Varukorg.laggiVarukorg(true, vara);
		Varukorg.laggiVarukorg(true, vara3);

		assertEquals(
				"[4 Plåt 150,00 25 , 2 Majs 12,00 12 , 1 Lego 100,00 25 , 4 Plåt 150,00 25 , 1 Lego 100,00 25 , 3 Örter 25,00 12 ]",
				varukorg1.getiVarukorg().toString());

	}

	@Test
	static void testsorteraVaraNamn() {

		varukorg1.sorteraVaraNamn();

		assertEquals(
				"[1 Lego 100,00 25 , 1 Lego 100,00 25 , 2 Majs 12,00 12 , 4 Plåt 150,00 25 , 4 Plåt 150,00 25 , 3 Örter 25,00 12 ]",
				varukorg1.getiVarukorg().toString());

	}

	@Test
	static void testsorteraVaraPris() {

		varukorg1.sorteraVaraPris();

		assertEquals(
				"[2 Majs 12,00 12 , 3 Örter 25,00 12 , 1 Lego 100,00 25 , 1 Lego 100,00 25 , 4 Plåt 150,00 25 , 4 Plåt 150,00 25 ]",
				varukorg1.getiVarukorg().toString());

	}

	@Test
	static void testsorteraVaraMoms() {

		varukorg1.sorteraVaraMoms();

		assertEquals(
				"[2 Majs 12,00 12 , 3 Örter 25,00 12 , 1 Lego 100,00 25 , 1 Lego 100,00 25 , 4 Plåt 150,00 25 , 4 Plåt 150,00 25 ]",
				varukorg1.getiVarukorg().toString());

	}

	@AfterAll
	static void utskrift() {

		testsorteraVaraNamn();

		System.out.println("-----------------------------");
		System.out.println("\nSorterat efter Varunamn:\n");
		System.out.println(varukorg1.toString());

		testsorteraVaraPris();
		System.out.println("-----------------------------");
		System.out.println("\nSorterat efter netto pris:\n");
		System.out.println(varukorg1.toString());

		testsorteraVaraMoms();
		System.out.println("-----------------------------");
		System.out.println("\nSorterat efter moms:\n");
		System.out.println(varukorg1.toString());

	}

}
