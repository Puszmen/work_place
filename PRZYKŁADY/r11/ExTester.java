class MojeEx extends Exception { } 

public class ExTester {

  public static void main(String[] args) {
    String test = args[0];
    try {
      System.out.print("p");
      zaryzykuj(test);
      System.out.print("a");
    } catch (MojeEx e) {
      System.out.print("a");
    } finally {
      System.out.print("n");
    }
    System.out.print("a");
  }

  static void zaryzykuj(String t) throws MojeEx {
    System.out.print("i");

    if ("tak".equals(t)) {
      throw new MojeEx();
    }
    System.out.print("j");
  }
}