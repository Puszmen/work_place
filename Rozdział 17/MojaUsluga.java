import java.rmi.*;           

public interface MojaUsluga extends Remote {    
  public String powiedzCzesc() throws RemoteException;
}
 