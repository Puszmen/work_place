import javax.swing.*;
import java.awt.*;  // klasa BorderLayout należy to teo pakietu

public class Przycisk1 {
	public static void main (String[] args) {
		Przycisk1 gui = new Przycisk1();
		gui.doRoboty();
	}
		public void doRoboty() {
			
			JFrame ramka = new JFrame();
			ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton przycisk = new JButton("PYK PYK KLIK KLIK");
			Font duzaCzcionka = new Font("serif", Font.BOLD, 28);
			przycisk.setFont(duzaCzcionka);
			ramka.getContentPane().add(BorderLayout.NORTH, przycisk);
			
			ramka.setSize(500,500);
			ramka.setVisible(true);
			
		}
	}
