package innerclass;

public class OuterClass1 {
	 
	void innerMethod(){
		int num=10;
		class InnerMethod{
			public void print(){
				System.out.println("method-innerclass-inner method: "+num);
			}
		}
		InnerMethod im=new InnerMethod();
		im.print();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 oc1=new OuterClass1();
		oc1.innerMethod();

	}

}
