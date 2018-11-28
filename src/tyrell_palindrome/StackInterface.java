package tyrell_palindrome;

/**
 * Last-in, first-out (LIFO) collection of elements
 * @author Tyrell
 * @param <E> type of elements held in collection
 */
public interface StackInterface<E> {
	
	/**
	 * Checks if Stack is empty
	 * @return true if stack contains no elements, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Removes all elements from Stack
	 */
	public void popAll();
	
	/**
	 * Stores element at the top of Stack
	 * @param e element to be pushed onto Stack
	 * @throws StackException if Stack is at maximum capacity
	 */
	public void push(E e) throws StackException;
	
	/**
	 * Removes and returns element at the top of Stack
	 * @return removed element
	 * @throws StackException if Stack is empty
	 */
	public E pop() throws StackException;
	
	/**
	 * Looks at element on top of Stack without removing it
	 * @return element at top of Stack
	 * @throws StackException if Stack is empty
	 */
	public E peek() throws StackException;

}
