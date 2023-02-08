class A {
int izm = 7;
void m1() {
System.out.print("A - m1, ");
}

void m2() {
System.out.print("A - m2, ");
}

void m3() {
System.out.print("A - m3, ");
}
} // end of class A

class B extends A {
void m1() {
System.out.print("B - m1, ");
}
} // end of class B

class C extends B {
void m3() {
System.out.print("C - m3, " + (izm + 6));
}

} // end of class C

public class PomieszaneKomunikaty {
public static void main (String[] args) {

A a = new A();
B b = new B();
C c = new C();
A a2 = new C();

a2.m1();
a2.m2();
a2.m3();

}
}// end of PomieszaneKomunikaty