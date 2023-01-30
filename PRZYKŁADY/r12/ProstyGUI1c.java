import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProstyGUI1c implements ActionListener{
  JFrame ramka;

  public static void main(String[] args) {
    ProstyGUI1c apGUI = new ProstyGUI1c();
    apGUI.doDziela();
  }

  public void doDziela() {
    ramka = new JFrame();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton przycisk = new JButton("Zmiana koloru");
    przycisk.addActionListener(this);
    
    MojPanelRysunkowy panelR = new MojPanelRysunkowy();

    ramka.getContentPane().add(BorderLayout.SOUTH, przycisk);
    ramka.getContentPane().add(BorderLayout.CENTER, panelR);

    ramka.setSize(300,300);
    ramka.setVisible(true);
  }

  public void actionPerformed(ActionEvent zdarzenie) {
    ramka.repaint();
  }
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
 