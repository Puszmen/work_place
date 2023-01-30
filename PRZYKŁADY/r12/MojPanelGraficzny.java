import java.awt.*;
import javax.swing.*;

class MojPanelGraficzny extends JPanel {
  public void paintComponent(Graphics g) {
    g.setColor(Color.white);
    g.setColor(Color.black);
    g.fillRect(0,0, this.getWidth(), this.getHeight());
    g.setColor(Color.orange);
    //g.fillRect(20,50,100,100);
  }
}


class MojPanelGraficzny2 extends JPanel {
  public void paintComponent(Graphics g) {
    g.fillRect(0,0,this.getWidth(),this.getHeight());   
                   
    int czerwony = (int) (Math.random() * 255);
    int zielony = (int) (Math.random() * 255);
    int niebieski = (int) (Math.random() * 255);
 
    Color kolorLosowy = new Color(czerwony, zielony, niebieski); 
    g.setColor(kolorLosowy);
    g.fillOval(70,70,100,100);          
  }
 
  
}


class MojPanelGradient extends JPanel {
  public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    GradientPaint gradient = new GradientPaint(70,70,Color.blue, 150,150, Color.orange);

    g2d.setPaint(gradient);
    g2d.fillOval(70,70,100,100);
  }
}

class MojPanelGradient2 extends JPanel {
  public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(Color.white);
    g2d.fillRect(0,0, this.getWidth(), this.getHeight());
    
    int czerwony = (int) (Math.random() * 255);
    int zielony = (int) (Math.random() * 255);
    int niebieski = (int) (Math.random() * 255);
    Color kolorPoczatku = new Color(czerwony,zielony,niebieski);
    
    czerwony = (int) (Math.random() * 255);
    zielony = (int) (Math.random() * 255);
    niebieski = (int) (Math.random() * 255);
    Color kolorKonca = new Color(czerwony,zielony,niebieski);

    GradientPaint gradient = new GradientPaint(70,70,kolorPoczatku, 150,150, kolorKonca);

    g2d.setPaint(gradient);
    g2d.fillOval(70,70,100,100);
  }
}
 