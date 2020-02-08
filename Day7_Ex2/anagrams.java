package Day7_Ex2;

public class anagrams {

	public static void main(String[] args) {
		// Try with another excercise
		printAnagrams("","Carlos");

	}
	
	public static void printAnagrams(String prefix, String word) {
		if(word.length() <= 1) {
			System.out.println(prefix + word);
		} else {
			for(int i = 0; i < word.length(); i++) {
				String cur = word.substring(i, i + 1);
				String before = word.substring(0, i); // letters before cur
				String after = word.substring(i + 1); // letters after cur
				printAnagrams(prefix + cur, before + after);
			}
		}
	}
		
}