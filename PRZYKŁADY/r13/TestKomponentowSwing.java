import javax.swing.*;

public class TestKomponentowSwing { 
  
  public static void main(String[] args) {
    TestKomponentowSwing gui = new TestKomponentowSwing();
    gui.tworzGUI();
  }

  public void tworzGUI() {
    JFrame ramka = new JFrame();
    JPanel panel = new JPanel();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    String[] listaOpcji = {"alfa", "beta", "gama", "delta", "epsilon", "zeta", "eta", "teta"};
    
    JList lista = new JList(listaOpcji);
    lista.setVisibleRowCount(6);
    
    JScrollPane przewijanie = new JScrollPane(lista);
    przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    
    panel.add(przewijanie);
    
    //panel.add(lista);
    
    ramka.getContentPane().add(panel);
    ramka.setSize(150,300);
    ramka.setVisible(true);
  }

  public void tworzGUI3() {
    JFrame ramka = new JFrame();
    JPanel panel = new JPanel();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JCheckBox poleW = new JCheckBox("Grasz dalej?"); 
    
    panel.add(poleW);
    
    ramka.getContentPane().add(panel);
    ramka.setSize(100,100);
    ramka.setVisible(true);
  }

  public void tworzGUI2() {
    JFrame ramka = new JFrame();
    JPanel panel = new JPanel();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JTextArea tekst = new JTextArea(10,20);
    tekst.setLineWrap(true);
    
    JScrollPane przewijanie = new JScrollPane(tekst);
    przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    
    panel.add(przewijanie);
    
    ramka.getContentPane().add(panel);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
  
  public void tworzGUI1() {
    JFrame ramka = new JFrame();
    JPanel panel = new JPanel();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JTextField pole2 = new JTextField(20);
    JLabel pole1 = new JLabel("Podaj nazwisko");
    
    panel.add(pole1);
    panel.add(pole2);
    
    ramka.getContentPane().add(panel);
    ramka.setSize(200,200);
    ramka.setVisible(true);
  }
  
  
   
  
}