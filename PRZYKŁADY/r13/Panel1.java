import javax.swing.*;
import java.awt.*;

public class Panel1 {
  
  public static void main(String[] args) {
    Panel1 gui = new Panel1();
    gui.doRoboty();
  }

public void doRoboty() {
  JFrame ramka = new JFrame();
  JPanel panel = new JPanel();
  ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  panel.setLayout( new BoxLayout(panel, BoxLayout.Y_AXIS));
  
  panel.setBackground(Color.darkGray);
  JButton przycisk = new JButton("To szok!");
  JButton przycisk2 = new JButton("Trach!");
  panel.add(przycisk);
  panel.add(przycisk2);
  ramka.getContentPane().add(BorderLayout.EAST, panel);
  ramka.setSize(200,200);
  ramka.setVisible(true);
}
  
  
  public void doRoboty2() {
    JFrame ramka = new JFrame();
    JPanel panel = new JPanel();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel.setBackground(Color.darkGray);
    
    JButton przycisk = new JButton("To szok!");
    JButton przycisk2 = new JButton("Trach!");
    
    panel.add(przycisk);
    panel.add(przycisk2);
    
    ramka.getContentPane().add(BorderLayout.EAST, panel);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
  
  public void doRoboty1() {
    JFrame ramka = new JFrame();
    JPanel panel = new JPanel();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel.setBackground(Color.darkGray);
    
    JButton przycisk = new JButton("To szok!");
    
    panel.add(przycisk);
    ramka.getContentPane().add(BorderLayout.EAST, panel);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
  
  public void doRoboty0() {
    JFrame ramka = new JFrame();
    JPanel panel = new JPanel();
    
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel.setBackground(Color.darkGray);
    ramka.getContentPane().add(BorderLayout.EAST, panel);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
}
