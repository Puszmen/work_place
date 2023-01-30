import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProstyKlientPogawedekA {
    
  JTextField wiadomosc;   
  PrintWriter pisarz;
  Socket gniazdo;

  public static void main(String[] args) {
    ProstyKlientPogawedekA klient = new ProstyKlientPogawedekA();
    klient.doDziela();
  }

  public void doDziela() {
    JFrame ramka = new JFrame("Śmiesznie prosty klient pogawędek");
    JPanel panelGlowny = new JPanel();
    
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    wiadomosc = new JTextField(20);
 
    JButton przyciskWyslij = new JButton("Wyślij");
    przyciskWyslij.addActionListener(new PrzyciskWyslijListener());
   
    
    panelGlowny.add(wiadomosc);
    panelGlowny.add(przyciskWyslij);
    
    konfigurujKomunikacje();
      
    ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
    ramka.setSize(400,90);
    ramka.setVisible(true);                
  } // koniec metody

  private void konfigurujKomunikacje() {  
    try {
      gniazdo = new Socket("127.0.0.1", 5000);
      
      pisarz = new PrintWriter(gniazdo.getOutputStream());
      
      System.out.println("obsługa sieci gotowa do użycia");
    } catch(IOException ex) {
      ex.printStackTrace();
    }
  } // koniec metody   

  public class PrzyciskWyslijListener implements ActionListener {
    public void actionPerformed(ActionEvent ev) {
      try {
        pisarz.println(wiadomosc.getText());
        pisarz.flush();
           
      } catch(Exception ex) {
         ex.printStackTrace();
      }
      wiadomosc.setText("");
      wiadomosc.requestFocus();
    }
 
  }  // koniec klasy wewnętrznej
}