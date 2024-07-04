package ExceprionHandlingConcept;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println(HelloWorld.test());

	}

	public static int test() {

		try {

			return 1;

		} catch (Exception e)

		{

			return 2;

		}

		finally {

			System.out.println("finally trumps return.");

			return 3;	
			}

	}

}
