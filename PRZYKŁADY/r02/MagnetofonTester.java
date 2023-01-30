class Magnetofon {
  boolean mozeNagrywac = false;

  void odtworzTasme() {
    System.out.println("odtwarzam taśmę");
  }

  void nagrajTasme() {
    System.out.println("nagrywam taśmę");
  }
}

class MagnetofonTester {
  public static void main(String[] args) {
    
    Magnetofon m = new Magnetofon();
    m.mozeNagrywac = true;
    m.odtworzTasme();

    if (m.mozeNagrywac == true) {
      m.nagrajTasme();
    }
  }
}