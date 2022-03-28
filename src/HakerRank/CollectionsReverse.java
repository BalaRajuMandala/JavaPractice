package HakerRank;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsReverse {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		
        LinkedList ll = new LinkedList();

        // By using add() method to add few elements in a lits
        ll.add(10);
        ll.add(30);
        ll.add(70);
        ll.add(60);
        ll.add(50);
        
        Collections.reverse(ll);
        ll.forEach(data -> System.out.print(data+" "));
	}

}
