class Kinga {
 
 boolean kocha = true;
 boolean caluje = true;

 void kochamCie () {
 System.out.println("Kingusia Kocha Piotrusia :* ");
}

 void calujeCie () {
 System.out.println("Chodz Piotrusiu dam buziaka :* :* :* ");
}
}

class KingaTester {
public static void main (String [] args) {

 Kinga k = new Kinga ();
 
 k.caluje = false;
 k.calujeCie();
 if (k.caluje == true ) {
 k.calujeCie();
}

}
}