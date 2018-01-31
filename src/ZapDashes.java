//Use only String's indexOf, lastIndexOf and substring methods.
import java.util.*;
public class ZapDashes {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter a phone number: ");
		
		//Scanner input = new Scanner(System.in);
		//String str = input.nextLine();		// input
		
		String str = "12345--";
		
		System.out.println(str);				//output
			
		System.out.println(str.indexOf('-') + ',');		
		System.out.println(str.lastIndexOf('-'));		
		
		System.out.println( str.substring(0, (str.indexOf('-'))) +
				str.substring(str.indexOf('-')+1, str.lastIndexOf('-')) +
				str.substring(str.lastIndexOf('-')+1));
		
		//System.out.println(str);
			
	}
	
}
