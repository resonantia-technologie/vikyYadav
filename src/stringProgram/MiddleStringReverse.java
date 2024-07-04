package stringProgram;

//input: Kailash Vaijanath andhlkar
//output: Kailash htanjaiav andhlkar
public class MiddleStringReverse {
	public static void main(String[] args) {
		String input = "Kailash Vaijanath andhlkar";
		String output = "";
		String st[] = input.split(" ");
		for (int i = 0; i < st.length; i++) {
			if (i == 1) {
				for (int j = st[i].length() - 1; j >= 0; j--) {
					output = output + st[i].charAt(j);
				}
			}

			else {
				output = output + st[i];

			}
			output = output+" ";

		}
		System.out.println(output);
	}

}
