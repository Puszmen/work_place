import java.util.*;
import java.text.*;

class ZabawaZMath {
  static char znakNull;
  public static void main(String[] args) {
    int start = 1234567;
    Integer iObj = new Integer(start);
    System.out.println("Integer (iObj) = " + iObj);
    
    String iDwojkowo = Integer.toBinaryString(iObj.intValue());
    System.out.println("dwójkowo = ");
    System.out.println(" " + iDwojkowo);

    Locale lok = Locale.UK;
    NumberFormat f = NumberFormat.getCurrencyInstance(lok);
    f.setMaximumFractionDigits(0);
    String kwotaEN = f.format(Integer.parseInt(iDwojkowo,2));
    System.out.println("Kwota w Wielkiej Brytanii = " + kwotaEN);

    String ogolna = kwotaEN.substring(1,10);
    System.out.println("W sposób ogólny: " + ogolna);

    String koniec = ogolna.replace(',', znakNull);
    System.out.println("Koniec = " + koniec);
  }
}