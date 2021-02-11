package roughpractice;

public class AboutStaticFinal {
	static final int VALUE1;
	static {
		VALUE1 = 10;
	}

	public static void main(String[] args) {
		System.out.println(AboutStaticFinal.VALUE1);
	}

}
