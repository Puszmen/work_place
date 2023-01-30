import java.io.*; 

class ProstyPortal {

int[] polaPolozenia;
int iloscTrafien;

public void setPolaPolozenia(int[] ppol) {
 polaPolozenia = ppol;

}
}

public String sprawdz(String stringPole) {
 int strzal = Integer.parseInt(stringPole);
 String wynik = "pudlo";
 for (int pole : polaPolozenia) {
  
    if (strzal == pole) {
    wynik = "trafiony";
    iloscTrafien++;
    break;
}
}
    
    if (iloscTrafien == polaPolozenia.length) {
    wynik = "zatopiony";
}
System.out.println(wynik);
}
}

public class ProstyPortalGra {

public static void main (String[] args) {

int iloscRuchow = 0;
PomocnikGry pomocnik = new PomocnikGry();

ProstyPortal portal = new ProstyPortal();
int liczbaLosowa = (int) (Math.random() * 5); 

int[] polozenie = {liczbaLosowa,liczbaLosowa+1,liczbaLosowa+2};
portal.setPolaPolozenia(polozenie);
boolean czyIstnieje = true;

while (czyIstnieje == true) {
String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbe");
String wynik = portal.sprawdz(pole);
iloscRuchow++;

if (wynik.equals("zatopiony")) {
czyIstnieje = false;
System.out.println(iloscRuchow + "ruchow");
}
}
}
}

class PomocnikGry {
public String pobierzDaneWejsciowe(String komunikat) {
String wierszWej = null;
System.out.println(komunikat + " ");

try {
BufferedReader sw = new BufferedReader(new InputStreamReader(System.in));
wierszWej = sw.readLine();

if (wierszWej.length() == 0) 
return null;
}
catch (IOException e) {
System.out.println("IOException: " + e);
}
return wierszWej;
}
}


























































