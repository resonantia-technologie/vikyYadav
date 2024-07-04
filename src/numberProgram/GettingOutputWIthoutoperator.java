package numberProgram;

public class GettingOutputWIthoutoperator {
	public static void main(String[] args) {
		int count = 0;
		int a = 15;
		int b = 5;
		
		while(a>=b) {
			a=a-b;
			count++;
		}
		System.out.println(count);
		
		/*
		for (int i = b; i <= a; i=i+5) {
			count++;
		}
		System.out.println(count);
*/
	}

}
