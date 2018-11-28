package tyrell_palindrome;

/**
 * Reference based list implementation of StackInterface. Has no capacity limit and can grow when necessary.
 * @author Tyrell
 */
public class StackReferenceBased<E> implements StackInterface<E> {
	
	private Node<E> top;
	
	/**
	 * Creates an empty Stack
	 */
	public StackReferenceBased() {
		this.top = null;
	}

	/**
	 * Checks if Stack is empty
	 * @return true if Stack is empty; false otherwise
	 */
	public boolean isEmpty() {
		return this.top == null;
	}

	/**
	 * Removes all elements from Stack
	 */
	public void popAll() {
		this.top = null;
	}

	/**
	 * Stores element on top of Stack
	 * @param e element to be added to Stack
	 */
	public void push(E e) throws StackException {
		this.top = new Node<E>(e, this.top);
	}

	/**
	 * Removes and returns element on top of Stack
	 * @return element at top of Stack
	 * @throws StackException if Stack is empty
	 */
	public E pop() throws StackException {
		if (!isEmpty()) {
			Node<E> temp = this.top;
			this.top = this.top.getNext();
			return temp.getElement();
		} else {
			throw new StackException("StackException on pop: stack empty");
		}
	}

	/**
	 * Looks at element on top of Stack without removing it
	 * @return element on top of Stack
	 * @throws StackException if Stack is empty
	 */
	public E peek() throws StackException {
		if (!isEmpty()) {
			return top.getElement();
		} else {
			throw new StackException("StackException on peek: stack empty");
		}
	}

}
