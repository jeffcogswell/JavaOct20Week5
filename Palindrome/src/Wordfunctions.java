
public class Wordfunctions {

	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		int result = str.compareTo(sb.toString());
		return result == 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
