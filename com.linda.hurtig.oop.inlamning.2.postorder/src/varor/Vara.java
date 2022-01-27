package varor;

import varukorg.Varukorg;

public class Vara {

	int artNr;
	String varaNamn;
	float nettoPris;
	int momsSats;
	boolean kop;

	/**
	 * 
	 * @param artNr     = artikelnummer
	 * @param varaNamn  = varans namn
	 * @param nettoPris = netto pris
	 * @param momsSats  = moms sats
	 */
	public Vara(int artNr, String varaNamn, float nettoPris, int momsSats) {
		super();
		this.artNr = artNr;
		this.varaNamn = varaNamn;
		this.nettoPris = nettoPris;
		this.momsSats = momsSats;
	}

	public Vara() {

	}

	public int getArtNr() {
		return artNr;
	}

	public void setArtNr(int artNr) {
		this.artNr = artNr;
	}

	public String getVaraNamn() {
		return varaNamn;
	}

	public void setVaraNamn(String varaNamn) {
		this.varaNamn = varaNamn;
	}

	public float getNettoPris() {
		return nettoPris;
	}

	public void setNettoPris(float nettoPris) {
		this.nettoPris = nettoPris;
	}

	public int getMomsSats() {
		return momsSats;
	}

	public void setMomsSats(int momsSats) {
		this.momsSats = momsSats;
	}

	boolean kopa(boolean kop, Vara vara) {
		kop = true;
		Varukorg.laggiVarukorg(kop, vara);

		return true;
	}

	@Override
	public String toString() {

		String arNr = String.format("%d ", artNr);
		String vNamn = String.format("%s ", varaNamn);
		String nPris = String.format("%.2f ", nettoPris);
		String mSats = String.format("%d ", momsSats);

		String vara = arNr.concat(vNamn).concat(nPris).concat(mSats);

		return vara;
	}


}
