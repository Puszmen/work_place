import javax.swing.*;
import java.awt.*;

public class ProstaAnimacja {
	
	int x = 70;
	int y = 70;
	
	public static void main (String[] args) {
		
		ProstaAnimacja gui = new ProstaAnimacja();
		gui.doRoboty();
	}
	
	public void doRoboty() {
		
		JFrame ramka = new JFrame();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MojPanelRysunkowy panel = new MojPanelRysunkowy();
		
		ramka.getContentPane().add(panel);
		ramka.setSize(500,500);
		ramka.setVisible(true);
		
		for (int i = 0; i < 300; i++) {
			
			x++;
			y++;
			
			panel.repaint();
			
			try {
				Thread.sleep(2);
			} catch (Exception ex) {}
		}
	}
	
	class MojPanelRysunkowy extends JPanel {
		public void paintComponent (Graphics g) {
			
			g.setColor(Color.black);
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			
		g.setColor(Color.red);
		g.fillOval(x,y,80,80);
		}
	}
}