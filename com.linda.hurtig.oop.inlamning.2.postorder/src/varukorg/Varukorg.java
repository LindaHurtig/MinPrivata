package varukorg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import varor.Vara;

public class Varukorg {

	private static List<Vara> iVarukorg = new ArrayList<Vara>();

	float saldoInkMoms;
	float saldoExMoms;

	public Varukorg(float saldoInkMoms, float saldoExMoms) {
		super();
		this.saldoInkMoms = saldoInkMoms;
		this.saldoExMoms = saldoExMoms;
	}

	public List<Vara> getiVarukorg() {
		return iVarukorg;
	}

	public void setIVarukorg(List<Vara> iVarukorg) {
		Varukorg.iVarukorg = iVarukorg;
	}

	public float getSaldoInkMoms() {

		return saldoInkMoms;
	}

	public void setSaldoInkMoms(float saldoInkMoms) {
		float prisInkMoms = 0;
		for (int i = 0; i < iVarukorg.size(); i++) {
			prisInkMoms = raknaMoms(iVarukorg.get(i));

			saldoInkMoms += prisInkMoms;
		}

		this.saldoInkMoms = saldoInkMoms;
	}

	public float getSaldoExMoms() {

		return saldoExMoms;
	}

	public void setSaldoExMoms() {
		float saldo = 0;
		for (int i = 0; i < iVarukorg.size(); i++) {
			saldo = saldo + iVarukorg.get(i).getNettoPris();
		}

		this.saldoExMoms = saldo;
	}

	public static void laggiVarukorg(boolean kop, Vara vara) {

		if (kop) {

			iVarukorg.add(vara);
		}

	}

	float raknaMoms(Vara vara) {

		float momsIDec = ((float) vara.getMomsSats() / 100);
		float momsIKr = (vara.getNettoPris() * momsIDec);

		float prisMoms = vara.getNettoPris() + momsIKr;

		return prisMoms;

	}

	@Override
	public String toString() {

		System.out.println("Vara" + "\tNettopris" + "\tMoms\n");

		for (int i = 0; i < iVarukorg.size(); i++) {

			System.out.print(((Vara) iVarukorg.get(i)).getVaraNamn());
			System.out.print("\t" + ((Vara) iVarukorg.get(i)).getNettoPris());
			System.out.println("\t\t" + ((Vara) iVarukorg.get(i)).getMomsSats() + "%");

		}

		String sEm = String.format("\nSaldo ex moms: %.2f", saldoExMoms);
		String sIm = String.format("\nSaldo ink moms: %.2f", saldoInkMoms);

		String kvitto = sEm.concat(sIm);

		return kvitto;

	}

	void sorteraVaraNamn() {

		Collections.sort(iVarukorg, new JfrVarorNamn());
	}

	void sorteraVaraPris() {

		Collections.sort(iVarukorg, new JfrVarorPris());

	}

	void sorteraVaraMoms() {

		Collections.sort(iVarukorg, new JfrVarorMoms());

	}

}

class JfrVarorPris implements Comparator<Vara> {

	public int compare(Vara o1, Vara o2) {
		return (int) (o1.getNettoPris() - o2.getNettoPris());
	}

}

class JfrVarorMoms implements Comparator<Vara> {

	public int compare(Vara o1, Vara o2) {
		return (int) (o1.getMomsSats() - o2.getMomsSats());
	}

}

class JfrVarorNamn implements Comparator<Vara> {

	public int compare(Vara o1, Vara o2) {
		return o1.getVaraNamn().compareTo(o2.getVaraNamn());
	}

}
