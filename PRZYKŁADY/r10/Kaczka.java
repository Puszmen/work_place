public class Kaczka {
  
  private int wielkosc;
  private static int iloscKaczek = 0; 

  public static void main(String[] args) {
    System.out.println("Ta kaczka ma rozmiar: " + getWielkosc());
  }

  public void setWielkosc(int a) {
    wielkosc = a;
  }
  public int getWielkosc() {
    return wielkosc;
  }
}