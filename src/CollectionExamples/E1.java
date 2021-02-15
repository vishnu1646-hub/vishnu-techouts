package CollectionExamples;

import java.util.HashSet;
import java.util.Iterator;

public class E1 {
	public static void main(String[] args) {
		HashSet hS=new HashSet<>();
		hS.add("balaji");
		hS.add("raja");
		hS.add("rani");
		hS.add("someone");
		hS.add("balaji");
		
		Iterator i = hS.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		
	}

}
