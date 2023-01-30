public class Mix4 { 
  int licznik = 0;

  public static void main(String[] args) {
    int ilosc = 0;
    Mix4[] m4a = new Mix4[20];
    int x = 0;
    while (_____) {
      m4a[x] = new Mix4();
      m4a[x].licznik = m4a[x].licznik + 1;
      ilosc = ilosc + 1;
      ilosc = ilosc + m4a[x].mozeNowa(x);
      x = x + 1;
    }
    System.out.println(ilosc + " " + m4a[1].licznik);
  }

  public int mozeNowa(int indeks) {
    if (_____) {
      Mix4 m4 = new Mix4();
      m4.licznik = m4.licznik + 1;
      return 1;
    }
    return 0;
  }
}