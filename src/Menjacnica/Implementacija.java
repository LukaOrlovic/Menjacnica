package Menjacnica;

import java.util.GregorianCalendar;

import specifikacija.Specifikacija;

public class Implementacija extends Menjacnica implements Specifikacija {

	@Override
	public void dodajKursValute(Kursevi kurs, GregorianCalendar naTajDatum) {

		for (int i = 0; i < this.valute.size(); i++) {  
			for (int j = 0; j < this.valute.get(i).getKurs().size(); j++) {

				if((this.valute.get(i).getKurs().get(j).getDatum()) == naTajDatum){
					this.valute.get(i).getKurs().add(kurs);
				}	
			}
		}

	}

	@Override
	public void brisanjeKursaValute(Kursevi kurs, GregorianCalendar naOvajDatum) {
		
		for (int i = 0; i < this.valute.size(); i++) {  
			for (int j = 0; j < this.valute.get(i).getKurs().size(); j++) {

				if((this.valute.get(i).getKurs().get(j).getDatum()) == naOvajDatum){
					this.valute.get(i).getKurs().remove(kurs);
				}	
			}
		}
		
	}

	@Override
	public Kursevi kursValuteNaOdredjeniDan(GregorianCalendar zaOvajDatum) {

		for (int i = 0; i < this.valute.size(); i++) {  
			for (int j = 0; j < this.valute.get(i).getKurs().size(); j++) {

				if((this.valute.get(i).getKurs().get(j).getDatum()) == zaOvajDatum){
					return this.valute.get(i).getKurs().get(j);
				}	
			}
		}
		return null;
	}

}
