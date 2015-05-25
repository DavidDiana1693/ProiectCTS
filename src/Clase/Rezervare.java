package Clase;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Rezervare extends Camera{

	
	public String toString() {
		return "Rezervarea cu numarul: " + nrRezervare + " are pretul: "
				+ pretRezervare + ", tipul camerei este " + tipCamera + ", iar numarul de nopti: " + noptiCazare;
	}
	int nrRezervare;
	double pretRezervare;
	String tipCamera;
	int noptiCazare;
	
	ArrayList<Client> rez=new ArrayList<Client>();
	DefaultListModel lm1=new DefaultListModel();
	public Rezervare(){
		
	}
	public Rezervare(int nrRezervare, double pretRezervare, String tipCamera, int noptiCazare){
		super();
		this.nrRezervare=nrRezervare;
		this.pretRezervare=pretRezervare;
		this.tipCamera=tipCamera;
		this.noptiCazare=noptiCazare;
	}
	
	public Rezervare (Rezervare ro){
		this.nrRezervare=ro.nrRezervare;
		this.pretRezervare=ro.pretRezervare;
		this.rez=ro.rez;
		this.noptiCazare=ro.noptiCazare;
	}
	
	public int getNoptiCazare() {
		return noptiCazare;
	}
	public void setNoptiCazare(int noptiCazare) {
		this.noptiCazare = noptiCazare;
	}
	public ArrayList<Client> getRez() {
		return rez;
	}

	public void setRez(ArrayList<Client> rez) {
		this.rez = rez;
	}

	public double getPretRezervare() {
		return pretRezervare;
	}

	public void setPretRezervare(double pretRezervare) {
		this.pretRezervare = pretRezervare;
	}

	public int getNrRezervare() {
		return nrRezervare;
	}

	public void setNrRezervare(int nrRezervare) {
		this.nrRezervare = nrRezervare;
	}

	public Rezervare(Client client, int nrCamera) {
		super(client, nrCamera);
	
	}

	public String InfoRezervare(){
		return "Rezervarea cu numarul: "+this.nrRezervare+" este facuta pentru camera: "+this.nrCamera;
	}
	public void PretRezervare(double p) throws ExPretRezervare{
		if(p<0) throw new ExPretRezervare();
		this.pretRezervare=p;
	}
	public static Rezervare cautareRezervareNr(ArrayList<Rezervare> r, int nrRezervare)throws Exception{
		Rezervare re=null;
		if(r.size()!=0){
			for(Rezervare ri:r){
				if(ri.getRez().equals(nrRezervare)){re=new Rezervare(ri);}
			}
			if(re==null) throw new Exception ("Rezervare inexistenta!");
		}else throw new Exception("Hotelul nu are camere rezervate!");
	
	return re;
}
	public static ArrayList<Rezervare> MetodaAfisRezervare(){
		Rezervare ro=new Rezervare();
		Rezervare ro1=new Rezervare(5,190.2,"matrimoniala", 4);
		ArrayList<Rezervare> rac=new ArrayList<>();
		rac.add(ro1);
		
		return rac;
	}
	public String getTipCamera() {
		return tipCamera;
	}
	public void setTipCamera(String tipCamera) {
		this.tipCamera = tipCamera;
	}
	public void AdaugaRezervare(){
		Rezervare r=new Rezervare(1,220.5,"double",4);
		Rezervare r2=new Rezervare (2,310,"single",9);
		Rezervare r3=new Rezervare(3,166.5,"twin",7);
		ArrayList<Rezervare> rez=this.MetodaAfisRezervare();
		lm1.clear();
		for(Rezervare r4:rez)
		lm1.addElement(r4);
	}
	public void CalculPretRezervare(double pretRezervare) throws ExPretRezervare{
		if(pretRezervare<0) throw new ExPretRezervare();
	}
	public double PretRezervareHotel(ArrayList<Camera> lis) throws Exception{
		double pret=0;
		for(Camera c:lis){
			if(c.getNoptiCazare()!=0 & c.getPretCam()!=0){
				pret+=c.getNoptiCazare()*c.getPretCam();
			}else pret=0;
		}return pret;
	}
	
	
}

