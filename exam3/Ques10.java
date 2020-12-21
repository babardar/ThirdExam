package exam3;

public class Ques10 {

	//	Write a program using StringBuilder/StringBuffer?
				
		public static void country(StringBuilder x)  { 
		x.append("America"); 
	    } 
		public static void world(StringBuffer y) { 
		y.append("Earth"); 
		} 
		public static void main(String[] args)  { 
		StringBuilder x = new StringBuilder("Hello World, This is "); 
		country(x); 
		System.out.println("StringBuilder: " + x); 
		StringBuffer y = new StringBuffer("We think we are Greatest Nation on "); 
		world(y); 
		System.out.println("StringBuffer: " + y); 
		} 


}
