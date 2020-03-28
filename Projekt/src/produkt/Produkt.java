package produkt;

public abstract class Produkt {
	protected int cena;
	
	public Produkt() {
		
	}
	public Produkt(int cena) {
		this.cena = cena;
	}

	public abstract int zistiCena();
	public abstract void nastavCena(int cena);

}
