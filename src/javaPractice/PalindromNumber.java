package javaPractice;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for palindrom : ");
		int number=sc.nextInt();
		isPalindrome(number);
		
	}
	
public static void isPalindrome(int number) {
	int rev=0;
	System.out.println("Initial Entered number is : " + number);
	int initNumber=number;
	
	while( number>0) {
		
		int temp=number%10;
		rev=rev*10+temp;
		number=number/10;
	}
	
	if (rev==initNumber) {
		System.out.println("Final reversed number is : " + rev);
		System.out.println("Entered number is Palindrome");
	}else {
		System.out.println("Final reversed number is : " + rev);
		System.out.println("Entered number is not a Palindrome");
	}
}


}
