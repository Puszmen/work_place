import java.awt.*; 

class Samochod {
  public Samochod(String n) {}
}

class Mini extends Samochod {
  Color kolor;

  public Mini() {
    this(Color.red);
  }

  public Mini(Color k) {
    super("Mini");
    kolor = k;
    // dalsza inicjalizacja
  }

  public Mini(int wielkoscM) {
    this(Color.red);
    super(wielkoscM);
  }
}
