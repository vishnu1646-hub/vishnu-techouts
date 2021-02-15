package CollectionExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialization {
	public static void main(String[] args) {
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("balaji");
		aL.add("jaganatha");
		aL.add("subramanya");
		try {
			// serialization
			FileOutputStream fO = new FileOutputStream("file");
			ObjectOutputStream oS = new ObjectOutputStream(fO);
			oS.writeObject(aL);
			fO.close();
			oS.close();
			// De-serialization
			FileInputStream fI = new FileInputStream("file");
			ObjectInputStream oI = new ObjectInputStream(fI);
			ArrayList alL = (ArrayList) oI.readObject();
			System.out.println(alL);

		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
