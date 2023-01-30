import java.io.*;

public class KodyTestowe {
  public static void main(String[] args) throws IOException {
    Object postac1 = null, 
           postac2 = null, 
           postac3 = null;
    
    FileOutputStream strumienPlk = new FileOutputStream("MojaGra.ser");
    
    ObjectOutputStream so = new ObjectOutputStream(strumienPlk);
    
    so.writeObject(postac1);
    so.writeObject(postac2);
    so.writeObject(postac3);
    
    so.close();
  }
}
