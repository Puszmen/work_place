class BiednyPies {
  private int wielkosc;
  private String imie; 

  public int getWielkosc() {
    return wielkosc;
  }

  public String getImie() {
    return imie;
  }
}

public class BiednyPiesTester {
  public static void main(String[] args) {
    BiednyPies psinka = new BiednyPies();
    System.out.println("Pies ma wielkość: " + psinka.getWielkosc());
    System.out.println("Pies ma na imię: " + psinka.getImie()); 
  }
}