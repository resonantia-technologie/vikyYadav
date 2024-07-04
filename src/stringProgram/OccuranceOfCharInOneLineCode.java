package stringProgram;
public class OccuranceOfCharInOneLineCode {
	public static void main(String[] args) {
		String str = "TKaesKteKieng";
        int no = str.length() - str.replace("K", "").length();
		System.out.println(no);
	}
}
