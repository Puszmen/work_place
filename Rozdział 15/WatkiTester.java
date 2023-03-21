class MojeZadanie implements Runnable {
	
	public void run() {
		doDziela();
	}
	public void doDziela() {
		kolejnaRobota();
	}
	public void kolejnaRobota() {
		System.out.println("Wierzcholek stosu");
	}
}

class WatkiTester {
	public static void main(String[] args) {
		
		Runnable zadanieWatku = new MojeZadanie();
		Thread mojWatek = new Thread(zadanieWatku);
		
		mojWatek.start();
		
		System.out.println("Z powrotem w metodzie main()");
	}
}