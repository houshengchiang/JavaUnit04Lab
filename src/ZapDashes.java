//Use only String's indexOf, lastIndexOf and substring methods.


import java.util.*;
public class ZapDashes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a phone number: ");
		//String str = input.nextLine();		// input	xxx-xxx-xxxx
		
		String str = "12345--";
		
		System.out.println(str);				//output	xxx-xxx-xxxx
			
		System.out.println(str.indexOf('-') + ',');		//3
		System.out.println(str.lastIndexOf('-'));		//7
		
		System.out.println( str.substring(0, (str.indexOf('-'))) +
				str.substring(str.indexOf('-')+1, str.lastIndexOf('-')) +
				str.substring(str.lastIndexOf('-')+1));
		
		//System.out.println(str);
			
	}
	
}
