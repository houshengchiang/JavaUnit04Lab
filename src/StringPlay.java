/*//////////////////////////////////////////////////////////////*/
/* Author:		Hou Sheng Chiang 								*/
/* Course:		CSC 151 4102 Java								*/
/* Description: 	Lab 04	StringPlay							*/
/*//////////////////////////////////////////////////////////////*/

import java.util.*;
public class StringPlay {

	public static void main(String[] args) {
		
		System.out.println("Enter a line of text");
		Scanner input = new Scanner(System.in);
			
		String aLine = input.nextLine();
		input.close();
		
		//check for leading,trailing spaces
		if ( aLine.equals(aLine.trim()) == true ) {
			System.out.println("The original String has no leading or trailing whitespace.");
		}else {
			System.out.println("The original String has leading or trailing whitespace.");
		}
				
		String first3 = aLine.substring(0, 3);
		String last4 = aLine.substring(aLine.length() - 4);
		String mid = aLine.substring(3 , aLine.length() - 4);
		
		//Swap the first three and last four characters of aLine and print the result.
		System.out.println("First 3 and last 4 chars swapped: " +
							last4 + mid + first3);
		
		//Print aLine in all upper case.
		System.out.println("to upper case: " + aLine.toUpperCase());
				
		//Print the compareTo results of comparing aLine in all lower case with the original aLine.
		int intCompStr = aLine.compareTo(aLine.toLowerCase());
		System.out.println("compareTo lower case version: " +
							intCompStr);
				
		//Print whether the first half of aLine is the same as the last half of aLine except for case.
		String firstHalf = aLine.substring(0, (int)(aLine.length()/2)) ;
		String lastHalf = aLine.substring( (int)(aLine.length()/2) );
		System.out.println(firstHalf+ "\t" + lastHalf);
		System.out.println("Does the first half equal the last half? " + 
							firstHalf.equalsIgnoreCase(lastHalf));
	}
}
