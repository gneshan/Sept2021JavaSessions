package javaPractice;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to count : ");
		int numb=sc.nextInt();
		countTheNumbers(numb);
		sc.close();

	}

	private static void countTheNumbers(int number) {
		int counter=0;
		while (number!=0) {
			number=number/10;
			counter++;
			
		}
		System.out.println("Number of digits in the given number is : " + counter);
	}

}
