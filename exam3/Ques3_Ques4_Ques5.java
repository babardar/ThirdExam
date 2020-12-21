package exam3;

import java.util.ArrayList;
import java.util.Collections;

public class Ques3_Ques4_Ques5 {

	public static void main(String[] args) {
		// 3. Write a program to sort ArrayList in descending order?
		// 4. Write a program to add element at particular index of ArrayList?
		//5.Write a program to remove element from specified index of ArrayList?
        ArrayList<Integer> number = new ArrayList<Integer>(); 
        number.add(10); 
        number.add(50); 
        number.add(200); 
        number.add(65); 
        number.add(4);
        System.out.println("Unsorted ArrayList: " + number); 
        Collections.sort(number, Collections.reverseOrder()); 
        System.out.println("Ques3: Sorted in Descending order: " + number); 
        number.add(2, 2000);
        System.out.println("Ques4: Adding element to index 2: " + number);
        number.remove(0);
        System.out.println("Ques5: Removing element from index 0: " + number);
        
        
	}

}
