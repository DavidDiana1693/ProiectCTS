package Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Clase.Camera;
import Clase.Client;

public class test08 {

	@Test
	public void testCameraNuExista() throws Exception{
		Camera c=new Camera(4,"double",210.3);
		Camera c1=new Camera(9,"twin",160.5);
		Camera c3=new Camera(18,"single",80);
		try{
		ArrayList<Camera> listaCam=new ArrayList<Camera>();
		Camera.CameraTip(listaCam, "matrimoniala");
		assertFalse(true);}
		catch (Exception exp){assertTrue(true);}

	}
	@Test
	public void testCameraListaGoala() throws Exception{
		Camera c=new Camera(4,"double",210.3);
		Camera c1=new Camera(9,"twin",160.5);
		Camera c3=new Camera(18,"single",80);
		try{
		ArrayList<Camera> listaCam=new ArrayList<Camera>();
		Camera.CameraTip(listaCam, " ");
		assertFalse(true);}
		catch (Exception exp){assertTrue(true);}

	}
	@Test
	public void testCamera() throws Exception{
		Camera c=new Camera(4,"double",210.3);
		Camera c1=new Camera(9,"twin",160.5);
		Camera c3=new Camera(18,"single",80);
		ArrayList<Camera> listaCam=new ArrayList<Camera>();
		listaCam.add(c);
		listaCam.add(c1);
		listaCam.add(c3);
		assertEquals(c.getTipCamera(), Camera.CameraTip(listaCam,  "double").getTipCamera());

	}

}
