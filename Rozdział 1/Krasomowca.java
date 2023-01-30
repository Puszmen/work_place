public class Krasomowca {
 public static void main (String [] args) {

  String [] imie = {"Kinga","Niusia","Groszek","Koteczek","Cycolina","Pipeczka","Kingusia"};
  String [] czynnosc = {"pluje","sika","robi kupe","krzyczy","milczy","warczy","myje dupe","muska cyca","traca pindola","atakuje","puszcza oko","rozbiera"};
  String [] przymiotnik = {"ponetnie","zawziecie","ryzykownie","agresywnie","energicznie","opieszale","romantycznie","nieruchawo","w milczeniu"};

  int dlugosc1 = imie.length;
  int dlugosc2 = czynnosc.length;
  int dlugosc3 = przymiotnik.length;

  int rnd1 = (int) (Math.random() * dlugosc1);
  int rnd2 = (int) (Math.random() * dlugosc2);
  int rnd3 = (int) (Math.random() * dlugosc3);

  String zdanie = imie[rnd1] + " " + czynnosc[rnd2] + " " + przymiotnik[rnd3];

  System.out.println("Moja ukochana narzeczona: " + zdanie);

}
}

