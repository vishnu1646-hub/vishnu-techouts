package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;

public class E2 {
	public static void main(String[] args) {
		ArrayList e=new ArrayList<>();
		e.add(1);
		e.add(5);
		e.add(7);
		e.add(2);
		Collections.sort(e);
		Collections.reverse(e);
		for (Object object : e) {
			System.out.println(object);
		}
	}

}
