class SynalekBoo extends Boo { 
  public SynalekBoo() {
    super("Boo");
  }

  public SynalekBoo(int i) {
    super("Fred");
  }

  public SynalekBoo(String s) {
    super(42);
  }
  
  public SynalekBoo(int i, String s) {
  }

  public SynalekBoo(String a, String b, String c) {
    super(a,b);
  }

  public SynalekBoo(int i, int j) {
    super("facet", j);
  }

  public SynalekBoo(int i, int x, int y) {
    super(i,"start");
  }
}