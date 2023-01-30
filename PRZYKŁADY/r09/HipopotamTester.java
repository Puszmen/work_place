class Zwierze {
  public Zwierze() {
    System.out.println("Tworzenie obiektu Zwierze");
  }
}

class Hipopotam extends Zwierze {
  public Hipopotam() {
    System.out.println("Tworzenie obiektu Hipopotam");
  }
} 

public class HipopotamTester {
  public static void main(String[] args) {
    System.out.println("Zaczynamy...");
    Hipopotam h = new Hipopotam();
  }
}