package trh;

import java.util.*;

import platba.*;
import produkt.*;
import ucastnicitrhu.*;

public class Trh {
	private List<Predavajuci> predavajuci;
	private List<Kupujuci> kupujuci;
	
	private Iterator<Predavajuci> iterPredavajuci;
	private Iterator<Kupujuci> iterKupujuci;
	
	private Predavajuci obchodujuciPredavajuci;
	private Kupujuci obchodujuciKupujuci;
	
	private int pocetUcastnikov;
	
	private List<SledovatelTrhu> sledovatelia = new ArrayList<>();		//Zoznam sledovatelov (observerov), ktore sleduju
																		//tento predmet (subject)	
	public void pridajSledovatela(SledovatelTrhu novySledovatel) {		//Toto (Trh) je objekt - predmet
		sledovatelia.add(novySledovatel);								//ktory je sledovany
	}																	//Preto obsahuje tieto metody
																		//pridaj a upovedom (oznam nieco
	public void upovedomSledovatelov() {								//nove sledovatelom)
		for(SledovatelTrhu s : sledovatelia) {							//		
			s.upovedom();												//
		}																//
	}																	//
		
	public int zistiPocetUcastnikov(){
		return pocetUcastnikov;
	}
	public Predavajuci zistiPredavajuceho(int i) {
		return predavajuci.get(i);
	}
	public Kupujuci zistiKupujuceho(int i) {
		return kupujuci.get(i);
	}
	
	public void vytvorUcastnikov(int pocetKupujuci, int pocetKupujuciEuropan, int pocetKupujuciAmerican) {
		pocetUcastnikov = pocetKupujuci + pocetKupujuciEuropan + pocetKupujuciAmerican;
		predavajuci = new ArrayList<Predavajuci>();
		kupujuci = new ArrayList<Kupujuci>();
		
		for(int i = 0; i < pocetKupujuci; ++i) {
			predavajuci.add(new PredavajuciEuropan("Slovensko", 200, 5, new Oblecenie(100)));
			kupujuci.add(new Kupujuci("Amerika", 100, new KreditnaKarta()));
		}
		for(int i = pocetKupujuci; i < pocetKupujuci + pocetKupujuciEuropan; ++i) {
			predavajuci.add(new Predavajuci("Polsko", 300, 4, new Topanky(50)));
			kupujuci.add(new KupujuciEuropan("Holandsko", 200, new PayPal()));
		}
		for(int i = pocetKupujuci + pocetKupujuciEuropan; i < pocetUcastnikov; ++i) {
			predavajuci.add(new PredavajuciAmerican("Amerika", 100, 3, new Topanky(100)));
			kupujuci.add(new KupujuciAmerican("Amerika", 300, new Bitcoin()));
		}
	}
		
	public void obchod1na1(Kupujuci kupujuci, Predavajuci predavajuci) {
		kupujuci.kupuj(predavajuci);
	}
	
	public String trh() {
		String sprava = "";
		iterPredavajuci = predavajuci.iterator();
		iterKupujuci = kupujuci.iterator();
		
		for(int i = 0; i < pocetUcastnikov; i++) {
			sprava = sprava + dalsiObchod1na1();
		}
		return sprava;
	}
	
	public String dalsiObchod1na1() {
		obchodujuciPredavajuci = iterPredavajuci.next();
		obchodujuciKupujuci = iterKupujuci.next();
		
		upovedomSledovatelov();							//Oznamujeme zmenu sledovatelom - observerom
		
		obchod1na1(obchodujuciKupujuci, obchodujuciPredavajuci);
		
		return "Nove peniaze predavajuceho (so ziskom): " 
							+ obchodujuciPredavajuci.zistiPeniaze() + " / " + "Nove peniaze kupujuceho (odcitanie za kupu produktu): " 
							+ obchodujuciKupujuci.zistiPeniaze() + "Cena produktu: " + obchodujuciPredavajuci.zistiProdukt().zistiCena() + "\n";
	}

}
