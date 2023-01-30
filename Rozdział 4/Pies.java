class Pies { 

 int wielkosc;
 String imie;

 void szczekaj (int iloscSzczekniec) {

 while (iloscSzczekniec > 0) {
 iloscSzczekniec = iloscSzczekniec - 1;

 if (wielkosc > 23) {
 System.out.println("Wuf wuf !!");
}
 
 else if (wielkosc > 8) {
 System.out.println("Hau hau !!");
}

 else {
 System.out.println("Hiau hiau !!");

}
}

}
}

class PiesTester {
public static void main (String [] args) {

Pies pierwszy = new Pies();
pierwszy.wielkosc = 25;

Pies drugi = new Pies();
drugi.wielkosc = 15;

Pies trzeci = new Pies();
trzeci.wielkosc = 6;

pierwszy.szczekaj(2);
drugi.szczekaj(1);
trzeci.szczekaj(1);


}
}










