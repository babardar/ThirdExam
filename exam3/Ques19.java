package exam3;

import java.util.Scanner;

public class Ques19 {

	public static void main(String[] args) {
		/* 19.Format the input by using Scanner
		java 76
		cpp 54
		python 675
		================================
		java           076
		cpp            054
		python         675
		================================ */
		 Scanner input=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             String s1=input.next();
             int x=input.nextInt();
             System.out.printf("%-15s%03d%n",s1,x);
         }
        
         System.out.println("================================");
         input.close();
	}

}
