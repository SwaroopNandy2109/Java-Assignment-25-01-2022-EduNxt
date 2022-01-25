//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
package AssignmentPackage;

import java.util.Scanner;

public class Question13 {
	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("The prime numbers in this range are:");
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
		sc.close();
	}

}
