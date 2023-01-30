import java.io.*;

public class Staw implements Serializable {
  
  private Kaczka kaczka = new Kaczka(); 
  
  public static void main(String[] args) {
    Staw mojStaw = new Staw();
    try {
      FileOutputStream fs = new FileOutputStream("staw.ser");
      ObjectOutputStream os = new ObjectOutputStream(fs);
      
      os.writeObject(mojStaw);
      os.close();
    } catch (Exception ex) {
      ex.printStackTrace(); 
    }
  }
}

class Kaczka {
	// tu znajduje się kod
  // klasy Kaczka
}