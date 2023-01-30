public class Piwo {                          // 5 bottles of beer on the wall, 5 bottles of beer.
 public static void main (String [] args) {  // Take one down and pass it around, 4 bottles of beer on the wall.
                                             
                                             // 1 bottle of beer on the wall, 1 bottle of beer.
                                             // Take one down and pass it around, no more bottles of beer on the wall.

     

   int butelki = 5;
   String slowo = "bottles";
   
   while (butelki > 0) {

   if (butelki == 1) {
   slowo = "bottle";

}

   System.out.println(butelki + " " + slowo + " of beer on the wall");
   System.out.println(butelki + " " + slowo + " of beer.");
   System.out.println("Take one down.");
   System.out.println("Pass it around.");
   
   butelki = butelki - 1;
   
   if (butelki == 1) {
   slowo = "bottle";
}

   if (butelki > 0) {
   System.out.println(butelki + " " + slowo + " of beer on the wall");
   System.out.println();

}  else {
   System.out.println("No more bottles of beer on the wall");
}
}



}
} 
   
   