package ucastnicitrhu;

import produkt.Produkt;

public class PredavajuciAmerican extends Predavajuci {

	public PredavajuciAmerican() {
		
	}
	public PredavajuciAmerican(String krajina) {
		super(krajina);
	}
	public PredavajuciAmerican(String krajina, int hodnotenie) {
		super(krajina, hodnotenie);
	}
	public PredavajuciAmerican(Produkt produkt) {
		super(produkt);
	}
	public PredavajuciAmerican(String krajina, int peniaze, int hodnotenie, Produkt produkt) {
		super(krajina, peniaze, hodnotenie, produkt);
	}

}
