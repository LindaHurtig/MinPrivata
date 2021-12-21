package kund;

import person.Person;

public class Kund extends Person{
		int kundNr;
		
		
	public Kund(String namn, String adress, double mobilNr) {
		super(namn, adress, mobilNr);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Kund [kundNr=" + kundNr + ", namn=" + getNamn() + ", adress=" + getAdress() + ", mobilNr=" + getMobilNr() + "]";
	}
	
	
	void kundNrGenerator() {
		
	}
}
