package CollectionExamples;

public class Book implements Comparable<Book> {
	int id;
	String bookName,author,publisher;
	int quantity;
	public Book(int id, String bookName, String author, String publisher, int quantity) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Book b) {
		if(id>b.id){
			return 1;
		}else if(id<b.id){
			return -1;
		}else{
			return 0;
		}
	}
	
	

}
