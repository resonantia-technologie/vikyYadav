package stringProgram;

import java.net.MalformedURLException;
import java.net.URL;

public class GetDomainNameFromUrl {
	public static void main(String[] args) throws MalformedURLException {
		String url = "https://www.example.com/path/to/resource";
		URL ur = new URL(url);
		String host=ur.getHost();
		System.out.println(host);

	}
}
