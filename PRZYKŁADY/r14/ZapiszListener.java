
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JCheckBox;



public class ZapiszListener implements ActionListener {

  public void actionPerformed(ActionEvent e) {
    // tworzymy tablicę ze stranami pól wyboru
    boolean[] stanyPol = new boolean[256];           

    for (int i = 0; i < 256; i++) {
      JCheckBox pole = (JCheckBox) listaPolWyboru.get(i);
      if (pole.isSelected()) {
        stanyPol[i] = true;
      }
    }

    try {
      FileOutputStream strumienPlk = new FileOutputStream( new File("kompozycja.ser"));
      ObjectOutputStream os = new ObjectOutputStream(strumienPlk);
      os.writeObject(stanyPol);
    } catch(Exception ex) {
      ex.printStackTrace(); 
    }

  } // koniec metody
} // koniec klasy
