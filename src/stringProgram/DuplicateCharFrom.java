package stringProgram;

public class DuplicateCharFrom {
	  public static void removeString(String str) {
	        String output = "";
	        for (int i = 0; i < str.length(); i++) {
	            boolean flag = true;
	            // Check if the character has appeared before
	            for (int j = 0; j < i; j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    flag = false;
	                    break;
	                }
	            }
	            if (flag) {
	                output = output + str.charAt(i);
	            }
	        }
	        System.out.println(output);
	    }

	    public static void main(String[] args) {
	        removeString("shrssssikantttt");  // Expected output: shikant
	    }
}
