import java.util.*;

public class ZbiorTestowy {
  public static void main (String[] args) {
    new ZbiorTestowy().doDziela();
  }

  public void doDziela() {
    Ksiazka b1 = new Ksiazka("Jak działają koty");
    Ksiazka b2 = new Ksiazka("Remiks organiczny");
    Ksiazka b3 = new Ksiazka("Szukając Emo");
	KsiazkaCompare komparator = new KsiazkaCompare();
	TreeSet<Ksiazka> tree = new TreeSet<Ksiazka>(komparator);
    tree.add(b1);
    tree.add(b2);
    tree.add(b3);
    System.out.println(tree);
  }
}

class Ksiazka implements Comparable {
  String tytul;
  public Ksiazka(String t) {
    tytul = t;
  }
  
  public int compareTo(Object b) {
	  Ksiazka k = (Ksiazka) b;
	  return (tytul.compareTo(k.tytul));
  }
  
}

class KsiazkaCompare implements Comparator<Ksiazka> {
	public int compare(Ksiazka k1, Ksiazka k2) {
		return (k1.tytul.compareTo(k2.tytul));
	}
}