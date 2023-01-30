public class HfjEnum {

  enum Imiona {
    JAREK("gitara prowadzaca") { public String spiewa() {
                                   return "tęsknie"; }
                               },
    JUREK("gitara rytmiczna") { public String spiewa() {
                                  return "gardłowo"; }
                              },
    FILIP("bas");

    private String instrument;

    Imiona(String instrument) {
      this.instrument = instrument;
    }

    public String getInstrument() {
      return this.instrument;
    }
    
    public String spiewa() {
      return "od czasu do czasu";
    }
  }

  public static void main(String [] args) {
    for (Imiona n : Imiona.values()) {
      System.out.print(n);
      System.out.print(", instrument: "+ n.getInstrument());
      System.out.println(", śpiewa: " + n.spiewa());
    }
  }
} 