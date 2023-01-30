import java.text.*;
import java.util.*;

public class Formatowanie {
  public static void main(String[] args) {
    Date d = new Date();
    
    Locale localeUK = Locale.UK;
    DateFormat formater = DateFormat.getDateInstance(DateFormat.DEFAULT, localeUK);
    String data = formater.format(d);

    System.out.println( data );
  }
} 