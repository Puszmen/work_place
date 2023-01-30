public class ProstyPortalTester {
 public static void main (String [] args) {

   ProstyPortal wit = new ProstyPortal(); 
   int [] polozenia = {2,3,4};
   wit.setPolaPolozenia(polozenia);
   String wybranePole = "1";
   String wynik = wit.sprawdz(wybranePole);

}
}

class ProstyPortal {
 
 int[] polaPolozenia;
 int iloscTrafien;

 public void setPolaPolozenia(int[] ppol) {
   polaPolozenia = ppol;

}

 public String sprawdz (String stringPole) {
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
return wynik;
}
}









































