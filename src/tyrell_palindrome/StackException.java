package tyrell_palindrome;

/**
 * Thrown by methods in the StackReferenceBased class to indicate that the stack is empty.
 * @author Tyrell
 */
@SuppressWarnings("serial")
public class StackException extends java.lang.RuntimeException {
	
	public StackException(String s) {
		super(s);
	}

}
