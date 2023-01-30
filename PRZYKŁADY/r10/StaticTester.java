class StaticSuper { 
  static {
    System.out.println("Blok bazowego inicjalizatora statycznego");
  }

  StaticSuper() {
    System.out.println("Konstruktor bazowy");
  }
}


public class StaticTester extends StaticSuper {
  static int rnd;

  static {
    rnd = (int) (Math.random() * 6);
    System.out.println("Blok inicjalizatora statycznego " + rnd);
  }
  
  StaticTester() {
    System.out.println("Konstruktor");
  }

  public static void main(String[] args) {
    System.out.println("Metoda main");
    StaticTester st = new StaticTester();
  }
}