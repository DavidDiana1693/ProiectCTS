package Testing;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Clase.Camera;
import Clase.Client;
import Clase.Rezervare;

public class test02 {
	ArrayList<Client> clienti1;
	Camera c;

	@Before
	public void SetCl(){
		c = new Camera();
		 clienti1=new ArrayList<Client>();
		
	}
	
	@Test
	public void TestAssertEquals(){
		Client cli=new Client("client1 ");
		Client cli2=new Client("client2");
		clienti1.add(cli);
		clienti1.add(cli2);
		c.setClienti(clienti1);
		c.setTipCamera("double");
		assertEquals("client1 client2 -> double null",c.AfisClienti());
		
	}
	@Test
	public void TestListClientiDif0(){
		Client e=new Client("Andreea");
		Client e1=new Client("Alin");
		Client e2=new Client("Marius");
		clienti1.add(e);
		clienti1.add(e1);
		clienti1.add(e2);
		c.setClienti(clienti1);
		assertNotNull(c.AfisClienti());
		

	}
	@Test
	public void TestListClientiEgal0(){
		c.setClienti(clienti1);
		assertNull(c.AfisClienti());
		
	}
}
