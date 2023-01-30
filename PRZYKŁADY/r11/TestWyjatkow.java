public class TestWyjatkow {
  public static void main(String[] args) {
    String test = "nie";
    try {
      System.out.println("Początek bloku try");
      zaryzykuj(test);
      System.out.println("Koniec bloku try");
    } catch (StrasznyWyjatek sw) {
      System.out.println("Straszny wyjątek");
    } finally {
      System.out.println("Blok finally");
    }
    System.out.println("Koniec metody main");
  }

  static void zaryzykuj(String test) throws StrasznyWyjatek {
    System.out.println("Początek ryzykownej metody");
    if ("tak".equals(test)) {
      throw new StrasznyWyjatek();
    }
    System.out.println("Koniec ryzykownej metody");
  }
}

class StrasznyWyjatek extends Exception {}