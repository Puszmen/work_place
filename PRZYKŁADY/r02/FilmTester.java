class Film {
  String tytul;
  String rodzaj;
  int ocena;

  void odtworz() {
    System.out.println("Odtwarzamy film.");
  }
}

public class FilmTester {
  public static void main(String[] args) {
    Film pierwszy = new Film();
    pierwszy.tytul = "Przemineło z hossą";
    pierwszy.rodzaj = "Tragedia";
    pierwszy.ocena = -2;
    Film drugi = new Film();
    drugi.tytul = "Matrix dla zuchwałych";
    drugi.rodzaj = "Komedia";
    drugi.ocena = 5;
    drugi.odtworz();
    Film trzeci = new Film();
    trzeci.tytul = "Byte Club";
    trzeci.rodzaj = "Tragedia, ale o wydźwięku optymistycznym";
    trzeci.ocena = 127;
  }
}
