import java.util.*;
import java.io.*;

public class SzafaGrajaca8 {

  ArrayList<Piosenka> listaPiosenek = new ArrayList<Piosenka>();

  public static void main(String[] args) {
    new SzafaGrajaca8().doDziela();
  }

  public void doDziela() {
    pobierzPiosenki();
    System.out.print(listaPiosenek);
    Collections.sort(listaPiosenek);
    System.out.println(listaPiosenek);

    TreeSet<Piosenka> zbiorPiosenek = new TreeSet<Piosenka>();
    zbiorPiosenek.addAll(listaPiosenek);
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
    Piosenka nastepnaPiosenka = new Piosenka(elementy[0], elementy[1], elementy[2], elementy[3]);
    listaPiosenek.add(nastepnaPiosenka);
  }
}
