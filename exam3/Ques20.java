package exam3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Ques20 {

		private static final String s = null;
		/*  Convert Roman number into Integer
	 	I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		 */
		
 public static void main(String[] args) {

	    Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
		ht.put('I',1);
		ht.put('V',5);
		ht.put('X',10);
		ht.put('L',50);
		ht.put('C',100);
		ht.put('D',500);
		ht.put('d',500);
		System.out.println(ht);
	       }

	 
}	

