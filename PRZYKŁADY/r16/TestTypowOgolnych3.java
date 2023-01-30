import java.util.*;

public class TestTypowOgolnych3 {
  public static void main(String[] args) {
    new TestTypowOgolnych3().doDziela();
  }

  public void doDziela() {
    ArrayList<Zwierze> zwierzeta = new ArrayList<Zwierze>();
    zwierzeta.add(new Pies());
    zwierzeta.add(new Kot());
    zwierzeta.add(new Pies());
    nakarmZwierzeta(zwierzeta);

    ArrayList<Pies> psy = new ArrayList<Pies>();
    psy.add(new Pies());
    psy.add(new Pies());
    nakarmZwierzeta(psy);
  }

  public void nakarmZwierzeta(ArrayList<Zwierze> zwierzeta) {
    for(Zwierze z: zwierzeta) {
      z.jedz();
    }
  }
}


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
