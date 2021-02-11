package roughpractice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AboutException2 {
	public static void main(String[] args) {
		PrintWriter pw;
		try{
			pw=new PrintWriter("jpt.txt");
		    pw.println("saved");
		}catch(FileNotFoundException f){
			System.out.println(f);
			f.printStackTrace();
		}
		System.out.println("file saved succesfully");
		
	}

}
