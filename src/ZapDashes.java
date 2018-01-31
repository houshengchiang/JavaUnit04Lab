/*//////////////////////////////////////////////////////////////*/
/* Author:		Hou Sheng Chiang 								*/
/* Course:		CSC 151 4102 Java								*/
/* Description: 	Lab 04	ZapDashes								*/
/*//////////////////////////////////////////////////////////////*/
//Use only String's indexOf, lastIndexOf and substring methods.
import java.util.*;
public class ZapDashes {

	public static void main(String[] args) {
		
		System.out.println("Enter a number includes 2 \"-\" ");
		
		//Scanner input = new Scanner(System.in);
		//String str = input.nextLine();		// input
		
		String str = "123-45-";
		
		System.out.print(str+"\t\t");				//output
			
		//System.out.println(str.indexOf('-') + ',');
		//output = str.indexOf('-') + 44
		//System.out.println(str.indexOf('-') + "," + str.lastIndexOf('-'));		
		
		System.out.print( str.substring(0, (str.indexOf('-'))) +
				str.substring(str.indexOf('-')+1, str.lastIndexOf('-')) +
				str.substring(str.lastIndexOf('-')+1));
					
	}
	
}
