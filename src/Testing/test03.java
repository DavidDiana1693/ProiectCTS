package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Clase.Camera;
import Clase.Client;
import Clase.ExNoptiCazare;

public class test03 {
	@Test
	public void TestNoptiRezervare2() throws Exception{
		try{
		Camera car=new Camera();
		car.TestezNrNoptiCazare(0);
		assertFalse(true);}
	catch(Exception m){}
	
}
	
	
	@Test
	public void TestNoptiRezervare() throws Exception{
		try{
		Camera car=new Camera();
		car.TestezNrNoptiCazare(36);
		assertFalse(true);}
	catch(Exception m){}
	
}
	@Test
	public void TestNull() throws Exception{
		Camera c=new Camera(8,12);
		c.setPretCam(0);
		assertEquals("",0,c.CalculPretCamera(c),0);
	}
	@Test
	public void TestPretCameraNull() throws Exception{
		Camera c=new Camera(0,5);
		c.setPretCam(120);
		assertEquals("",0,c.CalculPretCamera(c),0);
	}
	@Test
	public void TestPretCamera() throws Exception{
		Camera c=new Camera(5,1);
		c.setPretCam(120);
		assertEquals("",600,c.CalculPretCamera(c),0);
	}
	

	
}
