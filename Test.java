
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		
		//Variables
		Scanner scan = new Scanner(System.in);
		String userIn = "start";
		Set linkedList = new Set();   // establish new linkedList data set
		
		//apply methods of Set Class based on user input
		while (userIn != null) {
			
			System.out.print("Enter command: ");
			userIn = scan.nextLine();
			
			if (userIn.contains("add")) {
				linkedList.addValue(userIn,linkedList);
				
			}else if (userIn.contains("del")) {
				linkedList.deleteValue(userIn,linkedList);
			}
				
			    
		}	
			
			
		scan.close();
	}

}
