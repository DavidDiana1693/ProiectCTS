package Clase;

import java.io.IOException;

public class ExFisierTxt extends IOException {

	public ExFisierTxt(String mesaj, IOException ex){
		super(mesaj, ex);
	}
}
