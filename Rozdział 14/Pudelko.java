import java.io.*;

public class Pudelko implements Serializable {
	
	private int szerokosc;
	private int wysokosc;
	
	public void setSzerokosc(int s) {
		szerokosc = s;
	}
	
	public void setWysokosc(int w) {
		wysokosc = w;
	}
	
	public static void main(String[] args) {
		
		Pudelko mojePudelko = new Pudelko();
		
		mojePudelko.setSzerokosc(50);
		mojePudelko.setWysokosc(70);
		
		try {
			
			FileOutputStream fs = new FileOutputStream("pudelko.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mojePudelko);
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}