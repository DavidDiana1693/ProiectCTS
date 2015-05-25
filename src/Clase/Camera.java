package Clase;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Camera extends Restaurant{

	Client client;
	int nrCamera;
	String tipCamera;
	double pretCam;
	int noptiCazare;
	
	DefaultListModel lm3=new DefaultListModel();
	ArrayList<Client> clienti;
	public Camera(String tipCamera){
		this.tipCamera=tipCamera;
	}
	public Camera(int nrCamera, String tipCamera, double pretCam){
		super();
		this.nrCamera=nrCamera;
		this.tipCamera=tipCamera;
		this.pretCam=pretCam;
	}
	public Camera(Camera r){
		this.tipCamera=r.getTipCamera();
	}
	public Camera(int noptiCazare, int nrCamera){
		this.noptiCazare=noptiCazare;
		this.nrCamera=nrCamera;
	}
	@Override
	public String toString() {
		return "Camera cu numarul " + nrCamera + ", de tip " + tipCamera
				+ " are pretul " + pretCam ;
	}
	public String getTipCamera() {
		return tipCamera;
	}
	public void setTipCamera(String tipCamera) {
		this.tipCamera = tipCamera;
	}
	
	public Camera(){}
	public int getNoptiCazare() {
		return noptiCazare;
	}

	public void setNoptiCazare(int noptiCazare) {
		this.noptiCazare = noptiCazare;
	}
	
	ArrayList<String>func=new ArrayList<String>();
	
	public ArrayList<String> getFunc() {
		func.add("Wi-fi pe tot parcursul sejurului");
		func.add("Jacuzzi in camera");
		return func;
	}

	public void setFunc(ArrayList<String> func) {
		this.func = func;
	}

	public double getPretCam() {
		return pretCam;
	}

	public void setPretCam(int pretCam) {
		this.pretCam = pretCam;
	}
	
	
	public Camera(Client client, int nrCamera){
		super();
		this.client=client;
		this.nrCamera=nrCamera;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getNrCamera() {
		return nrCamera;
	}

	public void setNrCamera(int nrCamera) {
		this.nrCamera = nrCamera;
	}
	public String DescriereCamera(){
		return "Camera cu numarul: " + this.getNrCamera() + "are pretul: " + this.getPretCam();
	}
	public String Validare(){
		return "Clientul: " + this.client.getPrenume() + "a rezervat camera cu numarul: " + this.getNrCamera();
	}
	//hotelul are 20 camere 
	public void nrCamere(int nrCamera) throws ExNrCamera{
		if (nrCamera<1)throw new ExNrCamera();
		else if (nrCamera>20) throw new ExNrCamera();
	}
	public double CalculPretCamera(Camera c) throws Exception{
	if(c!=null){
		if(noptiCazare!=0 & this.getPretCam()!=0.0)
		
			
			return this.getPretCam()*noptiCazare;	
		
		else return 0;
		}
	else throw new Exception("Nr nopti cazare invalid");
		
}
	public static ArrayList<Camera> MetodaAfisCamera(){
		Camera e1=new Camera();
		Camera e=new Camera(1, "double", 210);
		ArrayList<Camera> ca= new ArrayList<Camera>();
		ca.add(e);
		return ca;
	
		
		
	}
	public void AdaugaCamera(){
		Camera e=new Camera(1,"double",210);
		Camera e1=new Camera(2,"single",190.5);
		Camera e2=new Camera(3,"twin", 310);
		
		ArrayList<Camera> listuta=this.MetodaAfisCamera();
		lm3.clear();
		for(Camera e3:listuta)
		lm3.addElement(e3);
	}
	@Override
	public String AfisClienti() {
		StringBuilder bu=new StringBuilder();
		if(clienti.size()!=0){
		for(int i=0;i<clienti.size();i++){
			Client ce=clienti.get(i);
			bu.append(ce.getPrenume());
			
		}
		bu.append(" -> ");
		bu.append(getTipCamera()).append(" ");
		bu.append(getNume());
		return bu.toString();}
	
		else return null;
	}
	public ArrayList<Client> getClienti() {
		return clienti;
	}
	public void setClienti(ArrayList<Client> clienti) {
		this.clienti = clienti;
	}
	public void TestezNrNoptiCazare(int nrNopti) throws Exception{
		if(nrNopti==0) throw new Exception ("Numar nopti cazare invalid!");
		if(nrNopti>30) throw new Exception("Numarul de nopti de cazare depaseste limita!");
		if(nrNopti<0) throw new Exception ("Este imposibil ca numarul de nopti de cazare sa fie negativ!");
	}
	public static Camera CameraTip(ArrayList<Camera> listaCam,String tipCamera)throws Exception{
		Camera c=null;
		if(listaCam.size()!=0){
			for(Camera c1:listaCam){
				if(c1.getTipCamera().equals(tipCamera)){c=new Camera(c1);}
			}if (c==null) throw new Exception("Tipul de camera cautat nu exista!");
		}else throw new Exception("Lista nu contine nicio camera!");
		return c;
	}
	
	
}
