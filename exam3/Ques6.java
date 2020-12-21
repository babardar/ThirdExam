package exam3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Ques6 {

	public static void main(String[] args) {
		//6.Write a program to convert LinkedList to ArrayList?
		LinkedList<String> color = new LinkedList<String>();
		color.add("Black");
		color.add("Blue");
	    color.add("White");
	    color.add("Green");
	    color.add("Orange");
	    System.out.println("LinkedList Element: "+ color);
	    List<String> list = new ArrayList<String>(color);
	    System.out.println("");
	    System.out.println("ArrayList Element:");
	    for (String x:list){
	      System.out.println(x);
	    }

	}

}
