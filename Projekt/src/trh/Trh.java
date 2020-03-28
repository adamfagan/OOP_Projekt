package trh;

import platba.*;
import produkt.*;
import ucastnicitrhu.*;

public class Trh {
	private Predavajuci[] predavajuci;
	private Kupujuci[] kupujuci;
	private int pocetUcastnikov;
		
	public int zistiPocetUcastnikov(){
		return pocetUcastnikov;
	}
	public Predavajuci zistiPredavajuceho(int i) {
		return predavajuci[i];
	}
	public Kupujuci zistiKupujuceho(int i) {
		return kupujuci[i];
	}
	
	public void vytvorUcastnikov(int pocetKupujuci, int pocetKupujuciEuropan, int pocetKupujuciAmerican) {
		pocetUcastnikov = pocetKupujuci + pocetKupujuciEuropan + pocetKupujuciAmerican;
		predavajuci = new Predavajuci[pocetUcastnikov];
		kupujuci = new Kupujuci[pocetUcastnikov];
		
		for(int i = 0; i < pocetKupujuci; ++i) {
			predavajuci[i] = new PredavajuciEuropan("Slovensko", 200, 5, new Oblecenie(100));
			kupujuci[i] = new Kupujuci("Amerika", 100, new KreditnaKarta());
		}
		for(int i = pocetKupujuci; i < pocetKupujuci + pocetKupujuciEuropan; ++i) {
			predavajuci[i] = new Predavajuci("Polsko", 300, 4, new Topanky(50));
			kupujuci[i] = new KupujuciEuropan("Holandsko", 200, new PayPal());
		}
		for(int i = pocetKupujuci + pocetKupujuciEuropan; i < pocetUcastnikov; ++i) {
			predavajuci[i] = new PredavajuciAmerican("Amerika", 100, 3, new Topanky(100));
			kupujuci[i] = new KupujuciAmerican("Amerika", 300, new Bitcoin());
		}

	}
		
	public void obchod1na1(Kupujuci kupujuci, Predavajuci predavajuci) {
		kupujuci.kupuj(predavajuci);
	}
	
	public String trh() {
		String sprava = "";
		
		for(int i = 0; i < kupujuci.length; i++) {
			obchod1na1(kupujuci[i], predavajuci[i]);
			sprava = sprava + i + "---" + "Nove peniaze predavajuceho (so ziskom): " 
							+ predavajuci[i].zistiPeniaze() + " / " + "Nove peniaze kupujuceho (odcitanie za kupu produktu): " 
							+ kupujuci[i].zistiPeniaze() + "Cena produktu: " + predavajuci[i].zistiProdukt().zistiCena() + "\n";
		}
		return sprava;
	}

}
