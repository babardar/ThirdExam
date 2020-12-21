package exam3;

import java.util.HashSet;

public class Ques7 {

	public static void main(String[] args) {
		// 7. Write a program to convert HashSet to Array?
		 HashSet<String> city = new HashSet<String>();
		 city.add("Silver Spring");
		 city.add("Rockville");
		 city.add("Ashburn");
		 city.add("Washinton DC");
	     System.out.println("HashSet contains: "+ city);
	     String[] array = new String[city.size()];
	     city.toArray(array);	     
	     System.out.println("Array elements: ");
	     for(String x:array){
	        System.out.println(x);
	     }

	}

}
