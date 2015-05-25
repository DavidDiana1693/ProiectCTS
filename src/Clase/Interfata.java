package Clase;

import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfata extends JFrame{
public static Interfata i=new Interfata();
	private JPanel jp;
	private JTextField tf;
	
	
	Client c=new Client("Andrei","1892125470086",28);
	Client c1=new Client("Daria","2912354789028",25);
	Client c2=new Client("Daniel","1932541782006",22);
	
	
	
	Rezervare r0=new Rezervare(1,220.5,"double",4);
	Rezervare r2=new Rezervare (2,310,"single",9);
	Rezervare r3=new Rezervare(3,166.5,"twin",7);
	
	Camera e=new Camera(1,"double",210);
	Camera e1=new Camera(2,"single",190.5);
	Camera e2=new Camera(3,"twin", 310);

	ArrayList<Camera> ca=new ArrayList<Camera>();
	ArrayList<Client> l=new ArrayList<Client>();
	ArrayList <Rezervare> r=new ArrayList<Rezervare>();
	DefaultListModel dlm=new DefaultListModel();
	DefaultListModel dlm1=new DefaultListModel();
	DefaultListModel dlm2=new DefaultListModel();
	
	public void AdaugClient(){
		dlm.clear();
		dlm.addElement(c);
		dlm.addElement(c1);
		dlm.addElement(c2);
		
		
	}
	public void AdaugRezervare(){
		dlm1.clear();
		dlm1.addElement(r0);
		dlm1.addElement(r2);
		dlm1.addElement(r3);
	}
	public void AdaugCamera(){
		dlm2.clear();
		dlm2.addElement(e);
		dlm2.addElement(e1);
		dlm2.addElement(e2);
	}
	
	public static void main(String [] args){
		EventQueue.invokeLater(new Runnable(){
		public void run(){
			try{
				i.setVisible(true);
			}catch(Exception exe){
				exe.printStackTrace();
			}
		}
	});
	
}
	public Interfata(){
		if (i != null) {
            throw new IllegalStateException("Already instantiated");
        }
		
		c.setTipPlata(new Cash());
		c1.setTipPlata(new Card());
		c2.setTipPlata(new Cash());
		getContentPane().setLayout(null);
		l.add(c);
		l.add(c1);
		l.add(c2);
		r.add(r0);
		r.add(r2);
		r.add(r3);
		ca.add(e);
		ca.add(e1);
		ca.add(e2);
		final JList rezervari=new JList();
		final JList clienti=new JList();
		final JList camere=new JList();
		clienti.setBounds(130, 57, 530, 200);
		rezervari.setBounds(130, 57, 530, 200);
		camere.setBounds(130, 57, 530, 200);
		rezervari.setModel(dlm1);
		clienti.setModel(dlm);
		camere.setModel(dlm2);
		getContentPane().add(clienti);		
		getContentPane().setLayout(null);
		getContentPane().add(rezervari);		
		getContentPane().setLayout(null);
		getContentPane().add(camere);
		getContentPane().setLayout(null);
		JButton jb1=new JButton("Afisare Rezervari!");		
		JButton jb=new JButton("Afisare Clienti!");
		JButton jb2=new JButton("Afisare Camere!");
		JButton jb3=new JButton("Cauta client dupa varsta");
		JButton jb4=new JButton("Cauta rezervare dupa numar");
		JButton jb5=new JButton("Cauta camera dupa numar");
		JLabel lb=new JLabel(" Gestiune Rezervari");
		JTextField tf= new JTextField();
		JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();

		
		this.setSize(700,  500);
	    jb3.addActionListener(new ActionListener() {		
		public void actionPerformed(ActionEvent e) {
		
			String varstaDinTextField = tf.getText();
			int varsta = Integer.parseInt(varstaDinTextField);
			ArrayList<Client> listaRez = new ArrayList<Client>();
			clienti.removeAll();
			DefaultListModel dlmm = new DefaultListModel();
			for(Client c : l){
				if(c.getVarsta()==varsta){
					listaRez.add(c);
					dlmm.addElement(c);
				}
			}
			clienti.setModel(dlmm);
			tf.setText(null);

			
			
			
			
		}
	});
	    jb5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		String nrDinTextField1=tf2.getText();
				int nr1=Integer.parseInt(nrDinTextField1);
				ArrayList<Camera> listaCamere=new ArrayList<Camera>();
				camere.removeAll();
				DefaultListModel dlm6 = new DefaultListModel();
				for (Camera cam :ca){
					if(cam.getNrCamera()==nr1){
						listaCamere.add(cam);
						dlm6.addElement(cam);
						
					}
				}
					camere.setModel(dlm6);
					tf2.setText(null);

				
			}
		});
	    jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nrDinTextField=tf1.getText();
				int nr=Integer.parseInt(nrDinTextField);
				ArrayList<Rezervare> listaRezervari=new ArrayList<Rezervare>();
				rezervari.removeAll();
				DefaultListModel dlm5 = new DefaultListModel();
				for (Rezervare rez :r){
					if(rez.getNrRezervare()==nr){
						listaRezervari.add(rez);
						dlm5.addElement(rez);
						
					}
				}
				rezervari.setModel(dlm5);
				tf1.setText(null);
				
				
			}
		});
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			
				AdaugClient();
				clienti.setModel(dlm);
				
			}
		});
			jb1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				
					AdaugRezervare();
					rezervari.setModel(dlm1);
				}
			
		
				
			
		});
			jb2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
						AdaugCamera();
						camere.setModel(dlm2);
			}
			});
		jb.setBounds(6, 65, 120, 29);
		getContentPane().add(jb);
		jb1.setBounds(6,  100,  120,  29);
		getContentPane().add(jb1);
		jb2.setBounds(6,  135,  120,  29);
		getContentPane().add(jb2);
		jb3.setBounds(100,280, 200,29);
		jb4.setBounds(100,320,200,29);
		getContentPane().add(jb4);
		jb5.setBounds(100,360,200,29);
		getContentPane().add(jb5);

		getContentPane().add(jb3);
		lb.setBounds(0,0,697,36);
		
		getContentPane().add(lb);
		tf.setBounds(20,280,75,20);
		tf1.setBounds(20,320,75,20);
		tf2.setBounds(20,360,75,20);
		getContentPane().add(tf);
		getContentPane().add(tf1);
		getContentPane().add(tf2);

		
		
	}
}
