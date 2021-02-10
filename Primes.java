package innerclass;

import java.util.Scanner;

public class Primes {
	
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number to find prime: ");
		int toFind=scanner.nextInt();
		int sum=1;
		for (int i = 2; i < toFind-1; i++) {
		    if(toFind%i==0){
		    	sum=sum+1;
		    }
		}
		if(sum==1){
			System.out.println("given number "+toFind+" is a prime");
			
		}else{
			System.out.println("given number "+toFind+" is a not a prime");
			
		}
		

	}

}
