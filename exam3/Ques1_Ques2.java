package exam3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Ques1_Ques2 {

	public static void main(String[] args) {
		//1.Write a program to iterate the HashMap?
		// 2.Write a program to sort HashMap by keys?
		HashMap<String,Integer> salary= new HashMap<String,Integer>();
		salary.put("Ali", 6000);
		salary.put("Java", 10000);
		salary.put("Rohan", 7000);
		salary.put("Null", 4000);
		salary.put("Null", 3500);
		salary.put("Omar", null);
		salary.put("Zee", 5000);
		salary.put("Nick", 9000);
		System.out.println("Ques1: Iterating HashMap");
		Set x = salary.entrySet();
		Iterator it= x.iterator();
		while(it.hasNext()) {
			Map.Entry mentry = (Map.Entry)it.next();
			System.out.println("key is: "+ mentry.getKey() + " & Value is: " + mentry.getValue());	      
			
		}
		// 2.Write a program to sort HashMap by keys?
		System.out.println(" ");
		System.out.println("Ques2: Sorting HasMap");
		TreeMap<String, Integer> sorted = new TreeMap<>(salary);
		for (Map.Entry<String, Integer> entry : sorted.entrySet())  
            System.out.println("Key is: " + entry.getKey() +  " & Value is: " + entry.getValue());
	}
}
