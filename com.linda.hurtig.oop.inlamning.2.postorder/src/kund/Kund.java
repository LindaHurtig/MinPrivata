package kund;

import person.Person;
import varukorg.Varukorg;

public class Kund extends Person{
		int kundNr;
		Varukorg varukorg ;


		/**
		 * 
		 * @param kundNr
		 * @param namn
		 * @param adress
		 * @param mobilNr
		 * @param varukorg
		 */

	public Kund(String namn, String adress, long mobilNr, int kundNr, Varukorg varukorg1) {
		super(namn, adress, mobilNr);
		this.kundNr = kundNr;
		this.varukorg = varukorg1;
	}



	public Kund() {
			
		}


	public int getKundNr() {
		return kundNr;
	}


	public void setKundNr(int kundNr) {
		this.kundNr = kundNr;
	}

	public Varukorg getVarukorg() {
		return varukorg;
	}
	
	public void setVarukorg(Varukorg varukorg1) {
		this.varukorg = varukorg1;
	}


	@Override
	public String toString() {
		return "Kund [kundNr=" + kundNr + ", namn=" + getNamn() + ", adress=" + getAdress() + ", mobilNr=" + getMobilNr() + "\nVarukorg: " + getVarukorg()+ "]";
	}



}
