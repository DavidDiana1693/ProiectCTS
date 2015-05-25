package Clase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultListModel;

import Interfete.ModPlata;

public class Client {
private String prenume;
String cnp;
private int varsta;

private ModPlata tipPlata;

public void setTipPlata(ModPlata tipPlata) {
	this.tipPlata = tipPlata;
}

DefaultListModel lm=new DefaultListModel();
public static final String FISIER = "Clienti.txt";
ArrayList<Client> clienti;

public Client(String cnp, int varsta){
	this.cnp=cnp;
	this.varsta=varsta;
}
public ArrayList<Client> getClienti() {
	return clienti;
}
public void setClienti(ArrayList<Client> clienti) {
	this.clienti = clienti;
}
public Client(String prenume){
	this.prenume=prenume;
}
public Client(String prenume, String cnp){
	this.prenume=prenume;
	this.cnp=cnp;
}
public Client(String prenume, String cnp, int varsta){
	super();
	this.prenume=prenume;
	this.cnp=cnp;
	this.varsta=varsta;
}
public Client(Client cl){
	super();
	this.prenume=cl.prenume;
	this.cnp=cl.cnp;
	this.varsta=cl.varsta;
}
public Client(){}
public int getVarsta() {
	return varsta;
}

public void setVarsta(int varsta) {
	this.varsta = varsta;
}

public String infoClient(){
	return "Clientul cu prenumele:" + this.getPrenume() + "si varsta " + this.getVarsta();
}
@Override
public String toString() {
	return "Clientul are: prenumele " + prenume + ", cnp-ul " + cnp + " si varsta " + varsta;
}

public String getPrenume() {
	return prenume;
}

public void setPrenume(String prenume) {
	this.prenume = prenume;
}

public String getCnp() {
	return cnp;
}
public void setCnp(String cnp) {
	this.cnp = cnp;
}
public static ArrayList<Client> MetodaAfisClient(){
	Client cl=new Client();
	Client c=new Client("dsfs","sfsd",22);
	Client c2=new Client("dgbdf","fsdf",25);
	ArrayList<Client> ac=new ArrayList<>();
	ac.add(c);
	ac.add(c2);
	return ac;
	
	
	
}
public void AdaugaClient(){
	Client c=new Client("Andrei","1892125470086",28);
	Client c1=new Client("Daria","2912354789028",25);
	Client c2=new Client("Daniel","1932541782006",22);
	ArrayList<Client> lis=this.MetodaAfisClient();
	lm.clear();
	for(Client c3:lis)
	lm.addElement(c3);
}



public static ArrayList<Client> getClientFile() throws ExFisierTxt{
	ArrayList<Client> clienti=new ArrayList<Client>();
	
	BufferedReader r= null;
	try{
		r=new BufferedReader(new FileReader(FISIER));
		StringBuilder b=new StringBuilder();
		String linie=r.readLine();
		while(linie!=null){
			b.append(linie);
			b.append(System.lineSeparator());
			linie=r.readLine();
		}
		String e=b.toString();
	}catch (IOException ec){
		throw new ExFisierTxt("Eroare la citire!",ec);
	}finally{
		try{
			r.close();
		}catch (IOException ec){
			throw new ExFisierTxt("Eroare la inchdere!",ec);
		}
	}return clienti;
}
public String VerificaSX(){
	if(cnp!=null){
		if (cnp.startsWith("1")) {return ("Masculin");}
		if (cnp.startsWith("2")) {return ("Feminin");}

	}
return ("CNP-ul nu este corect!");
}

public static Client CautaClientDupaVarsta(ArrayList<Client> listClienti, int varsta) throws Exception{
	Client cl=null;
	if(listClienti.size()!=0){
		for (int n=0;n<listClienti.size();n++){
			if(listClienti.get(n).getVarsta()== varsta)
				{cl=new Client(listClienti.get(n));}
			
		}if (cl==null) throw new Exception("-");
	}else throw new Exception("Lista nu contine niciun client!");
	return cl;
	}

}



