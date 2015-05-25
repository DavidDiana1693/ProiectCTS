package Testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Clase.Camera;
import Clase.Restaurant;

public class test05 {
	Restaurant r;
	
	@Before
	public void SetRest(){
		r=Mockito.mock(Restaurant.class);
	}
	@Test
	public void test3(){
		Restaurant res=new Camera();
		res.setPretMeniu(52.6);
		assertTrue(res.TestarePret());
	}
	@Test
	public void test4(){
		Restaurant res=new Camera();
		res.setPretMeniu(145.3);
		assertFalse(res.TestarePret());
	}
	@Test
	public void test1() {
		Mockito.when(r.getPretMeniu()).thenReturn(15.5);
	assertFalse(r.TestarePret());
	}
	@Test
	public void test2(){
		Mockito.when(r.getPretMeniu()).thenReturn(150.3);
		assertFalse(r.TestarePret());
	}
	
	
	
	
	

}
