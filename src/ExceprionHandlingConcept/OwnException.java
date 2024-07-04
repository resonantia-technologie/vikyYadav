package ExceprionHandlingConcept;

public class OwnException {

	public static void main(String args[]) {
		try {
			throw new CustomerNotFoundException("Customer not found please enter valid customer");

		} catch (CustomerNotFoundException e) {
			System.out.println("Custom exception caught : " + e.getMessage());
		}
	}  

}
