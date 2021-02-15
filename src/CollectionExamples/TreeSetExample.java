package CollectionExamples;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Book> tS = new TreeSet<Book>();
		Book b1 = new Book(3, "subconsciousmind", "josephmurphy", "mcGrew", 100);
		Book b2 = new Book(1, "outofbox", "sudhamurthy", "tata", 200);
		Book b3 = new Book(2, "alchemist", "paulo", "birla", 50);
		tS.add(b1);
		tS.add(b2);
		tS.add(b3);
		for (Book book : tS) {
			System.out.println(
					book.id + "-" + book.bookName + "-" + book.author + "-" + book.publisher + "-" + book.quantity);
		}

	}

}
