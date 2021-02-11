package roughpractice;

public class RoughException{
	static void age(int i) throws CustomException{
		if(i<18){
			throw new CustomException("invalid");
		}else{
			System.out.println("eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		try{
			age(12);
		}catch(Exception e){
			System.out.println("exception occured :"+e);
		}
		System.out.println("continues.....");
		
	}

}
