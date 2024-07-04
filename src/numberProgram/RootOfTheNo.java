package numberProgram;

public class RootOfTheNo {
	public static void main(String[] args) {
		int no = 89;
		int root = 0;
		for (int i = 1; i <= no; i++) {
			if (i * i <= no) {
				root = i;
			} else
				break;

		}

		System.out.println(root);
	}

}
