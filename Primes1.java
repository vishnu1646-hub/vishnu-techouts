package innerclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primes1 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the count of prime numbers : ");
		int toFindUpto = scanner.nextInt();
		System.out.println("enter the nth number to find in prime");
		int nT = scanner.nextInt();
		int nTH = nT - 1;
		int sum = 1;
		List li = new ArrayList<>();
		for (int i = 2; i < toFindUpto - 1; i++) {

			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					sum = sum + 1;
				}
			}

			if (sum == 1) {
				li.add(i);
			}
			sum = 1;
		}
		System.out.println("the nth prime number is:");
		System.out.println(li.get(nTH));

	}

}
