import java.awt.*;
import javax.swing.*;

public class KtoryToUklad {
  
  public static void main(String[] args) {
    KtoryToUklad gui = new KtoryToUklad();
    gui.tworzGUI_F();
  }

	public void tworzGUI_D() {
	  JFrame ramka = new JFrame();
	  JPanel panel = new JPanel();
	  panel.setBackground(Color.darkGray);
	  JButton przycisk = new JButton("tesuji");
	  JButton przycisk2 = new JButton("watari");
	  ramka.getContentPane().add(BorderLayout.NORTH, panel);
	  panel.add(przycisk2);
	  ramka.getContentPane().add(BorderLayout.CENTER, przycisk);
	  
	  
	  ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  ramka.setSize(400,300);
	  ramka.setVisible(true);
	}
	
	public void tworzGUI_B() {
	  JFrame ramka = new JFrame();
	  JPanel panel = new JPanel();
	  panel.setBackground(Color.darkGray);
	  JButton przycisk = new JButton("tesuji");
	  JButton przycisk2 = new JButton("watari");
	  panel.add(przycisk2);
	  ramka.getContentPane().add(BorderLayout.CENTER, przycisk);
	  ramka.getContentPane().add(BorderLayout.EAST, panel);
	  
	  
	  ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  ramka.setSize(400,300);
	  ramka.setVisible(true);
	}
	 
	public void tworzGUI_C() {
	  JFrame ramka = new JFrame();
	  JPanel panel = new JPanel();
	  panel.setBackground(Color.darkGray);
	  JButton przycisk = new JButton("tesuji");
	  JButton przycisk2 = new JButton("watari");
	  panel.add(przycisk2);
	  ramka.getContentPane().add(BorderLayout.CENTER, przycisk);
	  
	  ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  ramka.setSize(400,300);
	  ramka.setVisible(true);
	}
	
	public void tworzGUI_A() {
	  JFrame ramka = new JFrame();
	  JPanel panel = new JPanel();
	  panel.setBackground(Color.darkGray);
	  JButton przycisk = new JButton("tesuji");
	  JButton przycisk2 = new JButton("watari");
	  panel.add(przycisk);
	  ramka.getContentPane().add(BorderLayout.NORTH, przycisk2);
	  ramka.getContentPane().add(BorderLayout.EAST, panel);
	  
	  
	  ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  ramka.setSize(400,300);
	  ramka.setVisible(true);
	}
	
	public void tworzGUI_E() {
	  JFrame ramka = new JFrame();
	  JPanel panel = new JPanel();
	  panel.setBackground(Color.darkGray);
	  JButton przycisk = new JButton("tesuji");
	  JButton przycisk2 = new JButton("watari");
	  ramka.getContentPane().add(BorderLayout.SOUTH, panel);
	  panel.add(przycisk2);
	  ramka.getContentPane().add(BorderLayout.NORTH, przycisk);
	  
	  
	  ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  ramka.setSize(400,300);
	  ramka.setVisible(true);
	}
	
	public void tworzGUI_F() {
	  JFrame ramka = new JFrame();
	  JPanel panel = new JPanel();
	  JPanel p2 = new JPanel();
	  JPanel p3 = new JPanel();
	  JPanel p4 = new JPanel();
	  
	  panel.setBackground(Color.darkGray);
	  p2.setBackground(Color.darkGray);
	  p3.setBackground(Color.darkGray);
	  p4.setBackground(Color.darkGray);
	  
	  JButton przycisk = new JButton("tesuji");
	  JButton przycisk2 = new JButton("watari");
	  panel.add(przycisk2);
	  ramka.getContentPane().add(BorderLayout.NORTH, panel);
	  ramka.getContentPane().add(BorderLayout.SOUTH, przycisk);
	  ramka.getContentPane().add(BorderLayout.EAST, p2);
	  ramka.getContentPane().add(BorderLayout.CENTER, p3);
	  ramka.getContentPane().add(BorderLayout.WEST, p4);
	  
	  ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  ramka.setSize(400,300);
	  ramka.setVisible(true);
	}

}