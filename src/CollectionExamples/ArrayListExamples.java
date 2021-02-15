package CollectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {
	public static void main(String[] args) throws Exception {
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("balaji");
		aL.add("pavan");
		aL.add("srikanth");
		aL.add("ajay");
		aL.add("purnami");
		Iterator iL = aL.iterator();
		while (iL.hasNext()) {
			System.out.println(iL.next());
			Thread.sleep(3000);
		}
		for (String string : aL) {
			System.out.println(string);
		}
	}

}
