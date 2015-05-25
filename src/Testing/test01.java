package Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Clase.Client;
import Clase.ExFisierTxt;
import Clase.ExPretRezervare;
import Clase.Rezervare;

public class test01 { 
	Client client;
	ArrayList<Client> listuta;
	
	@Before
	public void initialize() throws ExFisierTxt{
		 client=new Client();
		 listuta=client.getClientFile();
	}
	@Test
	public void ListaNula() throws ExFisierTxt{
		
		assertNotNull(listuta);
	}
	@Test
	public void PretRezervareNegativ() throws ExPretRezervare{
		try{
			Rezervare r=new Rezervare();
			r.CalculPretRezervare(-120);
			assertFalse(true);
		}catch (ExPretRezervare e){
			assertTrue(true);
		}
	}
	
	@Test
	public void ClientVerificaVarsta() {
		Client client=new Client("Andrei","1892125470086",28);
		assertEquals(28,  client.getVarsta());
	}
	@Test
	public void VarstaNula(){
		Client client=new Client("Andrei");
		assertEquals(0,  client.getVarsta());
	
	}
	@After
	public void delete(){
		System.gc();
	}
	

}
