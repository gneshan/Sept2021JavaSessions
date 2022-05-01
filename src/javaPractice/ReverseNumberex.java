package javaPractice;

import java.util.Scanner;

public class ReverseNumberex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		reverseNum(number);
	}

	public static void reverseNum(int number) {
		int reverse=0;
		while(number>0) {
		
			int remainder=number%10;//2
			reverse=reverse*10+remainder;
			number=number/10;			
		}
		
		System.out.println(reverse);
	}
}
