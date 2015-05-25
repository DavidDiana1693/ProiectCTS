package Clase;

import Interfete.ModPlata;

public class Cash implements ModPlata {

	@Override
	public void plateste(String numeClient) {
		System.out.println(numeClient + " va achita cash.");
		
	}
	
}
