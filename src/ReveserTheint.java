
public class ReveserTheint {

	public static void main(String[] args) {
	 int num=345;
	 int temp=num;
	 int num2=0;
	 while(num>0) {
		 
		 int n=num%10;
		 num2=n+num2*10;
		 num=num/10;
		 
	 }
	System.out.println(num2);

	}

}
