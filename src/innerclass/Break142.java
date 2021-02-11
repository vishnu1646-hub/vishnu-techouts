package innerclass;

public class Break142 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 2 && j == 0)
					break;

				System.out.println(i + " " + j);
			}
		}
	}

}
