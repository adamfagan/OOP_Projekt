package ucastnicitrhu;

import platba.*;

public class KupujuciAmerican extends Kupujuci {

	public KupujuciAmerican() {
		
	}
	public KupujuciAmerican(int peniaze, Platba platba) {
		super(peniaze, platba);
	}
	public KupujuciAmerican(String krajina) {
		super(krajina);
	}
	public KupujuciAmerican(String krajina, int peniaze, Platba kreditnaKarta) {
		super(krajina, peniaze, kreditnaKarta);
	}
	
	public void kupuj(Predavajuci predavajuci) {
		platba.zaplat(predavajuci, this);
		this.produkt = predavajuci.zistiProdukt();
		predavajuci.predaj();
	}

}
