package numberProgram;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int no=1353;
		int sum=0;
		int rem=0;
		int value=no;
		while(value>0) {
			rem=value%10;
			sum=sum+(rem*rem*rem);
			value=value/10;
		}
		if(sum==no)
		{
			System.out.println(sum+" is armstrong");
		}
		else
		{
			System.out.println(sum+" not armstrong");
		}
	}
}
