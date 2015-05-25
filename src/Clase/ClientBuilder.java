package Clase;

import Interfete.IClientBuilder;

public class ClientBuilder implements IClientBuilder {

	private String prenume;
	private String cnp;
	private int varsta;
	
	@Override
	public Client build() {
		return new Client(prenume,cnp,varsta);
	}
	
	public ClientBuilder setPrenume(String _prenume) {
		prenume = _prenume;
		return this;
	}
	public ClientBuilder setCnp(String _cnp) {
		cnp = _cnp;
		return this;
	}
	public ClientBuilder setVarsta(int _varsta) {
		varsta = _varsta;
		return this;
	}
	
	
	
}
