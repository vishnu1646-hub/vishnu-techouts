package roughpractice;

public class OverloadingImplementation extends Overloading{
	public void car(){
		System.out.println("overloaded car is running ");
	}
	public static void main(String[] args) {
		OverloadingImplementation o=new OverloadingImplementation();
		o.car();
	}

}
