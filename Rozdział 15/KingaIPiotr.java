class KontoBankowe {
	
	private int stan = 100;
	
	public int getStan() {
		return stan;
	}
	
	public void pobierz (int kwota) {
		stan = stan - kwota;
	}
}

public class KingaIPiotr implements Runnable {
	
	private KontoBankowe konto = new KontoBankowe();
	
	public static void main(String[] args) {
		
		KingaIPiotr zadanie = new KingaIPiotr();
		Thread watek1 = new Thread(zadanie);
		Thread watek2 = new Thread(zadanie);
		
		watek1.setName("Piotr");
		watek2.setName("Kinga");
		watek1.start();
		watek2.start();
	}
	
	public void run() {
		for (int x = 0; x < 10; x++) {
			pobierzGotowke(10);
			if (konto.getStan() < 0) {
				System.out.println("Brak srodkow na koncie !");
			}
		}
	}
	
	private synchronized void pobierzGotowke(int kwota) {
		if (konto.getStan() >= kwota) {
			System.out.println(Thread.currentThread().getName() + " ma zamiar pobrac gotowke");
			try {
				System.out.println("Watek " + Thread.currentThread().getName() + " zaraz pojdzie spac.");
				Thread.sleep(2000);
			} catch (InterruptedException ex) {ex.printStackTrace(); }
			System.out.println("Watek " + Thread.currentThread().getName() + " obudzil sie.");
			konto.pobierz(kwota);
			System.out.println("Watek " + Thread.currentThread().getName() + " zakonczyl operacje.");
		}
		else {
			System.out.println("Przykro mi, brak srodkow na koncie dla watku " + Thread.currentThread().getName());
		}
	}
}