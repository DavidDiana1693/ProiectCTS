package Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Clase.Camera;
import Clase.Client;
import Clase.Rezervare;

public class test07 {
	@Test
	public void testPret1() throws Exception{
	ArrayList<Camera> listuta=new ArrayList<>();
	Camera cu=new Camera("double");
	cu.setNoptiCazare(8);
	cu.setPretCam(0);
	listuta.add(cu);
	assertEquals("",0, new Rezervare().PretRezervareHotel((ArrayList<Camera>) listuta),0);
	
}
	@Test
	public void testPret() throws Exception{
		ArrayList<Camera> listuta=new ArrayList<>();
		Camera cu=new Camera("matrimoniala");
		cu.setNoptiCazare(8);
		cu.setPretCam(150);
		listuta.add(cu);
		assertEquals("",1200, new Rezervare().PretRezervareHotel((ArrayList<Camera>) listuta),0);
		
	}
	

}
