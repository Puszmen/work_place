class Zegar { 
  String czas;

  void setCzas(String c) {
    czas = c;
  }

  void getCzas() {
    return czas;
  }
}

class ZegarTester {
  public static void main(String[] args) {
    Zegar z = new Zegar();

    z.setCzas("1245");
    String dta = z.getCzas();
    System.out.println("Czas: " + dta);
  } 
}