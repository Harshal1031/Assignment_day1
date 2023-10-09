package recursion;

public class Factorial {

	public static void main(String[] args) {
       int num=5;
       int fac=factorial(num);
       System.out.println(fac);
	}

	private static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		
		return num * factorial(num-1) ;
	}

}
