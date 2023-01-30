class Pies { 
  int wielkosc;
  String nazwa;

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

class PiesTester {
  public static void main(String[] args) {
    Pies pierwszy = new Pies();
    pierwszy.wielkosc = 40;
    Pies drugi = new Pies();
    drugi.wielkosc = 2;
    Pies trzeci = new Pies();
    trzeci.wielkosc = 8;

    pierwszy.szczekaj();
    drugi.szczekaj();
    trzeci.szczekaj();
  }
}