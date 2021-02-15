package CollectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class E3 {
	public static void main(String[] args) {
		ArrayList hS=new ArrayList<>();
		hS.add("balaji");
		hS.add("raja");
		hS.add("rani");
		hS.add("someone");
		hS.add("venkatesha");
		ListIterator<String> l1 = hS.listIterator();
		
		while(l1.hasNext()){
			System.out.println(l1.next());
		}
		
		hS.forEach(a->{
			
			System.out.println(a);
		});
		System.out.println("******************");
		Iterator i = hS.iterator();
		i.forEachRemaining(a->{
			System.out.println(a);
		});
		
		

	}

}
