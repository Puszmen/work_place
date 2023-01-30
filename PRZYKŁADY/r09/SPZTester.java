import java.util.*; 

class KlimatyzatorV2 {
  KlimatyzatorV2(ArrayList lista) {
    for(int x=0; x<5; x++) {
      lista.add(new JednSym("KlimatyzatorV2"));
    }
  }
}

class KlimatyzatorV3 extends KlimatyzatorV2 {
  KlimatyzatorV3(ArrayList lglista) {
    super(lglista);
    for (int g=0; g<10; g++) {
      lglista.add(new JednSym("KlimatyzatorV3"));
    }
  }
}

class Grzejnik {
  Grzejnik(ArrayList glista) {
    glista.add(new JednSym("Grzejnik"));
  }
}

public class SPZTester {
  public static void main(String[] args) {
    ArrayList lista = new ArrayList();
    KlimatyzatorV2 v2 = new KlimatyzatorV2(lista);
    KlimatyzatorV3 v3 = new KlimatyzatorV3(lista);
    for(int z=0; z<20; z++) {
      Grzejnik grz = new Grzejnik(lista);
    }
  }
}

class JednSym {
  String typUrz;

  JednSym(String typ) {
    typUrz = typ;
  }

  int zuzycieEnergii() {
    if ("Grzejnik".equals(typUrz)) {
      return 2;
    } else {
      return 4;
    }
  }
}