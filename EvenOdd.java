package Day5Practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		if (num %2 == 0) {
			System.out.println("The given number is Even....");
			
		}
		else {
			System.out.println("The given number is Odd........");
		}

	}

}