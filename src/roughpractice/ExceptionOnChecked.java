package roughpractice;

import java.io.IOException;

public class ExceptionOnChecked {
	void first() throws IOException{
		throw new IOException("device error ");
		
	}
	void second() throws IOException{
		first();
	}
	void third(){
		try{
			second();
		}catch(IOException e){
			System.out.println("exception handled ");
		}
		
	}
	public static void main(String[] args) {
		ExceptionOnChecked e=new ExceptionOnChecked();
		e.third();
	}

}
