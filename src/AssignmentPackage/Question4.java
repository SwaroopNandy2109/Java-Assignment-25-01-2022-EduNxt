//WAP to find weather the character entered by user is a vowel or not.(solve by using if..else and switch case)
package AssignmentPackage;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("It is a vowel");
		} else
			System.out.println("It is not a vowel");
		sc.close();
	}

}
