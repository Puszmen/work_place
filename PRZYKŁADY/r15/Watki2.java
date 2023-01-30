public class Watki2 implements Runnable {
  public static void main(String[] args) {
    Watki2 program = new Watki2();
    Thread alfa = new Thread(program);
    Thread beta = new Thread(program);
    alfa.setName("Wątek Alfa");
    beta.setName("Wątek Beta");
    alfa.start();
    beta.start();
  }
  
  public void run() {
    for (int i = 0; i < 25; i++) {
      String nazwaWatku = Thread.currentThread().getName();
      System.out.println("Aktualnie działa: " + nazwaWatku);
    }
  }
}