package numberProgram;

public class SumofDigit {
public static void main(String[] args) {
	int no=124353;
	int rem=0;
	int sum=0;
	while(no>0) {
		rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	System.out.println(sum);
}
}
