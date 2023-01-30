class DobryPiesek {

private int wielkosc;

public int getWielkosc() { 
       return wielkosc; 
}

public void setWielkosc(int w) {
wielkosc = w;
}

void szczekaj () {

if (wielkosc > 30) {
System.out.println("Wuf wuf !!");
}
else if (wielkosc > 15) {
System.out.println("Hau hau !!");
}
else {
System.out.println("Hiau hiau !!");
}

}
}

class DobryPiesekTester {
public static void main(String [] args) {

DobryPiesek pierwszy = new DobryPiesek();
pierwszy.setWielkosc(72);
DobryPiesek drugi = new DobryPiesek();
drugi.setWielkosc(22);

System.out.println("Pierwszy pies: " + pierwszy.getWielkosc());
pierwszy.szczekaj();
System.out.println("Drugi pies: " + drugi.getWielkosc());
drugi.szczekaj();

}
}











