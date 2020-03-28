package ucastnicitrhu;

import platba.*;
import produkt.*;

public class Kupujuci implements Peniaze {
	private String krajina;
	private int peniaze;
	protected Platba platba;
	protected Produkt produkt;
	
	
	public Kupujuci() {
		
	}
	public Kupujuci(int peniaze, Platba platba) {
		this.nastavPeniaze(peniaze);
		this.nastavPlatba(platba);
	}
	public Kupujuci(String krajina) {
		this.nastavKrajina(krajina);
	}
	public Kupujuci(String krajina, int peniaze, Platba platba) {
		this.nastavKrajina(krajina);
		this.nastavPeniaze(peniaze);
		this.nastavPlatba(platba);
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
	
	public Platba zistiPlatba() {
		return platba;
	}
	public void nastavPlatba(Platba platba) {
		this.platba = platba;
	}
	
	public Produkt zistiProdukt() {
		return produkt;
	}
	public void nastavProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	
	@Override
	public void prijmiPeniaze(int prijmanaSuma) {
		// TODO Auto-generated method stub
	}

	public void odosliPeniaze(Predavajuci predavajuci) {
		predavajuci.prijmiPeniaze(predavajuci.zistiProdukt().zistiCena());
	}
	
	public void kupuj(Predavajuci predavajuci) {
		platba.zaplat(predavajuci, this);
		this.produkt = predavajuci.zistiProdukt();
		predavajuci.predaj();
	}

}
