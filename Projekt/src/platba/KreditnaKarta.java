package platba;

import ucastnicitrhu.*;

public class KreditnaKarta extends Platba {

	public void zaplat(Predavajuci predavajuci, Kupujuci kupujuci) {//Zatial takto, tieto funkcie resp. len odosliPeniaze potom vymažem z
		platba = "Kupujuci plati KreditnouKartou";		//kupujecho a kazdu tuto z funkcii zaplat
		kupujuci.odosliPeniaze(predavajuci); 						//mozem práve potom rôzne špecifikovat a menit ich
		kupujuci.nastavPeniaze(kupujuci.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());//algoritmus na základe druhu platby a kupujuceho
	}																			//Teraz zatial rozlíšenie závislosti od druhu kupujuceho a druhu platby
												 								//na základe výpisov
	public void zaplat(Predavajuci predavajuci, KupujuciAmerican kupujuciAmerican) {
		platba = "KupujuciAmerican plati KreditnouKartou";
		kupujuciAmerican.odosliPeniaze(predavajuci);
		kupujuciAmerican.nastavPeniaze(kupujuciAmerican.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());
	}

	public void zaplat(Predavajuci predavajuci, KupujuciEuropan kupujuciEuropan) {
		platba = "KupujuciEuropan plati KreditnouKartou";
		kupujuciEuropan.odosliPeniaze(predavajuci);
		kupujuciEuropan.nastavPeniaze(kupujuciEuropan.zistiPeniaze() - predavajuci.zistiProdukt().zistiCena());	
	}

}
