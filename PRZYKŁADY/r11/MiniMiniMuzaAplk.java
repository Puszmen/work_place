import javax.sound.midi.*;


public class MiniMiniMuzaAplk {   // pierwsza aplikacja
       
  public static void main(String[] args) {
    MiniMiniMuzaAplk mini = new MiniMiniMuzaAplk();
    mini.graj();
  }

  public void graj() {

    try {

      // tworzymy (i otwieramy) obiekt Sequencer, tworzymy
      // obiekty Sequence oraz Track

      Sequencer sekwenser = MidiSystem.getSequencer();         
      sekwenser.open();
        
      Sequence sekw = new Sequence(Sequence.PPQ, 4);
      Track sciezka = sekw.createTrack();     

      // tworzymy dwa obiekty zdarzeń midi (zawierające 
      // komunikaty midi)
      MidiEvent zdarzenie = null;
      
      // najpierw tworzymy komunikat
      // następnie wstawiamy go do zdarzenia midi
      // po czym dodajemy zdarzenie do obiektu Track (ścieżki)

      ShortMessage a = new ShortMessage();
      a.setMessage(144, 1, 44, 100);
      MidiEvent nutaP = new MidiEvent(a, 1); 
      sciezka.add(nutaP);

      ShortMessage b = new ShortMessage();
      b.setMessage(128, 1, 44, 100);
      MidiEvent nutaK = new MidiEvent(b, 16); 
      sciezka.add(nutaK);
        
      // zdarzenia są dodane do ścieżki
            
      // dodajemy ścieżkę do sekwensera (obiektu Sequencer) i uruchamiamy go
      sekwenser.setSequence(sekw);

      sekwenser.start();
    } catch (Exception ex) {ex.printStackTrace();}
  } // koniec graj

} // koniec klasy