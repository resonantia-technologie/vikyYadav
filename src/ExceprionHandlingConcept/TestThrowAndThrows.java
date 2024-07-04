package ExceprionHandlingConcept;

public class TestThrowAndThrows {

	public static void main(String[] args) throws OutOfMemoryError, NullPointerException, ExceptionInInitializerError {
		TestThrow();
	}
	public static  void TestThrow()
			throws OutOfMemoryError, NullPointerException, ExceptionInInitializerError {
		String str="Kailas323";
		int no=Integer.parseInt(str);
		System.out.println(no);
 	
	}
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
}
