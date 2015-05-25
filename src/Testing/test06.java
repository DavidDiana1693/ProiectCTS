package Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Clase.Client;

public class test06 {
	@Test
	public void test3() throws Exception{
		Client c=new Client("Vic", "125478854622",23);
		Client c1=new Client("Emi","192354458265",24);
		try{
			ArrayList<Client>listuta=new ArrayList<>();
			listuta.add(c);
			listuta.add(c1);
			Client.CautaClientDupaVarsta(listuta,  16);
		}catch (Exception exp){assertTrue(true);}
	}
	@Test
	public void test1() throws Exception{
		Client c=new Client("Vic", "125478854622",23);
		Client c1=new Client("Emi","192354458265",24);
		try{
		ArrayList<Client> listuta=new ArrayList<Client>();
		Client.CautaClientDupaVarsta(listuta, 23);
		assertFalse(true);
		} catch (Exception exp) {assertFalse(false);}
	}
	@Test
	public void test() throws Exception{
		Client c=new Client("Vic", "125478854622",23);
		Client c1=new Client("Emi","192354458265",24);
		ArrayList<Client> listuta=new ArrayList<Client>();
		listuta.add(c);
		listuta.add(c1);
		assertEquals(c1.getVarsta(),Client.CautaClientDupaVarsta(listuta, 24).getVarsta());
		
	}
	

}
