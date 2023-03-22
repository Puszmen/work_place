class TestSynchro implements Runnable {
	
	private int stanKonta;
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			inkrementuj();
			System.out.println("Aktualny stan konta to :" + stanKonta);
		}
	}
	
	public synchronized void inkrementuj() {
		int i = stanKonta;
		stanKonta = i + 1;
	}
}

public class TestSynchronizacji {
	public static void main(String[] args) {
		
		TestSynchro zadanie = new TestSynchro();
		Thread watek1 = new Thread(zadanie);
		Thread watel2 = new Thread(zadanie);
		watek1.start();
		watel2.start();
	}
}