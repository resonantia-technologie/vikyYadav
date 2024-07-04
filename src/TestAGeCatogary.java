public class TestAGeCatogary {
	public static void main(String[] args) {
		try {
			double age[] = { 12, 4, 7, 90, 9.5, 12.5 };
			for (int i = 0; i < age.length; i++) {
				if (age[i] >= 0) {
					System.out.println("Age " + age[i] + ": " + ageOfGroups(age[i]));

				} else
					System.out.println("Age " + age[i] + ": Invalid age");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public static String ageOfGroups(Double age) throws IllegalArgumentException {

		if (age >= 1 && age <= 12) {
			return "kids";
		} else if (age >= 13 && age <= 19) {
			return "Teen";
		} else if (age >= 20 && age <= 59) {
			return "adults";
		} else if (age >= 60 && age <= 100) {
			return "Senior Citizen";
		} else {
			throw new IllegalArgumentException("Age : "+age+ "  invalid age please enter correct Age");

		}

	}

}
