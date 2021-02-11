package innerclass;

class AccessPrivateMembers {
      //access private members of class using inner class
	  private int num=10;
	  public class Inner{
		  public int  getNum(){
			  System.out.println("this is inner class");
			  return num;
		  }
	  }
}
