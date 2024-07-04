package seleniumPractice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFIle {
	public static void main(String[] args) throws IOException {
		System.out.println(getValue("user"));
	}
	public static String getValue(String Key) throws IOException {
		FileReader file = new FileReader(".//Test.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(Key);
	}

}
