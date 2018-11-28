package tyrell_palindrome;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * A linear collection that supports element insertion at the back and removal at the front
 * @author Tyrell
 * @param <E> type of elements held in collection
 */
public interface QueueInterface<E> extends Collection<E> {
	
	/**
	 * Retrieves, but does not remove first element of queue
	 * @return element retrieved
	 * @throws NoSuchElementException if queue is empty
	 */
	public E element() throws NoSuchElementException;
	
	/**
	 * Retrieves, but does not remove first element of queue
	 * @return element retrieved or null if queue is empty
	 */
	public E peek();
	
	/**
	 * Inserts element at the back of queue
	 * @param e element to be added
	 * @return true if element was inserted successfully; otherwise false
	 */
	public boolean offer(E e);
	
	/**
	 * Retrieves and removes first element of queue
	 * @return element retrieved or null if queue is empty
	 */
	public E poll();
	
	/**
	 * Retrieves and removes first element of queue
	 * @return element retrieved
	 * @throws NoSuchElementException if queue is empty
	 */
	public E remove() throws NoSuchElementException;

}
