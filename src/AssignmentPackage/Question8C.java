/*
for n=5
    *
   **
  ***
 ****
*****
*/
package AssignmentPackage;

import java.util.Scanner;

public class Question8C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= n-i+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		sc.close();
	}

}
