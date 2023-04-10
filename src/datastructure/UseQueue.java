package datastructure;
import java.util.*;
public class UseQueue {

	/** INSTRUCTIONS
	 *
	 * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
	 *
	 * Use For-Each loop and While-Loop with Iterator to retrieve data.
	 *
	 * Store and retrieve data from/to a database table.
	 */


	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("JAVA");
		queue.add("JAVA SWING");
		queue.add("JAVA SPRING");
		queue.add("JAVA MICRO SYSTEM");
		queue.add("JAVA WEB API");
		System.out.println("head: " + queue.element());
		System.out.println("head: " + queue.peek()); //this will peek JAVA from the queue as it was set to head.
		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator(); //this prints all the elements from the queue. REMEMBER, we just piceek an index value JAVA.
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove(); //here we are removing  element from the QUEUE
		queue.poll(); // now we polled another elemnt from the QUEUE. it acts almost like remove.
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();  //so finally we have three values here.
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}