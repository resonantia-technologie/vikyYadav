package numberProgram;

import java.util.Iterator;

public class PrintEvenNo {
public static void main(String[] args) {
	for (int i = 0; i <=10; i++) {
		if(i%2==0) {
			System.out.println("No is even : "+i);
		}
		else
			System.out.println("No is odd : "+i);
	}
}
}
