
public class Set {

	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Count tracks the number of nodes in the list

	// Constructor - initializes the front and count variables for the linked list
	Set() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}
	
	//===========================================
	// Add values method
	//===========================================
	
	public void addValue(String input, Set list) {  //accepts user inputs as a string and the data (linkedList) as parameters 
		
		//Variables
		String[] arrayIn = input.split(" ");  //establish String array holding user inputs 
		
		if (arrayIn.length< 2 || arrayIn[0].equals("")) {
			return;  //return to menu if input is less than 2 terms or operator [0] is lacking  need to add return for not add, exists, del
		}
		
		int add; //value user wants added to set
		add = Integer.parseInt(arrayIn[1]); //parse "add" from user input
		
		int count2 = list.count; //separate counter2 for processing linkedList 
		LinkedNode currentNode = list.front; //node tracker pointing to the first node of linkedList
		
		String Found = null;   //variable for locating existing string
		
		
		//unique value assessment
		for (count2= list.count; count2 >= 0; count2--) {  //scroll through set count2 (arrayIn)   
			if (count == 0) { // linkedList count, 1st entry
				list.push(add);
				System.out.println(list);
				Found = "true";
				break;
				
			}else if (currentNode.x == add) { //if number already exists in set- denotes "true"
				Found = "true";
				System.out.println(list);
				break;
				
			}else {
				currentNode = currentNode.next; //otherwise, look at next node
				count2--;
			}
			
			if (Found != "true") {  //only add unique values to set
				list.push(add);
				System.out.println(list);
			}
		}
		
		
	}
	
	//===================================================
	// Delete values method
	//===================================================
	
	public void deleteValue(String input, Set list) {
		
	
				//Variables
				String[] arrayIn = input.split("");  //establish String array holding user inputs 
				
				if (arrayIn.length< 2 || arrayIn[0].equals("")) {
					return;  //return to menu if input is less than 2 terms or operator [0] is lacking  need to add return for not add, exists, del
					}
				
				int del; //value user wants deleted from set
				del = Integer.parseInt(arrayIn[1]); //parse "del" from user input (user integer input resides at index 1)
				
				int count3 = 0;
				LinkedNode currentNode = list.front; //node tracker pointing to the first node of linkedList
				
				
				
				//check if value to delete is in linkedList
				while (currentNode.x != del) {
					if (currentNode.x != del) {
					 currentNode = currentNode.next;  //advance checker when input (del) is not found
					 count3++;
					 
					 if (currentNode.next== null) {  //reaching end of linkedList w/out finding del
						 System.out.println(list);
						 return;
					 } 
					}
				  }
		
				// delete by setting node to null
					
			}
	
	
}
