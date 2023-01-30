class Gracz {
  static int iloscGraczy = 0;
  private String imie;

  public Gracz(String n) {
    imie = n;
    iloscGraczy++;
  }
}

public class GraczTester {
  public static void main(String[] args) {
    System.out.println(Gracz.iloscGraczy);
    Gracz pierwszy = new Gracz("Tiger Woods");
    System.out.println(Gracz.iloscGraczy);
  }
} 