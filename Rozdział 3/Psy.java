class Pies {
 
 String imie;
 
public static void main (String [] args) {

 Pies pies1 = new Pies(); 
 pies1.imie = "Zbychu";

 
 Pies[] mojDog = new Pies[2];

 mojDog[0] = new Pies();
 mojDog[1] = pies1;

 
 mojDog[0].imie = "Wacek";


 int x = 0;

 while (x < mojDog.length) {
       mojDog[x].szczekaj();
       x = x + 1;
}
}


public void szczekaj() {
System.out.println(imie + " wuf wuf !!");
}


}


