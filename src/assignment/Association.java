package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Association {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Company company = new Company("Techouts");
		List eN = new ArrayList<>();
		List eR = new ArrayList<>();
		List sY = new ArrayList<>();
		System.out.println("enter employee name: ");
		String name = scanner.nextLine();
		eN.add(name);
		System.out.println("enter employee rating :");
		int rating = scanner.nextInt();
		eR.add(rating);
		System.out.println("enter start year of employee :");
		int startYear = scanner.nextInt();
		sY.add(startYear);
		Employee e=new Employee(rating,startYear,name);
        System.out.println("company :"+company.getCompanyName());
        System.out.println(e.getEmployeeDetails());

		

	}

}
