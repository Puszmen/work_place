public class MalyTest { 
  
  Integer i;
  int j;
  
  public static void main (String[] args) {
    MalyTest t = new MalyTest();
    t.go();
  }
  
  public void go() {
    j=i;
    System.out.println(j);
    System.out.println(i);
  }
}
