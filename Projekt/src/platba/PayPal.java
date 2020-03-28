package platba;

import ucastnicitrhu.*;

public class PayPal extends Platba {

	public void zaplat(Predavajuci predavajuci, Kupujuci kupujuci) {
		platba = "Kupujuci plati PayPal-om";
		kupujuci.odosliPeniaze(predavajuci);
		kupujuci.nastavPeniaze(kupujuci.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());
	}
	
	public void zaplat(Predavajuci predavajuci, KupujuciAmerican kupujuciAmerican) {
		platba = "KupujuciAmerican plati PayPal-om";
		kupujuciAmerican.odosliPeniaze(predavajuci);
		kupujuciAmerican.nastavPeniaze(kupujuciAmerican.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());
	}

	public void zaplat(Predavajuci predavajuci, KupujuciEuropan kupujuciEuropan) {
		platba = "KupujuciEuropan plati PayPal-om";
		kupujuciEuropan.odosliPeniaze(predavajuci);
		kupujuciEuropan.nastavPeniaze(kupujuciEuropan.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());
	}

}
