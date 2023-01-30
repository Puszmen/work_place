class PawZewnetrzny {	
  static class LewWewnetrzny {
    void wypowiedz() {
      System.out.println("Metoda statycznej klasy wewnętrznej.");
    }
  }
}

class Test {
  public static void main (String[] args) {	
    PawZewnetrzny.LewWewnetrzny tmp = new PawZewnetrzny.LewWewnetrzny();
    tmp.wypowiedz();
  }
}

