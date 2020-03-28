package platba;

import ucastnicitrhu.*;

public class Bitcoin extends Platba {

	public void zaplat(Predavajuci predavajuci, Kupujuci kupujuci) {
		platba = "Kupujuci plati Bitcoin-om";
		kupujuci.odosliPeniaze(predavajuci);
		kupujuci.nastavPeniaze(kupujuci.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());
	}
	
	public void zaplat(Predavajuci predavajuci, KupujuciAmerican kupujuciAmerican) {
		platba = "KupujuciAmerican plati Bitcoin-om";
		kupujuciAmerican.odosliPeniaze(predavajuci);
		kupujuciAmerican.nastavPeniaze(kupujuciAmerican.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());
		
	}

	public void zaplat(Predavajuci predavajuci, KupujuciEuropan kupujuciEuropan) {
		platba = "KupujuciEuropan plati Bitcoin-om";
		kupujuciEuropan.odosliPeniaze(predavajuci);
		kupujuciEuropan.nastavPeniaze(kupujuciEuropan.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());
	}

}
