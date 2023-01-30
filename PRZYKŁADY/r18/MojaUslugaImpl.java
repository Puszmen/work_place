import java.rmi.*;
import java.rmi.server.*;       


public class MojaUslugaImpl extends UnicastRemoteObject implements MojaUsluga {

  public String powiedzCzesc() {
    return "Serwer mówi: 'Czołem!'";
  }

  public MojaUslugaImpl() throws RemoteException { } 

  public static void main(String[] args) {
    try {
      MojaUsluga usluga = new MojaUslugaImpl(); 
      Naming.rebind("Zdalne czesc", usluga);     
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
