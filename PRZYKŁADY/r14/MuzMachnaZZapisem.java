// rozdział 14

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;


public class MuzMachnaZZapisem implements MetaEventListener {

      JPanel panelGlowny;
      ArrayList<JCheckBox> listaPolWyboru;
      Sequencer sekwenser;
      Sequence sekwencja;
      Sequence mojaSekwencja = null;
      Track sciezka;
      JFrame ramkaGlowna;

      String[] nazwyInstrumentow = {"Bass Drum", "Closed Hi-Hat", 
         "Open Hi-Hat","Acoustic Snare", "Crash Cymbal", "Hand Clap", 
         "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", 
         "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo", 
         "Open Hi Conga"};
      int[] instrumenty = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
    

      public static void main (String[] args) {
        new MuzMachnaZZapisem().tworzGUI();
      }

      public void tworzGUI() {
          ramkaGlowna = new JFrame("MuzMachina");
          ramkaGlowna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          BorderLayout uklad = new BorderLayout();
          JPanel panelTla = new JPanel(uklad);
          panelTla.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

          listaPolWyboru = new ArrayList<JCheckBox>();
          Box obszarPrzyciskow = new Box(BoxLayout.Y_AXIS);

          JButton start = new JButton("Start");
          start.addActionListener(new MojStartListener());
          obszarPrzyciskow.add(start);
          
          
          JButton stop = new JButton("Stop");
          stop.addActionListener(new MojStopListener());
          obszarPrzyciskow.add(stop);

          JButton tempoG = new JButton("Szybciej");
          tempoG.addActionListener(new MojTempoDListener());
          obszarPrzyciskow.add(tempoG);

          JButton tempoD = new JButton("Wolniej");
          tempoD.addActionListener(new MojTempoGListener());
          obszarPrzyciskow.add(tempoD);

          JButton zapisz = new JButton("Zapisz");  // new button
          zapisz.addActionListener(new ZapiszListener());
          obszarPrzyciskow.add(zapisz);

          JButton odtworz = new JButton("Odtworz");     // new button
          odtworz.addActionListener(new OdtworzListener());
          obszarPrzyciskow.add(odtworz);

          Box obszarNazw = new Box(BoxLayout.Y_AXIS);
          for (int i = 0; i < 16; i++) {
              obszarNazw.add(new Label(nazwyInstrumentow[i]));
          }
        
          panelTla.add(BorderLayout.EAST, obszarPrzyciskow);
          panelTla.add(BorderLayout.WEST, obszarNazw);

          ramkaGlowna.getContentPane().add(panelTla);
          
          GridLayout siatkaPolWyboru = new GridLayout(16,16);
          siatkaPolWyboru.setVgap(1);
          siatkaPolWyboru.setHgap(2);
          panelGlowny = new JPanel(siatkaPolWyboru);
          panelTla.add(BorderLayout.CENTER, panelGlowny);


          for (int i = 0; i < 256; i++) {                    
                JCheckBox c = new JCheckBox();
                c.setSelected(false);
                listaPolWyboru.add(c);
                panelGlowny.add(c);            
          } // koniec pętli 

          konfigurujMidi();

          ramkaGlowna.setBounds(50,50,300,300);
          ramkaGlowna.pack();
          ramkaGlowna.setVisible(true);
        } // koniec metody


     public void konfigurujMidi() {
       try {
        sekwenser = MidiSystem.getSequencer();
        sekwenser.open();
        sekwenser.addMetaEventListener(this);
        sekwencja = new Sequence(Sequence.PPQ,4);
        sciezka = sekwencja.createTrack();
        sekwenser.setTempoInBPM(120);
        
       } catch(Exception e) {e.printStackTrace();}
    } // koniec metody

     public class PolaWyboruListener implements ItemListener {
        public void itemStateChanged(ItemEvent ev) {      
          // można by dodać dodawania i usuwanie dźwięków w czasie rzeczywistym, 
          // choć z powodów ograniczeń czasowych pewnie nie dałoby się tego zrobić
        }
     } // koniec klasy wewnętrznej


     public void utworzSciezkeIOdtworz() {
    	  // tablica będzie zawierać instrumenty dla każdej z pionowych kolumn,
    	  // innymi słowy będą tu zapisane dane poszczególnych taktów 
    	  // (w każdym z nich może grać wiele instrumentów)
        int[] listaSciezki = null;
     
        sekwencja.deleteTrack(sciezka);
        sciezka = sekwencja.createTrack();
        

      for (int i = 0; i < 16; i++) {
         listaSciezki = new int[16];

         int klucz = instrumenty[i];

         for (int j = 0; j < 16; j++ ) {         
               JCheckBox jc = (JCheckBox) listaPolWyboru.get(j + (16*i));
               
              if ( jc.isSelected()) {
                 listaSciezki[j] = klucz;
              } else {
                 listaSciezki[j] = 0;
              }       
          } // koniec wewnętrznej pętli

       utworzSciezke(listaSciezki);
     } // koniec zewnętrznej pętli 

     sciezka.add(tworzZdarzenie(192,9,1,0,15));  
               
       try {
           
           sekwenser.setSequence(sekwencja);                    
           sekwenser.start();
       } catch(Exception e) {e.printStackTrace();}
 
      } // koniec metody
            
      public class MojStartListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
             utworzSciezkeIOdtworz();
         }
      }

    public class MojStopListener implements ActionListener {
       public void actionPerformed(ActionEvent a) {
           sekwenser.stop();
       }
    }

  public class MojTempoGListener implements ActionListener {
    public void actionPerformed(ActionEvent a) {
      float wspTempa = sekwenser.getTempoFactor();
      sekwenser.setTempoFactor((float)(wspTempa * 1.03));
    }
  } // koniec klasy wewnętrznej

  public class MojTempoDListener implements ActionListener {
    public void actionPerformed(ActionEvent a) {
      float wspTempa = sekwenser.getTempoFactor();
      sekwenser.setTempoFactor((float)(wspTempa * .97));      
    }
  } // koniec klasy wewnętrznej

  public class ZapiszListener implements ActionListener {   
    public void actionPerformed(ActionEvent a) {
      // tworzymy talbice ze stanami pól wyboru
      boolean[] stanyPol = new boolean[256];
  
      for (int i = 0; i < 256; i++) {
        JCheckBox check = (JCheckBox) listaPolWyboru.get(i);
        if (check.isSelected()) {
          stanyPol[i] = true;
        }
      }
  
      try {
        FileOutputStream strumienPlk = new FileOutputStream(
            new File("kompozycja.ser"));
        ObjectOutputStream os = new ObjectOutputStream(strumienPlk);
        os.writeObject(stanyPol);
      } catch(Exception ex) {
        ex.printStackTrace();
      }
  
    } // koniec metody
  } // koniec klasy wewnętrznej



  public class OdtworzListener implements ActionListener { 
    public void actionPerformed(ActionEvent a) {
  
      // wczytujemy liste
      boolean[] stanyPol = null;
      try {
        FileInputStream plikDanych = new FileInputStream(
            new File("kompozycja.ser"));
        ObjectInputStream is = new ObjectInputStream(plikDanych);
        stanyPol = (boolean[]) is.readObject();
  
      } catch(Exception ex) {ex.printStackTrace();}
  
      // teraz odtwarzamy sekwencje
      for (int i = 0; i < 256; i++) {
        JCheckBox pole = (JCheckBox) listaPolWyboru.get(i);
        if (stanyPol[i]) {
          pole.setSelected(true);
        } else {
          pole.setSelected(false);
        }
      } 
  
      // teraz zatrzymujemy sekwenser i uruchamiamy go ponownie
      sekwenser.stop(); 
      utworzSciezkeIOdtworz();
    } // koniec metody
  } // koniec klasy wewnętrznej

   public void utworzSciezke(int[] list) {

       for (int i = 0; i < 16; i++) {
         int key = list[i];

         if (key != 0) {
             sciezka.add(tworzZdarzenie(144,9,key, 100, i));
             sciezka.add(tworzZdarzenie(128,9,key, 100, i + 1));
         }
       }
    }

   public  MidiEvent tworzZdarzenie(int plc, int kanal, int jeden, int dwa, int takt) {
        MidiEvent zdarzenie = null;
        try {
          ShortMessage a = new ShortMessage();
          a.setMessage(plc, kanal, jeden, dwa);
          zdarzenie = new MidiEvent(a, takt);
          
          }catch(Exception e) { }
        return zdarzenie;
   }
   public void meta(MetaMessage arg0) {
   }
} // koniec klasy

