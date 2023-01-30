import java.io.*;

class GraPrzygotowa implements Serializable {
	public int x = 3;
  transient long y = 4;
  private short z = 5;
  
  int getX() { 
    return x; 
  }
  
  long getY() {
    return y; 
  }
  
  short getZ() {
    return z; 
  }
}

public class GraPrzygotowaTester {
  public static void main(String[] args) {
    GraPrzygotowa g = new GraPrzygotowa();
    System.out.println(g.getX() + g.getY() + g.getZ());
    try {
      FileOutputStream fos = new FileOutputStream("gra.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(g);
      oos.close();
      FileInputStream fis = new FileInputStream("gra.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      g = (GraPrzygotowa) ois.readObject();
      ois.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(g.getX() + g.getY() + g.getZ());
  }
}
