package SImple;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a No:");
		int no = scan.nextInt();
		// 1 modulo
//       if(no%2==0) {
//    	   System.out.println(no+" This is a Even No");
//       }else {
//    	   System.out.println(no+" This is a Odd No"); 
//       }
		// by bitwise operators

		if ((no & 1) == 0) {
			 System.out.println(no+" This is a Even No");
		}else {
			 System.out.println(no+" This is a Odd No");
		}

	}
}