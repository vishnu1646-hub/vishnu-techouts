package innerclass;

public class Car extends Vehicle {
	public static void main(String[] args) {
		Vehicle v=new Car();
		v.run();
		Car c=(Car)v;
		c.carRunning();
		if(v instanceof Car){
			System.out.println("true");
			
		}
	}
	void carRunning(){
		System.out.println("car is running");
	}

}
