package tyrell_palindrome;


/**
 * Individual element in StackReferenceBased list
 * @author Tyrell
 * @param <E> type of element stored
 */
public class Node<E> {
	
	// Instance variables
	private E e;
	private Node<E> next;
	
	/**
	 * Default Constructor. Creates a Node with specified element that does not reference another Node.
	 * @param e element to be stored
	 */
	public Node(E e) {
		this.e = e;
	}
	
	/**
	 * Overloaded Constructor. Creates a Node with specified value and reference to another Node.
	 * @param e element to be stored
	 * @param next Node that will follow
	 */
	public Node(E e, Node<E> next) {
		this.e = e;
		this.next = next;
	}
	
	/**
	 * Returns element stored in Node
	 * @return element stored in Node
	 */
	protected E getElement() {
		return this.e;
	}
	
	/**
	 * Returns Node that is referenced
	 * @return Node that follows
	 */
	protected Node<E> getNext() {
		return this.next;
	}
	
	/**
	 * Changes element that Node stores
	 * @param e element to be stored
	 */
	protected void setElement(E e) {
		this.e = e;
	}
	
	/**
	 * Changes Node that is referenced
	 * @param next Node to be referenced
	 */
	protected void setNext(Node<E> next) {
		this.next = next;
	}

}
