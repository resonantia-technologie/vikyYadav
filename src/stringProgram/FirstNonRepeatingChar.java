package stringProgram;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "automation";
		boolean found = false;
		char c = 0;
		for (int i = 0; i < str.length(); i++) {
			char st = str.charAt(i);
			found=true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && st == str.charAt(j)) {
					found = false;
					break;
				}
			}
			if (found) {
				c = st;
				break;
			}
		}

		if(found) {
			System.out.println(c);
		}
		else
			System.out.println("No repeated char");

		
	}
}
