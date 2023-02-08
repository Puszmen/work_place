public class PotworTester {
public static void main (String[] args) {

Potwor[] ptw = new Potwor[3];
ptw[0] = new Wampir();
ptw[1] = new Smok();
ptw[2] = new Potwor();

for (int x = 0; x < 3; x++) {

ptw[x].strasz(x);
}

}
}

class Potwor {
boolean strasz (int x) {
System.out.println("auuuuu");
return false;
}
}

class Wampir extends Potwor {
boolean strasz (int x) {
System.out.println("mozna gryza ?");
return true;
}
}

class Smok extends Potwor {
boolean strasz (int stopien) {
System.out.println("zion ogniem");
return true;

}
}