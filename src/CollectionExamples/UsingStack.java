package CollectionExamples;

import java.util.Iterator;
import java.util.Stack;

public class UsingStack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("ajay");
		stack.push("purnami");
		stack.push("balaji");
		stack.push("pavan");
		stack.push("srikanth");

		Iterator i = stack.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
