class Blef {
  final int wielkosc = 3;
  final int numer;

  Blef() {
    numer = 42;
  }

  void zrob(final int x) {
    // nie można zmieniać wartości x
  }

  void zrobJeszcze() {
    final int z = 7;
    // nie można zmieniać wartości z
  }
}