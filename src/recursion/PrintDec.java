package recursion;

public class PrintDec {

	public static void main(String[] args) {
		int num=10;
		printDec(num);

	}

	private static void printDec(int num) {
		if(num==1) {
			System.out.println(num+" ");
			System.out.print(num+" ");

			return;
		}
		System.out.print(num+" ");
		printDec(num-1);
		System.out.print(num+" ");

	}

}
