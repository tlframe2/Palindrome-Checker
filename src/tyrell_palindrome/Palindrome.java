package tyrell_palindrome;

/**
 * Determines if a string is a palindrome (letters are in the same order both forwards and backwards). Case insensitive and ignores spaces and non-alphanumeric characters.
 * @author Tyrell
 */
public class Palindrome {
	
	/**
	 * Determines if given string is a palindrome
	 * @param text input string
	 * @return true if string is palindrome; false otherwise
	 */
	public static boolean isPali(String text) {
		
		QueueArrayBased<Character> queue = new QueueArrayBased<Character>(); // Stores characters in normal order
		StackReferenceBased<Character> stack = new StackReferenceBased<Character>(); // Stores characters in reverse order
		
		for (int i = 0; i < text.length(); i++) {
			if (isValidChar(text.charAt(i))) {
				queue.offer(Character.toLowerCase(text.charAt(i)));
				stack.push(Character.toLowerCase(text.charAt(i)));
			}
		}
		
		while (!queue.isEmpty() && !stack.isEmpty()) {
			if (queue.poll() != stack.pop()) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Filters out non-alphanumeric characters like spaces and punctuation
	 * @param curr current character
	 * @return true if current character is alphanumeric; false otherwise
	 */
	private static boolean isValidChar(char curr) {
		
		char[] invalidChars = new char[] {' ', '?', '.', ',', ';', ':', '\'', '"', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+', '='};
		
		for (int i = 0; i < invalidChars.length; i++) {
			if (curr == invalidChars[i]) {
				return false;
			}
		}
		
		return true;
		
	}

}
