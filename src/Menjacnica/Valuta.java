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
		if(naziv == null || naziv == ""){
			throw new NullPointerException();
		}
		else{
			this.naziv = naziv;
		}
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null || skraceniNaziv == ""){
			throw new NullPointerException();
		}
			this.skraceniNaziv = skraceniNaziv;
	}

	public LinkedList<Kursevi> getKurs() {
		return kurs;
	}

	public void setKurs(LinkedList<Kursevi> kurs) {
		if(kurs == null){
			throw new NullPointerException();
		}
		this.kurs = kurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", kurs=" + kurs + "]";
	}
	
	
	
}
