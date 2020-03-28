package platba;

import ucastnicitrhu.*;

public abstract class Platba {
	public String platba;
	
	public abstract void zaplat(Predavajuci predavajuci, Kupujuci kupujuci);
	public abstract void zaplat(Predavajuci predavajuci, KupujuciAmerican kupujuciAmerican);
	public abstract void zaplat(Predavajuci predavajuci, KupujuciEuropan kupujuciEuropan);

}
