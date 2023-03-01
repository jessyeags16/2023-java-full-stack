package week2;
import java.util.ArrayList;
import java.util.List;
public class DayThreeJavaExamples {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int weeks = 0;
		 int days = 7;

		// outer loop prints weeks
		 for (int i = 1; i <= weeks; ++i) {
		   System.out.println("Week: " + i);

		      // inner loop prints days
		 for (int j = 1; j <= days; ++j) {
		    System.out.println("  Day: " + j);

	}
		 }
		 

	//loop from 1 to 10 
	
		 // for (int num = 0; num <=10; num++) {
			//  System.out.println(num);
		 }
		 
		 
	//loop from 1 to 100 skipping even numbers 
		//  for (int number = 0; number <=100; number++ ) {
			//  if (number%2 == 1) {
				//  System.out.println(number);
			 // }
			  else {
				 //nothing happens
			  }
			 
		 }
		 
	//loop from 10 to 30 showing even nums only and using continue 
		 
		 
		 // create a list of int and use a loop to add the numbers 1 to 10 to the list, 
		 //then use the new style for loop to print the elements in the list
		 //this is the old way...
		 List<Integer> list = new ArrayList<>();
		 for (Integer num = 0; num <=10; num++) {
			 list.add(num);
			 System.out.println();


