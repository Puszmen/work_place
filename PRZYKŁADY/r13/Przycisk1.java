import javax.swing.*;
import java.awt.*;

public class Przycisk1 {
  public static void main(String[] args) {
	Przycisk1 gui = new Przycisk1();
    gui.doRoboty();
  }
  
  public void doRoboty0() {
    JFrame ramka = new JFrame();
    JButton przycisk = new JButton("Kliknij mnie");
    ramka.getContentPane().add(BorderLayout.EAST, przycisk);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
  
  public void doRoboty1() {
    JFrame ramka = new JFrame();
    JButton przycisk = new JButton("Kliknij mnie jeśli chcesz");
    ramka.getContentPane().add(BorderLayout.EAST, przycisk);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
  
  public void doRoboty2() {
  	JFrame ramka = new JFrame();
    JButton przycisk = new JButton("Nie ma, nie ma wody na...");
    ramka.getContentPane().add(BorderLayout.NORTH, przycisk);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
  
  public void doRoboty3() {
    JFrame ramka = new JFrame();
    JButton przycisk = new JButton("Kliknij TU!");
    Font duzaCzcionka = new Font("serif", Font.BOLD, 28);
    przycisk.setFont(duzaCzcionka);
    ramka.getContentPane().add(BorderLayout.NORTH, przycisk);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
  
  public void doRoboty() {
    JFrame ramka = new JFrame();
    
    JButton przyciskW = new JButton("Wschód");
    JButton przyciskZ = new JButton("Zachód");
    JButton przyciskPn = new JButton("Północ");
    JButton przyciskPd = new JButton("Południe");
    JButton przyciskC = new JButton("Centrum");
    
    ramka.getContentPane().add(BorderLayout.EAST , przyciskW);
    ramka.getContentPane().add(BorderLayout.WEST , przyciskZ);
    ramka.getContentPane().add(BorderLayout.NORTH , przyciskPn);
    ramka.getContentPane().add(BorderLayout.SOUTH , przyciskPd);
    ramka.getContentPane().add(BorderLayout.CENTER , przyciskC);
    
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ramka.setSize(300,300);
    ramka.setVisible(true);
  }
}
