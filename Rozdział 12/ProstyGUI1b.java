import javax.swing.*;
import java.awt.event.*;

public class ProstyGUI1b implements ActionListener {
	JButton przycisk;
	
	public static void main (String[] args) {
		ProstyGUI1b apGUI = new ProstyGUI1b();
		apGUI.doDziela();
	}
	
	public void doDziela() {
		JFrame ramka = new JFrame();
		przycisk = new JButton("Klikniesz ?");
		
		przycisk.addActionListener(this);
		
		ramka.getContentPane().add(przycisk);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setSize(300,300);
		ramka.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent zdarzenie) {
		przycisk.setText("Zostalem klikniety");
	}
	}                  