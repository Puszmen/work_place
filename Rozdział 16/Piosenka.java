class Piosenka implements Comparable<Piosenka> {

  String tytul;
  String artysta;
  String ocena;
  String bpm;

  public int compareTo(Piosenka p) {
	  return tytul.compareTo(p.getTytul());
  }
  
  Piosenka(String t, String a, String o, String b) {
    tytul = t;
    artysta = a;
    ocena = o;
    bpm = b;
  }

  public String getTytul() {
    return tytul;
  }

  public String getArtyste() {
    return artysta;
  }

  public String getOcene() {
    return ocena;
  }

  public String getBpm() {
    return bpm;
  }
}