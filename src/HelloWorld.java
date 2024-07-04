import java.awt.Robot;

public class HelloWorld extends Robot{

	public static int count = 0;

	public HelloWorld() throws Exception{
		count++;
		throw new Exception();
	}

	public static int getObjectCount() {
		return count;

	}

	public static void main(String[] args) throws Exception {
		HelloWorld obj1 = new HelloWorld();
		HelloWorld obj2 = new HelloWorld();
		HelloWorld obj3 = new HelloWorld();
		HelloWorld obj5 = new HelloWorld();
		HelloWorld obj6 = new HelloWorld();	
		Robot bot=new Robot();
		System.out.println(HelloWorld.getObjectCount());
		
		
		
		
	}
}
