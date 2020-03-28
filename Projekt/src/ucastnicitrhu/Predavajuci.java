package ucastnicitrhu;

import produkt.*;

public class Predavajuci implements Peniaze {
	private String krajina;
	private int peniaze;
	private int hodnotenie;
	private Produkt produkt;
	
	public Predavajuci() {
		
	}
	public Predavajuci(String krajina) {
		this.nastavKrajina(krajina);
	}
	public Predavajuci(String krajina, int hodnotenie) {
		this.nastavKrajina(krajina);
		this.nastavHodnotenie(hodnotenie);
	}
	public Predavajuci(Produkt produkt) {
		this.nastavProdukt(produkt);
	}
	public Predavajuci(String krajina, int peniaze, int hodnotenie, Produkt produkt) {
		this.nastavKrajina(krajina);
		this.nastavPeniaze(peniaze);
		this.nastavHodnotenie(hodnotenie);
		this.nastavProdukt(produkt);
	}
	
	public String zistiKrajina() {
		return krajina;
	}
	public void nastavKrajina(String krajina) {
		this.krajina = krajina;
	}
	
	public int zistiPeniaze() {
		return this.peniaze;
	}
	public void nastavPeniaze(int peniaze) {
		this.peniaze = peniaze;
	}
	
	public int zistiHodnotenie() {
		return hodnotenie;
	}
	public void nastavHodnotenie(int hodnotenie) {
		this.hodnotenie = hodnotenie;
	}
	
	public Produkt zistiProdukt() {
		return produkt;
	}
	public void nastavProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	
	public void prijmiPeniaze(int prijmanaSuma) {
		this.peniaze += prijmanaSuma;
	}
	
	@Override
	public void odosliPeniaze(Predavajuci predavajuci) {
		// TODO Auto-generated method stub
		
	}
	
	public void predaj() {
		nastavProdukt(new Oblecenie());
	}

}
