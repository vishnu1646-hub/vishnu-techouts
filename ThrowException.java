package roughpractice;

public class ThrowException {
	public static void validate(int i){
		if(i<18){
			throw new ArithmeticException("not valid");
		}else{
			System.out.println("eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(17);

	}

}
