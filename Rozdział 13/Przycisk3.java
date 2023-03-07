import javax.swing.*;
import java.awt.*;

public class Przycisk3 {
	public static void main (String[] args) {
		
		Przycisk3 gui = new Przycisk3();
		gui.doRoboty();
	}
	
	public void doRoboty() {
		
		JFrame ramka = new JFrame();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.setBackground(Color.darkGray);
		
		JButton przycisk = new JButton("KLIK KLIK");
		JButton przycisk1 = new JButton("PYK PYK");
		JButton przycisk2 = new JButton("CYK CYK");
		panel.add(przycisk);
		panel.add(przycisk1);
		panel.add(przycisk2);
		
		ramka.getContentPane().add(BorderLayout.EAST, panel);
		
		ramka.setSize(500,500);
		ramka.setVisible(true);
		
	}
}