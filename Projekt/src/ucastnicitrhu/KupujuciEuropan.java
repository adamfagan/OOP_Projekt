package ucastnicitrhu;

import platba.Platba;

public class KupujuciEuropan extends Kupujuci {

	public KupujuciEuropan() {
		
	}
	public KupujuciEuropan(int peniaze, Platba platba) {
		super(peniaze, platba);
	}
	public KupujuciEuropan(String krajina) {
		super(krajina);
	}
	public KupujuciEuropan(String krajina, int peniaze, Platba kreditnaKarta) {
		super(krajina, peniaze, kreditnaKarta);
	}
	
	public void kupuj(Predavajuci predavajuci) {
		platba.zaplat(predavajuci, this);
		this.produkt = predavajuci.zistiProdukt();
		predavajuci.predaj();
	}

}
