class Dragon {

String imie;
int kula;

public static void main (String [] args) {

 Dragon[] z = new Dragon[3];
 
 int x = 0;

 z[0] = new Dragon();
 z[1] = new Dragon();
 z[2] = new Dragon();


 z[0].imie = "Son Goku";
 z[1].imie = "Son Gohan";
 z[2].imie = "Son Goten";

 z[0].kula = 4;
 z[1].kula = 1;
 z[2].kula = 7;

 while (x < z[x].length) {
 
 System.out.println(z[x].imie + " znalazl kule numer " + z[x].kula);
 x = x + 1;
}


}
}
