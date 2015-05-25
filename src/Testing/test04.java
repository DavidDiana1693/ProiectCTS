package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Clase.Camera;
import Clase.Client;

public class test04 {
	@Test
	public void test3(){
		Client w=new Client("Marian");
		w.setCnp("abcdef");
		assertEquals("CNP-ul nu este corect!",w.VerificaSX());
	}
	
	@Test
	public void test2(){

		Client w=new Client("Andrei");
		w.setCnp("15545212565");
		assertEquals("Masculin",w.VerificaSX());
	}
	@Test
	public void test1(){
		
			Client w=new Client("Alina");
			w.setCnp("258452125475");
			assertEquals("Feminin",w.VerificaSX());
		}
	
}
