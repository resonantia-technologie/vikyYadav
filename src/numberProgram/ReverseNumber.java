package numberProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNumber(7654));
	}

	public static int reverseNumber(int no) {
		int rev = 0;
		while (no != 0) {
			int digit = no % 10;
			rev = rev * 10 + digit;
			no = no / 10;
		}

		return rev;

	}
	
	public static int checkPrimeNumber(int no) {
		if(no%2==0 && no!=0) {
			
		}
		return no;

	}

}
