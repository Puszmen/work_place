import javax.sound.midi.*;

public class MuzaTester1 {

public void graj() {

try {
Sequencer sekwenser = MidiSystem.getSequencer();
System.out.println("Mamy sekwenser !!");

} catch (MidiUnavailableException ex) {
System.out.println("SOS masz problem !!");
}
} // koniec metody graj

public static void main (String[] args) {
MuzaTester1 mt = new MuzaTester1();

mt.graj();

} // koniec main
} // koniec MuzaTester1