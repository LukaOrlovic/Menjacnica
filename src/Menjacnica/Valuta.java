package Menjacnica;

import java.util.LinkedList;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	
	private LinkedList<Kursevi> kurs = new LinkedList<Kursevi>();

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public LinkedList<Kursevi> getKurs() {
		return kurs;
	}

	public void setKurs(LinkedList<Kursevi> kurs) {
		this.kurs = kurs;
	}
	
	
}
