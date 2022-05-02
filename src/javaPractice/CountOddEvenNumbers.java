package javaPractice;

import java.util.Scanner;

public class CountOddEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=Integer.parseInt(sc.nextLine());
		countOddAndEvenNumbers(number);
		sc.close();
		

	}

	private static void countOddAndEvenNumbers(int number) {
		int evenCount=0;
		int oddCount=0;
		while (number>0) {
			
			int reminder=number%10;
			if(reminder%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			number=number/10;
		}
		
		System.out.println("Even digits in number is : " + evenCount);
		System.out.println("Odd digits in number is : " + oddCount);
	}

}
