package specifikacija;

import java.util.GregorianCalendar;

import Menjacnica.Kursevi;

public interface Specifikacija {

	void dodajKursValute(Kursevi kurs, GregorianCalendar naTajDatum);
	void brisanjeKursaValute(Kursevi kurs, GregorianCalendar naOvajDatum);
	Kursevi kursValuteNaOdredjeniDan(GregorianCalendar zaOvajDatum);
}
