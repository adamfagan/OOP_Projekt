package produkt;

public class Oblecenie extends Produkt{
	
	public Oblecenie() {
		
	}
	public Oblecenie(int cena) {
		super(cena);
	}

	public int zistiCena() {
		return this.cena;
	}

	public void nastavCena(int cena) {
		this.cena = cena;
	}

}
