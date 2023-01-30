class DobryPiesek { 
  
  private int wielkosc;

  public int getWielkosc() {
    return wielkosc;
  }

  public void setWielkosc(int w) {
    wielkosc = w;
  }

  void szczekaj() {
    if (wielkosc > 23) {
      System.out.println("Houu! Houu!");
    } else if (wielkosc > 6) {
      System.out.println("Chau! Chau!");
    } else {
      System.out.println("Hiau! Hiau!");
    }
  }
}

class DobryPiesekTester {
  public static void main(String[] args) {
    DobryPiesek pierwszy = new DobryPiesek();
    pierwszy.setWielkosc(70);
    DobryPiesek drugi = new DobryPiesek();
    drugi.setWielkosc(8);
    System.out.println("Pierwszy Pies: " + pierwszy.getWielkosc());
    System.out.println("Drugi Pies: " + drugi.getWielkosc());
    pierwszy.szczekaj();
    drugi.szczekaj();
  }
}