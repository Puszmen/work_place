class Pies {
  String imie;

  public static void main (String[] args) {
    // tworzymy obiekt Pies i używamy go
    Pies pies1 = new Pies();
    pies1.szczekaj();
    pies1.imie = "Azorek";

    // teraz tworzymy tablice obiektów Pies
    Pies[] mojePsy = new Pies[3];
    // i zapisujemy w niej obiekty
    mojePsy[0] = new Pies();
    mojePsy[1] = new Pies();
    mojePsy[2] = pies1;

    // teraz uzyskujemy dostęp do obiektów
    // odwołując się do nich przez tablicę
    mojePsy[0].imie = "Szarik";
    mojePsy[1].imie = "Cywil";

    // Hm.... jak ma na imie pies 
    // z komórki mojePsy[2] ?
    System.out.print("Ostatni pies ma na imię ");
    System.out.println(mojePsy[2].imie);

    // A teraz w pętli każemy wszystkim
    // psom szczekać
    int x = 0;
    while (x < mojePsy.length) {
      mojePsy[x].szczekaj();
      x = x + 1;
    }
  }

  public void szczekaj() { 
    System.out.println(imie + " szczeka: Hau, hau!!");
  }

  public void jedz() { }

  public void gonKota() { }

}