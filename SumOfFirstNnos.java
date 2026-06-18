package SImple;

import java.util.Scanner;

public class SumOfFirstNnos {

	public static void main(String args[]) {
//	 sum of first N numbers
//	 1+2+3+4+5=15

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n = scan.nextInt();// 5 i=6 sum 15 no 5 6<=5

//		for (int i = 1; i <= no; i++) {
//			sum = sum + i;
//		} 
		// sum=(n*(n+1))/2;

		int sum = (n * (n + 1)) / 2;
		System.out.println("sum of fisrt " + n + " no: " + sum);
	}

}
