import java.io.*;
import java.net.*;

public class CodziennePoradySerwer {

  String[] listaPorad = {"Używaj mniejszych bitów", "Chodź w dopasowanych spodniach. Nie, te nie sprawiają, że wyglądasz grubo.", "Jedno słowo: nieodpowiednie", "Tylko dziś - bądź uczciwy. Powiedz swojemu szefowi co *naprawdę* czujesz", "Może chcesz zastanowić się na swoja fryzurą."};

  public static void main(String[] args) {
    CodziennePoradySerwer serwer = new CodziennePoradySerwer();
    serwer.doDziela();
  }

  public void doDziela() {
    try {
      ServerSocket gniazdoSrw = new ServerSocket(4242);
       
      while(true) {
        Socket gniazdo = gniazdoSrw.accept();
          
        PrintWriter pisarz = new PrintWriter(gniazdo.getOutputStream());
        String porada = wybierzPorade();
        pisarz.println(porada);              
        pisarz.close();  

        System.out.println(porada);
      }
    } catch(IOException ex) {
      ex.printStackTrace();
    }
  } // koniec metody

  private String wybierzPorade() {
    int random = (int) (Math.random() * listaPorad.length);
    return listaPorad[random];
  }         
}