package ucastnicitrhu;

import produkt.Produkt;

public class PredavajuciEuropan extends Predavajuci {

	public PredavajuciEuropan() {
	
	}
	public PredavajuciEuropan(String krajina) {
		super(krajina);
	}
	public PredavajuciEuropan(String krajina, int hodnotenie) {
		super(krajina, hodnotenie);
	}
	public PredavajuciEuropan(Produkt produkt) {
		super(produkt);
	}
	public PredavajuciEuropan(String krajina, int peniaze, int hodnotenie, Produkt produkt) {
		super(krajina, peniaze, hodnotenie, produkt);
	}
	
}
