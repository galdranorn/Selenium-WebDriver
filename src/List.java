import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public void ListExercises() {
		
		// Difference between array and linked list
		// is the speed of save/load data
		
		ArrayList listStr = new ArrayList();
		listStr.add("jeden");
		listStr.add("dwa");
		listStr.add("trzy");
		
		LinkedList linkList = new LinkedList();
		linkList.add("a");
		linkList.add("b");
		linkList.add("c");
		
		// Lists methods examples
		
		System.out.println("Index of trzy is "+listStr.indexOf("trzy"));
		System.out.println("Is list empty? "+linkList.isEmpty());
		linkList.clear();
		System.out.println("Is list empty after clear? "+linkList.isEmpty());
		
		for (int x=0; x< listStr.size(); x++) {
			System.out.println("X: "+listStr.get(x));
		}
	}
	
}
