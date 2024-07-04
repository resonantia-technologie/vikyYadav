package ExceprionHandlingConcept;

public class TestExampleOfException {
	public static void main(String[] args) {
		TestExampleOfException e = new TestExampleOfException();
		e.testTryCatchBlock();
	}

	public void testTryCatchBlock() {
		try {
			String str = null;
			System.out.println(str.length());

		} finally {
			System.out.println("Finally block");
		}
		
		try{
			
		}finally {
			System.out.println("Finally block");
		}
		

	}

}
