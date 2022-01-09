package person;



public class Person {
	
	String namn;
	String adress;
	long mobilNr;
	
	protected Person(String namn, String adress, long mobilNr) {
		this.namn = namn;
		this.adress = adress;
		this.mobilNr = mobilNr;
	}

	public Person() {
		
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

	public long getMobilNr() {
		return mobilNr;
	}

	public void setMobilNr(long mobilNr) {
		this.mobilNr = mobilNr;
	}
	

}
