class Piosenka implements Comparable<Piosenka> {

  String tytul;
  String artysta;
  String ocena;
  String bpm;

  public boolean equals(Object piosenka) {
    Piosenka p = (Piosenka) piosenka;
    return getTytul().equals(p.getTytul());
  }

  public int hashCode() {
    return tytul.hashCode();
  }

  public int compareTo(Piosenka s) {
    return tytul.compareTo(s.getTytul());
  }

  
  Piosenka(String t, String a, String r, String b) {
    tytul = t;
    artysta = a;
    ocena = r;
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

  public String toString() {
    return tytul;
    //return tytul +": "+ artysta;
  }
}
