package arrayProgram;

public class StarPattern {
	public static void main(String[] args) {
		int totalLine = 5;
		for (int i = 0; i < totalLine; i++) {
			int stars;
			if (i % 2 == 0) {
				stars = 2;
			} else if (i == 5) {
				stars = 3;
			} else {
				stars = 1;
			}
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
