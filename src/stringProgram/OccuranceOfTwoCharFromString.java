	package stringProgram;

public class OccuranceOfTwoCharFromString {
	public static void main(String[] args) {
		String str = "Kailas AndhKaaKalkarKa";
		String k = "Ka";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i).indexOf(k) == 0) {
				count++;
			}
		}

		System.out.println("No of Words Occurance: " + count);

	}
}
