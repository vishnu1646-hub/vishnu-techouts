package roughpractice;

public class GarbageTest {
	public static void main(String[] args) {
		GarbageTest g1 = new GarbageTest();
		GarbageTest g2 = new GarbageTest();

		g1 = null;
		System.gc();

		g2 = null;
		Runtime.getRuntime().gc();

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(" garbage collection occured to object:" + this);
	}

}
