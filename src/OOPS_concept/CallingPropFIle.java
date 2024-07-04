package OOPS_concept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CallingPropFIle {

	public static void main(String[] args) throws IOException {
		System.out.println(getValue("user"));
	}

	public static String getValue(String key) throws IOException {
		Properties prop = null;
		FileInputStream fis;
		String value = "";
		try {
			fis = new FileInputStream(".\\Test.properties");
			prop = new Properties();

			prop.load(fis);
		}

		catch (IOException e) {

			System.out.println("file NOt found");
		}
		return value = prop.getProperty(key);

	}

}
