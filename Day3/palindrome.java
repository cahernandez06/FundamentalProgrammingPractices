package Day3;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Let's check if %s is palindrome %b \n","ana",isPalindrome("ana"));
		System.out.printf("Let's check if %s is palindrome %b \n","noon",isPalindrome("noon"));
		System.out.printf("Let's check if %s is palindrome %b \n","madam",isPalindrome("madam"));
		System.out.printf("Let's check if %s is palindrome %b \n","palindrome",isPalindrome("palindrome"));
		System.out.printf("Let's check if %s is palindrome %b \n","A",isPalindrome("A"));
		System.out.printf("Let's check if %s is palindrome %b \n","",isPalindrome(""));

	}

	public static boolean isPalindrome(String theWord) {
		int middle = theWord.length()/2, j=0; 
		
		for (int i=0;i < middle;i++) {
			if (theWord.charAt(i) != theWord.charAt(theWord.length()-i-1))
				return false;
		}
		return true;
	}
}
