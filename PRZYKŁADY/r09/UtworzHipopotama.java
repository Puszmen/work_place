public abstract class Zwierze { 
  private String imie;

  public String getImie() {
    return imie;
  }

  public Zwierze(String imieZwk) {
    imie = imieZwk;
  }
}

public class Hipopotam extends Zwierze {
  public Hipopotam(String imie) {
    super(imie);
  }
}

public class UtworzHipopotama {
  public static void main(String[] args) {
    Hipopotam h = new Hipopotam("Hipcio");
    System.out.println(h.getImie());
  }
}