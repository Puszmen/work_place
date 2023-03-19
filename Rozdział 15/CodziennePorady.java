import java.io.*;
import java.net.*;

public class CodziennePorady {
	
	public void doDziela() {
		
		try {
			Socket s = new Socket("127.0.0.1", 4242);
			
			InputStreamReader strCzytelnik = new InputStreamReader(s.getInputStream());
			BufferedReader czytelnik = new BufferedReader(strCzytelnik);
			
			String porada = czytelnik.readLine();
			System.out.println("Zadania na dzis: " + porada);
			
			czytelnik.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		CodziennePorady klient = new CodziennePorady();
		klient.doDziela();
	}
}