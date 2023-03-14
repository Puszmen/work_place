import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class KartaKwizowaEdytor {
	
	private JTextArea pytanie;
	private JTextArea odpowiedz;
	private ArrayList <KartaKwizowa> listaKart;
	private JFrame ramka;
	
	public static void main(String[] args) {
		KartaKwizowaEdytor edytor = new KartaKwizowaEdytor();
		edytor.doDziela();
	}
	
	public void doDziela() {
		
		ramka = new JFrame("Edytor kart kwizowych");
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelGlowny = new JPanel();
		Font czczionkaDuza = new Font("sanserif", Font.BOLD, 24);
		pytanie = new JTextArea(6,20);
		pytanie.setLineWrap(true);
		pytanie.setWrapStyleWord(true);
		pytanie.setFont(czczionkaDuza);
		
		JScrollPane przewijaniePyt = new JScrollPane(pytanie);
		przewijaniePyt.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijaniePyt.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		odpowiedz = new JTextArea(6,20);
		odpowiedz.setLineWrap(true);
		odpowiedz.setWrapStyleWord(true);
		odpowiedz.setFont(czczionkaDuza);
		
		JScrollPane przewijanieOdp = new JScrollPane(odpowiedz);
		przewijanieOdp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanieOdp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton przyciskNastepna = new JButton("Nastepna karta");
		
		listaKart = new ArrayList<KartaKwizowa>();
		
		JLabel etykietaPyt = new JLabel("Pytanie:");
		JLabel etykietaOdp = new JLabel("Odpowiedz:");
		
		panelGlowny.add(etykietaPyt);
		panelGlowny.add(przewijaniePyt);
		panelGlowny.add(etykietaOdp);
		panelGlowny.add(przewijanieOdp);
		panelGlowny.add(przyciskNastepna);
		przyciskNastepna.addActionListener(new NastepnaKartaListener());
		JMenuBar menu = new JMenuBar();
		JMenu menuPlik = new JMenu("Plik");
		JMenuItem opcjaNowa = new JMenuItem("Nowy");
		JMenuItem opacjaZapisz = new JMenuItem("Zapisz");
		opcjaNowa.addActionListener(new NowyMenuListener());
		
		opacjaZapisz.addActionListener(new ZapiszMenuListener());
		menuPlik.add(opcjaNowa);
		menuPlik.add(opacjaZapisz);
		menu.add(menuPlik);
		ramka.setJMenuBar(menu);
		ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
		ramka.setSize(500,600);
		ramka.setVisible(true);
	}
	
	public class NastepnaKartaListener implements ActionListener {
		public void actionPerformed(ActionEvent zd) {
			KartaKwizowa karta = new KartaKwizowa(pytanie.getText(), odpowiedz.getText());
			listaKart.add(karta);
			czyscKarte();
		}
	}
	
	public class ZapiszMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent zd) {
			KartaKwizowa karta = new KartaKwizowa(pytanie.getText(), odpowiedz.getText());
			listaKart.add(karta);
			
			JFileChooser plikDanych = new JFileChooser();
			plikDanych.showSaveDialog(ramka);
			zapiszPlik(plikDanych.getSelectedFile());
		}
	}
	
	public class NowyMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent zd) {
			listaKart.clear();
			czyscKarte();
		}
	}
	
	
	private void czyscKarte() {
		pytanie.setText("");
		odpowiedz.setText("");
		pytanie.requestFocus();
	}
	
	private void zapiszPlik(File plik) {
		try {
			BufferedWriter pisarz = new BufferedWriter(new FileWriter(plik));
			
			for (KartaKwizowa karta : listaKart) {
				pisarz.write(karta.getPytanie() + "/");
			    pisarz.write(karta.getOdpowiedz() + "\n");
			}
			pisarz.close();
		} catch (IOException ex) {
			System.out.println("Nie mozna zapisac pliku kart !!");
			ex.printStackTrace();
		}
	}
}