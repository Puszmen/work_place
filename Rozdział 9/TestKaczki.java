public class TestKaczki {
public static void main (String[] args) {

int waga = 6;
float gestosc = 2.1F;
String imie = "Donald";
long[] piora = {1,2,3,4,5,6};
boolean mozeLatac = true;
int szybkoscLotu = 25;

Kaczka[] k = new Kaczka[7];

k[0] = new Kaczka();
k[1] = new Kaczka(gestosc, waga);
k[2] = new Kaczka(imie, piora);
k[3] = new Kaczka(mozeLatac);
k[4] = new Kaczka(3.3F, szybkoscLotu);
k[5] = new Kaczka(false);
k[6] = new Kaczka(szybkoscLotu, gestosc);

}
}

class Kaczka {

int kilo = 6;
float lotnosc = 2.1F;
String imie = "Ogolna";
long[] piora = {1,2,3,4,5,6,7};
boolean mozeLatac = true;
int maksSzybkosc = 25;

public Kaczka() {
System.out.println("Kaczka typu 1");
}

public Kaczka (boolean lotna) {
mozeLatac = lotna;
System.out.println("Kaczka typu 2");
}

public Kaczka (String i, long[] p) {
imie = i;
piora = p;
System.out.println("Kaczka typu 3");
}

//public Kaczka (int w, float 1) {
//kilo = w;
//lotnosc = 1;
//System.out.println("Kaczka typu 4");
//}


public Kaczka (float gestosc, int maks) {
lotnosc = gestosc;
maksSzybkosc = maks;
System.out.println("Kaczka typu 5");
}

}






























