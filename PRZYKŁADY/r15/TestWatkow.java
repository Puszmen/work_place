public class TestWatkow {
  public static void main(String[] args) {
    WatekPierwszy w1 = new WatekPierwszy();
    WatekDrugi w2 = new WatekDrugi();
    Thread pierwszy = new Thread(w1);
    Thread drugi = new Thread(w2);
    pierwszy.start();
    drugi.start();
  }
}

class Sumator {
  private static Sumator s = new Sumator();		
  private int licznik = 0;

  private Sumator() {}				

  public static Sumator getSumator() {
    return s;
  }

  public void aktualizujLicznik(int wart) {
    licznik += wart;
  }

  public int getLicznik() {
    return licznik;
  }
}

class WatekPierwszy implements Runnable {
  Sumator s = Sumator.getSumator();
  public void run() {
    for (int x=0; x < 98; x++) {
      s.aktualizujLicznik(1000);
      try {
        Thread.sleep(50);
      } catch (InterruptedException ex) {}
    }
    System.out.println("Pierwszy - " + s.getLicznik());
  }
}


class WatekDrugi implements Runnable {
  Sumator s = Sumator.getSumator();
  public void run() {
    for (int x=0; x < 99; x++) {
      s.aktualizujLicznik(1);
      try {
        Thread.sleep(50);
      } catch (InterruptedException ex) {}
    }
    System.out.println("Drugi - " +
    s.getLicznik());
  }
}

