package person;



public class Person {
	
	String namn;
	String adress;
	int mobilNr;
	
	protected Person(String namn, String adress, int mobilNr) {
		super();
		this.namn = namn;
		this.adress = adress;
		this.mobilNr = mobilNr;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public double getMobilNr() {
		return mobilNr;
	}

	public void setMobilNr(int mobilNr) {
		this.mobilNr = mobilNr;
	}
	

}
