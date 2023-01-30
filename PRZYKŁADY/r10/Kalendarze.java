class Kalendarze {
 
  public void  main(String[] args) {
    Calendar c = Calendar.getInstance();
    c.set(2004, 0, 7, 15, 40);			
    long d1 = c.getTimeInMillis();	
    d1 += 1000 * 60 * 60;			
    c.setTimeInMillis(d1);		
    System.out.println("Nowa godzina to: " + c.get(c.HOUR_OF_DAY));		
    c.add(c.DATE, 35);				
    System.out.println("Po dodaniu 35 dni: " + c.getTime());
    c.roll(c.DATE, 35);				
    System.out.println("Po przesunięciu daty o 35 dni: " + c.getTime());
    c.set(c.DATE, 1);
    System.out.println("Ustawiono dzień na 1.: " + c.getTime());
  }
} 

