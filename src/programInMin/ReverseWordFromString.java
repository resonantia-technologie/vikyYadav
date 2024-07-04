package programInMin;

public class ReverseWordFromString {
	public static void main(String[] args) {
		String str = "Know What Employees are Saying";
		String st[] = str.split(" ");
		String rev = "";
		for (int i = 0; i < st.length; i++) {
			for (int j = st[i].length() - 1; j >= 0; j--) {
				char ch = st[i].charAt(j);
				rev += ch;
			}
			rev=rev+" ";
		}
		System.out.print(rev);
	}
}
