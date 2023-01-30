import java.util.*;

public class TestTypowOgolnych1 {
  public static void main(String[] args) {
    new TestTypowOgolnych1().doDziela();
  }

  public void doDziela() {
    Zwierze[] zwierzeta = {new Pies(), new Kot(), new Pies()};
    Pies[] psy = {new Pies(), new Pies(), new Pies()};
    nakarmZwierzeta(zwierzeta);
    nakarmZwierzeta(psy);
  }

  public void nakarmZwierzeta(Zwierze[] zwierzeta) {
    for(Zwierze z: zwierzeta) {
      z.jedz();
    }
  }

}


// ------------------------------------
abstract class Zwierze {
  void jedz() {
    System.out.println("zwierz wcina");
  }
}

class Pies extends Zwierze {
  void szczekaj() { }
}

class Kot extends Zwierze {
  void mialcz() { }
}
