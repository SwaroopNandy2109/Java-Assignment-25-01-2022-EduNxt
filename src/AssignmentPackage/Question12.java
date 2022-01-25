//WAP to check whether the no entered by user is prime or not.
package AssignmentPackage;

import java.util.Scanner;

public class Question12 {
	public static boolean isPrime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		String isPrime = isPrime(n)?"is":"is not";
		System.out.println("It "+isPrime+" a prime number.");
		sc.close();
	}

}
