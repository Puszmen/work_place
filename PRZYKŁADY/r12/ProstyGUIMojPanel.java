import javax.swing.*;

public class ProstyGUIMojPanel {
  public static void main(String[] args) {
    JFrame ramka = new JFrame();
    JPanel p = new MojPanelGradient2();
    //JPanel p = new MojPanelGraficzny2();
    
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ramka.getContentPane().add(p);
    ramka.setSize(300,300);
    ramka.setVisible(true);
  }
}