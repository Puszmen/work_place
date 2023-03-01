import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DwaPrzyciski {
  
  JFrame ramka;
  JLabel etykieta;

  public static void main(String[] args) {
    DwaPrzyciski gui = new DwaPrzyciski();
    gui.doRoboty();
  }

  public void doRoboty() {
    ramka = new JFrame();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton przyciskEtyk = new JButton("Zmień etykietę");
    przyciskEtyk.addActionListener(new EtykietaListener());

    JButton przyciskKolor = new JButton("Zmień kolor");
    przyciskKolor.addActionListener(new KolorListener());

    etykieta = new JLabel("Oto etykieta");
    MojPanelRysunkowy panel = new MojPanelRysunkowy();

    ramka.getContentPane().add(BorderLayout.SOUTH, przyciskKolor);
    ramka.getContentPane().add(BorderLayout.CENTER, panel);
    ramka.getContentPane().add(BorderLayout.EAST, przyciskEtyk);
    ramka.getContentPane().add(BorderLayout.WEST, etykieta);
    
    ramka.setSize(400,300);
    ramka.setVisible(true);
  }
  
  class MojPanelRysunkowy extends JPanel {
  public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    
    int czerwony = (int) (Math.random() * 255);
    int zielony = (int) (Math.random() * 255);
    int niebieski = (int) (Math.random() * 255);
    Color kolorPoczatku = new Color(czerwony,zielony,niebieski);
    
    czerwony = (int) (Math.random() * 255);
    zielony = (int) (Math.random() * 255);
    niebieski = (int) (Math.random() * 255);
    Color kolorKonca = new Color(czerwony,zielony,niebieski);

    GradientPaint gradient = new GradientPaint(70,70,kolorPoczatku, 150,150, kolorKonca);

    //g2d.setPaint(gradient);
    g2d.setColor(kolorPoczatku);
    g2d.fillOval(70,70,100,100);
  }
}
  
  
  class EtykietaListener implements ActionListener {
    public void actionPerformed(ActionEvent zdarzenie) {
      etykieta.setText("Auuuuuu!");
    }
  } // koniec klasy wewnętrznej
  
  class KolorListener implements ActionListener {
    public void actionPerformed(ActionEvent zdarzenie) {
      ramka.repaint();
    }
  } // koniec klasy wewnętrznej
}
