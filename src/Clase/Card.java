package Clase;

import Interfete.ModPlata;

public class Card implements ModPlata {

	@Override
	public void plateste(String numeClient) {
		System.out.println(numeClient + " va achita cu cardul.");
		
	}
	
}
