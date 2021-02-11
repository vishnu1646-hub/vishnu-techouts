package roughpractice;

public class Lower extends Upper {
	Lower run() {
		System.out.println(" lower is running ");
		return this;
	}

	public static void main(String[] args) {

		Upper upper = new Lower();
		upper.run();

	}

}
