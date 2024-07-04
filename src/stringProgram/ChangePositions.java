package stringProgram;

public class ChangePositions {
public static void main(String[] args) {
		   //AB CD EF GH I
	//OUTPUT BA DC FE HG I
	String str="ABCDEFGHI";
	String s="";
	int temp=0;
	for (int i = temp+1; i <str.length(); i++) {

			s+=str.charAt(i);
	}
	System.out.println(" "+s);
	
	
}
}
