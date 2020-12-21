package exam3;

import java.util.ArrayList;
import java.util.Collections;

public class Ques8 {

	public static void main(String[] args) {
		// 8.Write a program to reverse ArrayList in java?
		ArrayList<Integer> x= new ArrayList <Integer>();
		x.add(50);
		x.add(20);
		x.add(6);
		x.add(55);
		x.add(58);
		Collections.reverse(x);
		System.out.println("Reverse ArrayList: " + x);
	} 

}
