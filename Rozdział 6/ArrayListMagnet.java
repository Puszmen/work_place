import java.util.*;
public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(0, "zero");
        a.add(1, "jeden");
        a.add(2, "dwa");
        a.add(3, "trzy");
        wyswietlWszystko(a);
        if (a.contains("trzy")) {
            a.add(4, "cztery");
        }
        a.remove(2);
  
        wyswietlWszystko(a);
        if (a.indexOf("cztery") != 2) {
            a.add(4, "4.2");
        }

        if (a.contains("trzy")) {
            a.add("2.2");
        }
        wyswietlWszystko(a);

    }

//        public static void wyswietlWszystko (ArrayList<String> al) {
       
//        for (String element : al) {
//        System.out.print(element + " ");
//}
//System.out.println(" ");
//}
//}
public static void wyswietlWszystko (ArrayList al) {
for (int z = 1; z < al.size(); z++) {
     System.out.print(z + " = " + al.get(z));
     System.out.print(", ");
}
     System.out.println(" ");
 }
 }