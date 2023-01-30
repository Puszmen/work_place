import java.util.*;
import java.io.*;

public class SzafaGrajaca1 {

  ArrayList<String> listaPiosenek = new ArrayList<String>();

  public static void main(String[] args) {
    new SzafaGrajaca1().doDziela();
  }

  public void doDziela() {
    pobierzPiosenki();
    System.out.println(listaPiosenek);

    Collections.sort(listaPiosenek);
    System.out.println(listaPiosenek);
  }

  void pobierzPiosenki() {
    try {
      File plik = new File("ListaPiosenek.txt");
      BufferedReader reader = new BufferedReader(new FileReader(plik));
      String wiersz = null;
      while ((wiersz= reader.readLine()) != null) {
        dodajPiosenke(wiersz);
      }
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void dodajPiosenke(String wierszDoAnalizy) {
    String[] elementy = wierszDoAnalizy.split("/");
    listaPiosenek.add(elementy[0]);
  }
}
