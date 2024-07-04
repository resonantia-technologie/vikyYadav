package numberProgram;

public class FindArmStrongNumber {
	public static void main(String[] args) {
		int no=153;
		int rev=0;
		int temp=0;
		int q=0;
		int arm=0;
		while(no!=0) {
			temp=no%10;
			rev=rev*10+temp;
			no=no/10;
			q=rev*rev*rev;
			arm=arm+q;
		}
		if(no==arm) {
			System.out.println("no is armstrong");
		}
	}
}
