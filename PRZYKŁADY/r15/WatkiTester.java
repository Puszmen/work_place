class MojeZadanie implements Runnable {
  public void run() {
    doDziela(); 
  }
  
  public void doDziela() {
    
    try {
      Thread.sleep(2000); 
    } catch (InterruptedException ex) {
      ex.printStackTrace(); 
    }
    
    kolejnaRobota();
  }

  public void kolejnaRobota() {
    System.out.println("Wierzchołek stosu!");
  }
}


public class WatkiTester {
  public static void main(String[] args) {
    Runnable zadanieWatku = new MojeZadanie();
    Thread mojWatek = new Thread(zadanieWatku);
    
    mojWatek.start();
    
    System.out.println("Z powrotem w metodzie main()");
  }
}