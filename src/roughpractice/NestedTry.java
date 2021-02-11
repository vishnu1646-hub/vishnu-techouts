package roughpractice;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			try {
				System.out.println(" first nested try block ");
				int data = 50 / 0;

			} catch (ArithmeticException e) {
				System.out.println("1st nested :" + e);
			}
			try {
				System.out.println("second nested try block");
				int[] i = new int[5];
				System.out.println(i[10]);
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("2nd nested :" + a);
			}

		} catch (Exception e1) {
			System.out.println(e1);
		}

	}

}
