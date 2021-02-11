package roughpractice;

public class ExceptionPropogation {
	void first(){
		int i=50/0;
	}
	void second(){
		first();
	}
	void third(){
		try{
			second();
		}catch(ArithmeticException e){
			System.out.println("exception handled ");
		}
	}

	public static void main(String[] args) {
		ExceptionPropogation e=new ExceptionPropogation();
        e.third();
        
	}

}
