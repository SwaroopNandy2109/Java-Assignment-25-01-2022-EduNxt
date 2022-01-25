//WAP to generate the reverse of a given number N. Print the corresponding reverse number.
package AssignmentPackage;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		while(n>0) {
			rev=(rev*10)+(n%10);
			n/=10;
		}
		System.out.println("The reverse of the number = "+rev);
		sc.close();
	}

}
