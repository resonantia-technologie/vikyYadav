package numberProgram;

public class ArmStrongNo {
	public static void main(String args[]){
		int no=7464;
		int rem=0;
		int total=0;
		int value=no;
		while(value>0){
			rem=value%10;
			total=total+(rem*rem*rem);
			value=value/10;
		}
		if(total==no){
			System.out.print("This is armstrong number:: "+total);
		}
		else
			System.out.print("This is armstrong number: "+total);



		}
}
