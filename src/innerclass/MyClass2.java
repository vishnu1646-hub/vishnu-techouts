package innerclass;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    AccessPrivateMembers apm=new AccessPrivateMembers();
		    AccessPrivateMembers.Inner i=apm.new Inner();
		    System.out.println(i.getNum());

	}

}
