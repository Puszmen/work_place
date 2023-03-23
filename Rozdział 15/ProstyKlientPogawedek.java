import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProstyKlientPogawedek {
	
	JTextArea odebraneWiadomosci;
	JTextField wiadomosc;
	BufferedReader czytelnik;
	PrintWriter pisarz;
	Socket gniazdo;
	
	public static void main(String[] args) {
		
		ProstyKlientPogawedek klient = new ProstyKlientPogawedek();
			
			klient.doRoboty();
		}
		
		public void doRoboty() {
			JFrame ramka = new JFrame("Smiesznie prosty program pogawedek");
			JPanel panelGlowny = new JPanel();
			
			odebraneWiadomosci = new JTextArea(15,50);
			odebraneWiadomosci.setLineWrap(true);
			odebraneWiadomosci.setWrapStyleWord(true);
			odebraneWiadomosci.setEditable(false);
			
			JScrollPane przewijanie = new JScrollPane(odebraneWiadomosci);
			przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			
			wiadomosc = new JTextField(20);
			
			JButton przyciskWyslij = new JButton("Wyslij");
			przyciskWyslij.addActionListener(new PrzyciskWyslijListener());
			
			panelGlowny.add(przewijanie);
			panelGlowny.add(wiadomosc);
			panelGlowny.add(przyciskWyslij);
			
			konfigurujKomunikacje();
			
			Thread watekOdbiorcy = new Thread(new OdbiorcaKomunikatow());
			watekOdbiorcy.start();
			
			ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
			ramka.setSize(400,500);
			ramka.setVisible(true);
		}
		
		private void konfigurujKomunikacje() {
			try {
				gniazdo = new Socket("127.0.0.1", 5000);
				InputStreamReader czytelnikStrm = new InputStreamReader(gniazdo.getInputStream());
				czytelnik = new BufferedReader(czytelnikStrm);
				pisarz = new PrintWriter(gniazdo.getOutputStream());
				System.out.println("obsluga sieci przygotowana");
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		public class PrzyciskWyslijListener implements ActionListener {
			public void actionPerformed(ActionEvent ev) {
				try {
					pisarz.println(wiadomosc.getText());
					pisarz.flush();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				wiadomosc.setText("");
				wiadomosc.requestFocus();
			}
		}
		
		public class OdbiorcaKomunikatow implements Runnable {
			public void run() {
				String wiadom;
				try {
					while ((wiadom = czytelnik.readLine()) != null) {
						System.out.println("odczytano: " + wiadom);
					odebraneWiadomosci.append(wiadom + "\n");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}