package tyrell_palindrome;

import java.util.NoSuchElementException;

/**
 * Tests all of the methods for each class in Palindrome package
 * @author Tyrell
 */
public class TestDriver {

	/**
	 * Executes tests for QueueArrayBased class
	 * @param args
	 */
	public static void main(String[] args) {
		
		testQueueArrayBased();
		testStackReferenceBased();
		testPalindrome();

	}
	
	/**
	 * Tests each method in QueueArrayBased class
	 */
	public static void testQueueArrayBased() {
		System.out.println("******************************************************");
		System.out.println("Beginning QueueArrayBased test...\n");
		
		System.out.println("Creating QueueArrayBased object 'testQueue'...\n");
		QueueArrayBased<Integer> testQueue = new QueueArrayBased<Integer>();
		
		System.out.println("Testing isEmpty method on empty stack 'testQueue'...");
		System.out.println("isEmpty returns true on 'testQueue': " + testQueue.isEmpty());
		System.out.println("peek method returns null: " + (testQueue.peek() == null));
		System.out.println("poll method returns null: " + (testQueue.poll() == null));
		
		System.out.println("\nAdding Integer object '1' to 'testQueue' using offer method...");
		testQueue.offer(1);
		System.out.println("'testQueue' is no longer empty: " + !testQueue.isEmpty());
		
		System.out.println("\nTesting element method on 'testQueue'...");
		System.out.println("element returns '1': " + (testQueue.element().equals(1)));
		
		System.out.println("\nTesting remove method on 'testQueue'...");
		System.out.println("remove returns '1': " + (testQueue.remove().equals(1)));
		System.out.println("'testQueue' is empty: " + testQueue.isEmpty());
		
		System.out.println("\nAdding Integer object '2' to 'testQueue' using offer method...");
		testQueue.offer(2);
		System.out.println("Adding Integer object '3' to 'testQueue' using offer method...");
		testQueue.offer(3);
		System.out.println("Adding Integer object '4' to 'testQueue' using offer method...");
		testQueue.offer(4);
		
		System.out.println("\nTesting peek method on 'testQueue'...");
		System.out.println("peek returns '2': " + (testQueue.peek().equals(2)));
		
		System.out.println("\nTesting poll method on 'testQueue'...");
		System.out.println("poll returns '2': " + (testQueue.poll().equals(2)));
		
		System.out.println("\nTesting peek method on 'testQueue'...");
		System.out.println("peek returns '3': " + (testQueue.peek().equals(3)));
		
		System.out.println("\nTesting poll method on 'testQueue'...");
		System.out.println("poll returns '3': " + (testQueue.poll().equals(3)));
		
		System.out.println("\nTesting peek method on 'testQueue'...");
		System.out.println("peek returns '4': " + (testQueue.peek().equals(4)));
		
		System.out.println("\nAdding Integer object '5' to 'testQueue' using offer method...");
		testQueue.offer(5);
		
		System.out.println("\nTesting poll method on 'testQueue'...");
		System.out.println("poll returns '4': " + (testQueue.poll().equals(4)));
		
		System.out.println("\nTesting poll method on 'testQueue'...");
		System.out.println("poll returns '5': " + (testQueue.poll().equals(5)));
		System.out.println("'testQueue' is empty: " + testQueue.isEmpty());
		
		System.out.println("\nFilling 'testQueue' with Integers 0 through 49");
		for (int i = 0; i < 50; i++) {
			testQueue.offer(i);
		}
		
		System.out.println("Printing contents of 'testQueue' using iterator...");
		for (Integer element: testQueue) {
			System.out.print(element + ",");
		}
		
		System.out.println("\n\n'testQueue' is full: " + testQueue.isFull());
		
		System.out.println("Attempting to add Integer object '50' to full Queue (should fail)...");
		System.out.println("offer method unsuccessfully adds '50' to full Queue: " + !testQueue.offer(50));
		
		System.out.println("\nTesting removeAll method on 'testQueue'...");
		testQueue.removeAll();
		System.out.println("'testQueue' is empty: " + testQueue.isEmpty());
		
		System.out.println("\nAttempting to use element method on empty Queue (should fail)...");
		try {
			testQueue.element();
		} catch(NoSuchElementException e) {
			System.out.println("Caught NoSuchElementException");
		}
		
		System.out.println("\nAttempting to use remove method on empty Queue (should fail)...");
		try {
			testQueue.remove();
		} catch(NoSuchElementException e) {
			System.out.println("Caught NoSuchElementException");
		}
		
		System.out.println("\nQueueArrayBased test finished!");
		System.out.println("******************************************************\n");
	}
	
	/**
	 * Tests each method in StackReferenceBased class
	 */
	public static void testStackReferenceBased() {
		System.out.println("******************************************************");
		System.out.println("Beginning StackReferenceBased test...\n");
		
		System.out.println("Creating StackReferenceBased object 'testStack'...\n");
		StackReferenceBased<Integer> testStack = new StackReferenceBased<Integer>();
		
		System.out.println("Testing isEmpty method on empty stack 'testStack'...");
		System.out.println("isEmpty returns true on 'testStack': " + testStack.isEmpty());
		
		System.out.println("\nAdding Integer object '1' to 'testStack' using push method...");
		testStack.push(1);
		System.out.println("'testStack' is no longer empty: " + !testStack.isEmpty());
		
		System.out.println("\nTesting peek method on 'testStack'...");
		System.out.println("peek returns '1': " + (testStack.peek().equals(1)));
		
		System.out.println("\nTesting pop method on 'testStack'...");
		System.out.println("pop returns '1': " + (testStack.pop().equals(1)));
		System.out.println("'testStack' is empty: " + testStack.isEmpty());
		
		System.out.println("\nAdding Integer object '2' to 'testStack' using push method...");
		testStack.push(2);
		System.out.println("Adding Integer object '3' to 'testStack' using push method...");
		testStack.push(3);
		System.out.println("Adding Integer object '4' to 'testStack' using push method...");
		testStack.push(4);
		
		System.out.println("\nTesting peek method on 'testStack'...");
		System.out.println("peek returns '4': " + (testStack.peek().equals(4)));
		
		System.out.println("\nTesting pop method on 'testStack'...");
		System.out.println("pop returns '4': " + (testStack.pop().equals(4)));
		
		System.out.println("\nTesting peek method on 'testStack'...");
		System.out.println("peek returns '3': " + (testStack.peek().equals(3)));
		
		System.out.println("\nTesting pop method on 'testStack'...");
		System.out.println("pop returns '3': " + (testStack.pop().equals(3)));
		
		System.out.println("\nTesting peek method on 'testStack'...");
		System.out.println("peek returns '2': " + (testStack.peek().equals(2)));
		
		System.out.println("\nAdding Integer object '5' to 'testStack' using push method...");
		testStack.push(5);
		
		System.out.println("\nTesting peek method on 'testStack'...");
		System.out.println("peek returns '5': " + (testStack.peek().equals(5)));
		
		System.out.println("\nTesting popAll method on 'testStack'...");
		testStack.popAll();
		System.out.println("'testStack' is empty: " + testStack.isEmpty());
		
		System.out.println("\nAttempting to peek empty stack...");
		try {
			testStack.peek();
		} catch(StackException e) {
			System.out.println("Stack is empty!");
		}
		
		System.out.println("\nAttempting to pop empty stack...");
		try {
			testStack.pop();
		} catch(StackException e) {
			System.out.println("Stack is empty!");
		}
		
		System.out.println("\nStackReferenceBased test finished!");
		System.out.println("******************************************************\n");
	}
	
	/**
	 * Tests Palindrome class
	 */
	public static void testPalindrome() {
		
		System.out.println("******************************************************");
		System.out.println("Beginning Palindrome test...\n");
		
		System.out.println("Testing to determine if 'a' is a palindrome (should pass)...");
		System.out.println("'a' is a palindrome: " + Palindrome.isPali("a"));
		
		System.out.println("\nTesting to determine if 'ABBA' is a palindrome (should pass)...");
		System.out.println("'ABBA' is a palindrome: " + Palindrome.isPali("ABBA"));
		
		System.out.println("\nTesting to determine if 'Racecar' is a palindrome (should pass)...");
		System.out.println("'Racecar' is a palindrome: " + Palindrome.isPali("Racecar"));
		
		System.out.println("\nTesting to determine if 'Taco Cat' is a palindrome (should pass)...");
		System.out.println("'Taco Cat' is a palindrome: " + Palindrome.isPali("Taco Cat"));
		
		System.out.println("\nTesting to determine if 'Mr. Owl Ate My Metal Worm' is a palindrome (should pass)...");
		System.out.println("'Mr. Owl Ate My Metal Worm' is a palindrome: " + Palindrome.isPali("Mr. Owl Ate My Metal Worm"));
		
		System.out.println("\nTesting to determine if 'Eva, Can I Stab Bats In A Cave?' is a palindrome (should pass)...");
		System.out.println("'Eva, Can I Stab Bats In A Cave?' is a palindrome: " + Palindrome.isPali("Eva, Can I Stab Bats In A Cave?"));
		
		System.out.println("\nTesting to determine if 'A Man, A Plan, A Canal-Panama!' is a palindrome (should pass)...");
		System.out.println("'A Man, A Plan, A Canal-Panama!' is a palindrome: " + Palindrome.isPali("A Man, A Plan, A Canal-Panama!"));
		
		System.out.println("\nTesting to determine if '1a3b3a1' is a palindrome (should pass)...");
		System.out.println("'1a3b3a1' is a palindrome: " + Palindrome.isPali("1a3b3a1"));
		
		System.out.println("\nTesting to determine if 'abcdcab' is a palindrome (should fail)...");
		System.out.println("'abcdcab' is not a palindrome: " + !Palindrome.isPali("abcdcab"));
		
		System.out.println("\nTesting to determine if 'Hello, Oleh!' is a palindrome (should fail)...");
		System.out.println("'Hello, Oleh!' is not a palindrome: " + !Palindrome.isPali("Hello, Oleh!"));
		
		System.out.println("\nPalindrome test finished!");
		System.out.println("******************************************************\n");
		
	}

}
