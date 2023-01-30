import java.rmi.*;

public class MojaUslugaKlient {
  public static void main(String[] args) {
    new MojaUslugaKlient().doRoboty();
  }
  
  public void doRoboty() {
    try {
      MojaUsluga usluga = (MojaUsluga) Naming.lookup("rmi://127.0.0.1/Zdalne czesc");
      String s = usluga.powiedzCzesc();
      
      System.out.println(s);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
