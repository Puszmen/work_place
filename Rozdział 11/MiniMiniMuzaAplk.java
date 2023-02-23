import javax.sound.midi.*;

public class MiniMiniMuzaAplk {

public static void main (String[] args) {

MiniMiniMuzaAplk mini = new MiniMiniMuzaAplk();
mini.graj();
}

public void graj() {
try {

Sequencer sekwenser = MidiSystem.getSequencer();
sekwenser.open();

Sequence sekw = new Sequence(Sequence.PPQ, 4);

Track sciezka = sekw.createTrack();

ShortMessage a = new ShortMessage();
a.setMessage(144, 1, 20, 100);
MidiEvent nutaP = new MidiEvent(a, 1);
sciezka.add(nutaP);

ShortMessage b = new ShortMessage();
b.setMessage(128, 1, 44, 100);
MidiEvent nutaK = new MidiEvent(b, 120);
sciezka.add(nutaK);

sekwenser.setSequence(sekw);

sekwenser.start();

} catch (Exception ex) {ex.printStackTrace();}
}
}