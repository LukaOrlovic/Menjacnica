package Menjacnica;

import java.util.GregorianCalendar;

import specifikacija.Specifikacija;

public class Implementacija extends Menjacnica implements Specifikacija {

	@Override
	public void dodajKursValute(Kursevi kurs, GregorianCalendar naTajDatum) {
		
		int i = 0;
		
		while(this.valute.get(i) != null){

			int j = 0;
			
			while(this.valute.get(i).getKurs().get(j) != null){
				
				if((this.valute.get(i).getKurs().get(j).getDatum()) == naTajDatum){
					this.valute.get(i).getKurs().set(j, kurs);
	     		}
				j++;
			}
			i++;		
		}
	}

	@Override
	public void brisanjeKursaValute(Kursevi kurs, GregorianCalendar naOvajDatum) {
		

	}

	@Override
	public Kursevi kursValuteNaOdredjeniDan(GregorianCalendar zaOvajDatum) {
		
		return null;
	}

}
