package CollectionExamples;

public class T2_Batsman2 extends Batsman2 {
	public static void main(String[] args) {
		Batsman2 b = new Batsman2("rohith sharma", 345, 76, 154, 2000, 544, 432);

		System.out.println("Name : " + b.getName());
		System.out.println("Runs Scored : " + b.getRunsScored());
		System.out.println("Balls Faced : " + b.getBallsFaced());
		System.out.println("Centuries : " + b.getCenturies());
		System.out.println("Half Centuries : " + b.getHalfCenturies());
		System.out.println("Fours : " + b.getFours());
		System.out.println("Sixes : " + b.getSixes());

	}

}
