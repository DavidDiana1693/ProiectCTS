package Clase;

public abstract class Restaurant {

	public String nume;
	int nrClienti;
	double pretMeniu;
	public double getPretMeniu() {
		return pretMeniu;
	}
	public void setPretMeniu(double pretMeniu) {
		this.pretMeniu = pretMeniu;
	}
	public Restaurant(){}
	
	@Override
	public String toString() {
		return "Restaurant [nume=" + nume + ", nrClienti=" + nrClienti
				+ ", pretMeniu=" + pretMeniu + "]";
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNrClienti() {
		return nrClienti;
	}
	public void setNrClienti(int nrClienti) {
		this.nrClienti = nrClienti;
	}
	public boolean TestarePret(){
		boolean verificare=false;
		if(getPretMeniu()<100) verificare=true;
		if(getPretMeniu()>100) verificare=false;
		return verificare;
	}
	public abstract String AfisClienti();
}
