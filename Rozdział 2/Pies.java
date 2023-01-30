class Pies {
   
   int wielkosc;
   String rasa;
   String imie;


   void bydle () {
        System.out.println("Moje bydle ma " + wielkosc);
}

   void szczekaj () {
        System.out.println("HAU HAU WUF WUF");
}

}





class PiesTester {
 public static void main (String [] args) {

 Pies p = new Pies();
 p. wielkosc = 40;
 p. bydle ();
 p. szczekaj ();
 
 


}
}