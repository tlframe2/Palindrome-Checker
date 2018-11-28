package tyrell_palindrome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A linear collection that supports element insertion at the back and removal at the front
 * @author Tyrell
 * @param <E> type of elements held in collection
 */
public class QueueArrayBased<E> implements QueueInterface<E> {
	
	private final int MAX_QUEUE = 50;
	private ArrayList<E> items;
	private int front, back, count;
	
	/**
	 * Constructs new Queue with fixed capacity
	 */
	public QueueArrayBased() {
		this.items = new ArrayList<E>(MAX_QUEUE);
		this.front = 0;
		this.back = MAX_QUEUE - 1;
		this.count = 0;
		
		for (int i = 0; i < MAX_QUEUE; i++) {
			this.items.add(null);
		}
	}

	/**
	 * Determines if queue is empty
	 * @return true if no elements in queue, otherwise false
	 */
	public boolean isEmpty() {
		return count == 0;
	}
	
	/**
	 * Determines if queue is full
	 * @return true if number of elements in queue equals maximum capacity, otherwise false
	 */
	public boolean isFull() {
		return count == MAX_QUEUE;
	}
	
	/**
	 * Retrieves, but does not remove first element of queue
	 * @return element retrieved
	 * @throws NoSuchElementException if queue is empty
	 */
	public E element() throws NoSuchElementException {
		if (!isEmpty()) {
			return this.items.get(this.front);
		} else {
			throw new NoSuchElementException("NoSuchElementException on element: Queue is empty!");
		}
	}

	/**
	 * Inserts element at the back of queue
	 * @param e element to be added
	 * @return true if element was inserted successfully; otherwise false
	 */
	public boolean offer(E e) {
		if (!isFull()) {
			this.back = (this.back + 1) % (MAX_QUEUE);
			this.items.set(this.back, e);
			this.count++;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Retrieves, but does not remove first element of queue
	 * @return element retrieved or null if queue is empty
	 */
	public E peek() {
		if (!isEmpty()) {
			return this.items.get(this.front);
		} else {
			return null;
		}
	}

	/**
	 * Retrieves and removes first element of queue
	 * @return element retrieved or null if queue is empty
	 */
	public E poll() {
		if (!isEmpty()) {
			E queueFront = this.items.get(this.front);
			this.front = (this.front + 1) % (MAX_QUEUE);
			this.count--;
			return queueFront;
		} else {
			return null;
		}
	}

	/**
	 * Retrieves and removes first element of queue
	 * @return element retrieved
	 * @throws NoSuchElementException if queue is empty
	 */
	public E remove() throws NoSuchElementException {
		if (!isEmpty()) {
			E queueFront = this.items.get(this.front);
			this.front = (this.front + 1) % (MAX_QUEUE);
			this.count--;
			return queueFront;
		} else {
			throw new NoSuchElementException("NoSuchElementException on remove: Queue is empty!");
		}
	}

	/**
	 * Removes all elements from queue
	 */
	public void removeAll() {
		this.items = new ArrayList<E>(MAX_QUEUE);
		this.front = 0;
		this.back = MAX_QUEUE - 1;
		this.count = 0;
	}
	
	/**
	 * Returns number of elements in queue
	 * @return number of elements in queue
	 */
	public int size() {
		return this.count;
	}
	
	/**
	 * Returns an iterator over a set of elements in queue
	 * @return an iterator over a set of elements in queue
	 */
	public Iterator<E> iterator() {
		return new QueueIterator();
	}
	
	/**
	 * Allows queue to be the target of the "foreach" loop
	 * @author Tyrell
	 */
	private class QueueIterator implements Iterator<E> {
		
		// Tracks position in queue
		private int pointer = front;
		private int numIterations = 0;

		/**
		 * Returns true if the iteration has more elements.
		 * @return true if the iteration has more elements; otherwise false
		 */
		public boolean hasNext() {
			return items.get(this.pointer) != null && this.numIterations < size();
		}

		/**
		 * Returns the next element in the iteration.
		 * @return the next element in the iteration
		 * @throws NoSuchElementException if iteration has no more elements
		 */
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			
			E val = items.get(this.pointer);
			
			this.numIterations++;
			
			if (this.pointer == MAX_QUEUE - 1) {
				this.pointer = 0;
			} else {
				this.pointer++;
			}
			
			return val;
		}
		
	}
	
	// The rest of these methods are implemented from the Collection interface but not used
	@Override
	public boolean add(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
