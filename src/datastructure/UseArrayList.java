package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	/** INSTRUCTIONS
	 *
	 * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
	 * Use For-Each loop and While-loop with Iterator to retrieve the data.
	 *
	 * Store and retrieve the data from/to a database table.
	 */

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Steve");
		arrList.add("Tim");
		arrList.add("Lucy");
		arrList.add("Pat");
		arrList.add("Angela");
		arrList.add("Tom");

		arrList.add(2,"hemal");
		arrList.remove(1);
		System.out.println(arrList);

	}

}
