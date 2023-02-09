 class LodzWioslowa extends Lodz {
public void wioslowanie() { 
System.out.print("Kigna wiosluje");
}
} // koniec klasy LodzWioslowa

 class Lodz {
private int dlugosc;
public void setDlugosc(int dl) {
dlugosc = dl;
}

public int getDlugosc() {
return dlugosc;
}
public void plywanie() {
System.out.print("dryfuje ");
}

} //koniec klasy Lodz

public class LodzTester {
public static void main (String[] args) {

Lodz b1 = new Lodz();
LodzZeglowa b2 = new LodzZeglowa();
LodzWioslowa b3 = new LodzWioslowa();

b2.setDlugosc(32);
b1.plywanie();
b3.plywanie();
b2.plywanie();

}
}// koniec klasy LodzTester

 class LodzZeglowa extends Lodz {
public void plywanie() {
System.out.print("i stawia zagle");
}
}// koniec klasy LodzTester

















