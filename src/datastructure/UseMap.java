package datastructure;

import databases.ConnectToSqlDB;
import java.util.*;

//import java.util.HashMap;
//import java.util.Iterator;

public class UseMap {

	/** INSTRUCTIONS
	 *
	 * Implement code to demonstrate how to interact with a database connection, using a Map
	 * You must insert the map into a table, and then you must submit & execute a query to retrieve
	 * all the submitted data (retrieval does not need to be stored as a map - you can use any data structure)
	 *
	 * Use For-Each loop and While-loop with Iterator to retrieve data.
	 */

	public static void main(String[] args) throws Exception {

		HashMap<Object, Object> map = new HashMap<>();
		map.put(8454, "lamia");
		map.put(4567, "azar");
		map.put(7898, "rahim");

		// Retrieving "Keys" & "Values" using an Iterator
		Iterator<Object> mapLiter = map.keySet().iterator();
		Object key;
		while (mapLiter.hasNext()) {
			key = mapLiter.next();
			System.out.println("KEY: " + key);
			System.out.println("VALUE: " + map.get(key));
		}

		String tableName = "`test_hash_map`";
		ConnectToSqlDB sql = new ConnectToSqlDB();



	}
}