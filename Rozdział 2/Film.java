class Film {

  String tytul;
  String rodzaj;
  int ocena;

      void odtworz () {
           System.out.println("Odtwarzam film.");
}
}
class FilmTester {
 public static void main (String [] args) {

  Film pierwszy = new Film ();
  pierwszy.tytul = "Poznaj moich Spartan";
  pierwszy.rodzaj = "komedia";
  pierwszy.ocena = 5;

  Film drugi = new Film ();
  drugi.tytul = "Obecnosc";
  drugi.rodzaj = "horror";
  drugi.ocena = 8;
  drugi.odtworz ();

  Film trzeci = new Film ();
  trzeci.tytul = "Matrix";
  trzeci.rodzaj = "Science fiction";
  trzeci.ocena = 10;

}
}