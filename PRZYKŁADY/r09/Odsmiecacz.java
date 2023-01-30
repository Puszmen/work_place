public class Odsmiecacz {
  public static Odsmiecacz doRoboty() {
    Odsmiecacz nwOdsm = new Odsmiecacz();
    doRoboty2(nwOdsm);
    return nwOdsm;
  }

  public static void main(String[] args) {
    Odsmiecacz odsm1;
    Odsmiecacz odsm2 = new Odsmiecacz();
    Odsmiecacz odsm3 = new Odsmiecacz();
    Odsmiecacz odsm4 = odsm3;
    odsm1 = doRoboty();


    // wywołania kolejnych metod
  }

  public static void doRoboty2(Odsmiecacz kopiaOdsm) {
    Odsmiecacz lokalnyOdsm;
  }
}
