import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PoleTekstoweWW1 implements ActionListener {
	
	JTextArea tekst;
	
	public static void main (String[] args) {
		
		PoleTekstoweWW1 gui = new PoleTekstoweWW1();
		gui.tworzGUI();
	}
	
	public void tworzGUI() {
		JFrame ramka = new JFrame();
		JPanel panel = new JPanel();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton przycisk = new JButton("Kliknij mnie");
		
		przycisk.addActionListener(this);
		tekst = new JTextArea(10,20);
		tekst.setLineWrap(true);
		
		JScrollPane przewijanie = new JScrollPane(tekst);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(przewijanie);
		
		ramka.getContentPane().add(BorderLayout.CENTER, panel);
		ramka.getContentPane().add(BorderLayout.SOUTH, przycisk);
		
		ramka.setSize(450,400);
		ramka.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent zdarzenie) {
      tekst.append("przycisk klikniety \n");
}
}