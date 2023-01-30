public class Test1 {}

class Pralnia {
  public void zrobPranie() throws SpodnieWyjatek, BieliznaWyjatek {
    // kod który może zgłaszać oba wyjątki
  }
}

class Test {
  public void doDziela() {
    Pralnia pralnia = new Pralnia();
    try {
      pralnia.zrobPranie();
    } catch (SpodnieWyjatek sex) {
      // kod rozwiązujący problem
    } catch (BieliznaWyjatek bex) {
      // kod rozwiązujący problem
    }
  }
}


class SpodnieWyjatek extends Exception {}
class BieliznaWyjatek extends Exception {}