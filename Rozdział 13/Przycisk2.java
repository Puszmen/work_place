import javax.swing.*;
import java.awt.*;  // klasa BorderLayout należy to teo pakietu

public class Przycisk2 {
	public static void main (String[] args) {
		Przycisk2 gui = new Przycisk2();
		gui.doRoboty();
	}
		public void doRoboty() {
			
			JFrame ramka = new JFrame();
			ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton przyciskP = new JButton("Połnoc");
			JButton przyciskW = new JButton("Wschod");
			JButton przyciskPP = new JButton("Poludnie");
			JButton przyciskZ = new JButton("Zachod");
			JButton przyciskC = new JButton("Centrum");
			
			ramka.getContentPane().add(BorderLayout.NORTH, przyciskP);
			ramka.getContentPane().add(BorderLayout.EAST, przyciskW);
			ramka.getContentPane().add(BorderLayout.SOUTH, przyciskPP);
			ramka.getContentPane().add(BorderLayout.WEST, przyciskZ);
			ramka.getContentPane().add(BorderLayout.CENTER, przyciskC);
			
			ramka.setSize(500,500);
			ramka.setVisible(true);
			
		}
	}