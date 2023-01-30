import java.rmi.*;
import java.util.*;
import java.rmi.server.*;


public class SerwerUslugImpl extends UnicastRemoteObject implements SerwerUslug  {

  HashMap listaUslug;

  public SerwerUslugImpl() throws RemoteException {
    // uruchomienie i konfiguracja usług 
    konfigurujUslugi();
  }

  private void konfigurujUslugi() {
    listaUslug = new HashMap();
    listaUslug.put("Usługa gry w kości", new GraWKosciUsluga());
    listaUslug.put("Usługa dnia tygodnia", new DzienTygodniaUsluga());
    listaUslug.put("Usługa wizualizacji muzyki", new MiniMuzykaUsluga());
  }

  public Object[] pobierzListeUslug() {
    System.out.println("zdalne");
    return listaUslug.keySet().toArray();
  }

  public Usluga pobierzUsluge(Object kluczUsl) throws RemoteException {        
    Usluga usluga = (Usluga) listaUslug.get(kluczUsl);       
    return usluga;
  }

  public static void main (String[] args) {
    try {
      Naming.rebind("SerwerUslug", new SerwerUslugImpl());
    } catch(Exception ex) { }
    System.out.println("Zdalna usługa uruchomiona");
  }
}
