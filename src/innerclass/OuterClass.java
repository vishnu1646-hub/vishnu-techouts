package innerclass;

public class OuterClass {
	
	private class InnerClass{
		public void access1(){
		System.out.println("this is innerclass");
		}
	}
	
	void refer()
	{
		InnerClass i=new InnerClass();
		i.access1();
		
	}
}
