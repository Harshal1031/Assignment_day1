
public class Variable {
  static int a=10;
  private int b=100;
  public static void main(String[] args) {
	  int c=10;
	System.out.println("Static"+a);
	Variable v=new Variable();
	System.out.println(v.b);
	System.out.println(c);
}
  
}
