import java.awt.*;
import javax.swing.*;
import java.rmi.*;
import java.awt.event.*;

public class PrzegladarkaUslug {

  JPanel panelGlowny;
  JComboBox listaUslug;
  SerwerUslug serwer;

  public void tworzGUI() {
    JFrame ramka = new JFrame("Przegl�darka RMI");
    panelGlowny = new JPanel();
    ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
    
    Object[] uslugi = getServicesList();

    listaUslug = new JComboBox(uslugi);
    ramka.getContentPane().add(BorderLayout.NORTH, listaUslug);

    listaUslug.addActionListener(new ListaUslugListener());     

    ramka.setSize(500,500);
    ramka.setVisible(true);
  }

  void wczytajUsluge(Object wybranaUsl) {
    try {
      Usluga svc = serwer.pobierzUsluge(wybranaUsl);
      
      panelGlowny.removeAll();
      panelGlowny.add(svc.pobierzPanelGUI());
      panelGlowny.validate();
      panelGlowny.repaint();
    } catch(Exception ex) {
       ex.printStackTrace();
    }
  }

  Object[] getServicesList() {
      
    Object obj = null;
    Object[] services = null;

    try {
      obj = Naming.lookup("rmi://127.0.0.1/SerwerUslug");
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
    serwer = (SerwerUslug) obj;
    
    try {
      services = serwer.pobierzListeUslug();
    } catch(Exception ex) {
      ex.printStackTrace();
    }
    return services;
  }

  class ListaUslugListener implements ActionListener {
    public void actionPerformed(ActionEvent ev) { 
      // pobranie wybranej usługi
      Object selection =  listaUslug.getSelectedItem();
      wczytajUsluge(selection);
    }
  }

  public static void main(String[] args) {
     new PrzegladarkaUslug().tworzGUI();
  }
}
     


    
      