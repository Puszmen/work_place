import java.util.*;

public class TestMap {

  public static void main(String[] args) {

    HashMap<String, Integer> wyniki = new HashMap<String, Integer>();

    wyniki.put("Kasia", 42);
    wyniki.put("Berta", 343);
    wyniki.put("Sabina", 420);
    System.out.println(wyniki);
    System.out.println(wyniki.get("Berta"));
  }
}
 