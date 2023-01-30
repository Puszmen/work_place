class Hobbit {

 String imie;

public static void main (String [] args) {

 Hobbit[] h = new Hobbit[3];

 int x = -1;

 while (x < 1) {

 x = x + 1;

 h[x] = new Hobbit();
 h[x].imie = "Frodo";

 if (x == 1) {
 h[x].imie = "Sam";
}

System.out.print(h[x].imie + " jest ");
System.out.println("dobrym imieniem dla Hobbita");

}

}
}

