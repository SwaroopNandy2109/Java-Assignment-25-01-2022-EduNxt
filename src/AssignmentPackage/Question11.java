//WAP to calculate and display the factorial of a no entered by user.
package AssignmentPackage;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if (n == 0)
			System.out.println("The factorial of the number = 1");
		else {
			int fact = 1;
			while (n > 1) {
				fact *= n;
				n--;
			}
			System.out.println("The factorial of the number = " + fact);
		}
		sc.close();
	}

}
