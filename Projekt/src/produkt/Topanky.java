package produkt;

public class Topanky extends Produkt{
	
	public Topanky() {
		
	}
	public Topanky(int cena) {
		super(cena);
	}

	public int zistiCena() {
		return this.cena;
	}

	public void nastavCena(int cena) {
		this.cena = cena;
	}

}
