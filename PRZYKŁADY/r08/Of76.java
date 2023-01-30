interface Nos { 
  public int iMetoda();
}

abstract class Picasso implements Nos {
  public int iMetoda() {
    return 7;
  }
}

class Klaun extends Picasso { }

class Akty extends Picasso {
  public int iMetoda() {
    return 5;
  }
}

public class Of76 extends Klaun {
  public static void main(String[] args) {
    Nos[] i = new Nos[3];
    i[0] = new Akty();
    i[1] = new Klaun();
    i[2] = new Of76();
    for (int x = 0; x < 3; x++) {
      System.out.println( i[x].iMetoda() + " " + i[x].getClass( ) );
    }
  }
}