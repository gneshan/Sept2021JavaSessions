package javaPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
	Boolean flag = false;
	Scanner sc = new Scanner(System.in)	;
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	
	for(int i=2; i<=num/2; i++) {
		if(num%i==0) {
		flag = true;
		break;
		}
	}
		if(!flag) {
			System.out.println("Given number is prime number");
		}
		else {
			System.out.println("Given number is not prime");
		}
	}

}
