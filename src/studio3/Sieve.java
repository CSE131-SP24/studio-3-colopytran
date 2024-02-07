package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = scan.nextInt();

		int[] numbers = new int[n]; 


		for  (int i=0; i < numbers.length; i++) {

			numbers[i] = i +1;
			//	System.out.println(numbers[i]);

		}

		int a = 2;
		
		for (int b=1; b < numbers.length; b += a) {

			numbers[b] = 0;
			System.out.println(numbers[b]);
			a ++;

		}


	}

}
