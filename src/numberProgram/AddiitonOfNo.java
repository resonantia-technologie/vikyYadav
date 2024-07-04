package numberProgram;

public class AddiitonOfNo {
	public static void main(String args[]) {
		int no = 88999;
		int sum = 0;
		int rem = 0;		
		while(no>0) {
		rem = no % 10;
		sum+=rem;
		no=no/10;
		}
		System.out.println(sum);
	

	}
}
