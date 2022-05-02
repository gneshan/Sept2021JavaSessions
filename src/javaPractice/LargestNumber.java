package javaPractice;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first digit : ");
		int FirstDigit=sc.nextInt();
		System.out.println("Enter the second digit : ");
		int SecondDigit=sc.nextInt();
		System.out.println("Enter the third digit : ");
		int ThirdDigit=sc.nextInt();
		
		largerInteger(FirstDigit,SecondDigit,ThirdDigit);
		sc.close();
	}

	private static void largerInteger(int firstDigit, int secondDigit, int thirdDigit) {
		 
		int largest1 = firstDigit>secondDigit?firstDigit:secondDigit;
		int largest2 = thirdDigit>largest1?thirdDigit:largest1;
		
		System.out.println("The largest digit : " + largest2);
		
	}

}
