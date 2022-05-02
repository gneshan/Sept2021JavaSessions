package javaPractice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int number=sc.nextInt();
	sumOfDigitsInNumber(number);
	sc.close();
	}

	private static void sumOfDigitsInNumber(int number) {
		int sum=0;
		while(number>0)
		{
			int digit=number%10;
		sum=sum+digit;
		number=number/10;
		}
		System.out.println("Sum of the digits : " + sum);
	}

}
