package javaPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter till how many digit the series has to print : ");
		int number=sc.nextInt();
		
		int n1=0;int n2=1;int sum=0;
		System.out.print(n1 + " " + n2);
		for(int i=2;i<=number;i++) {
			
			sum=n1+n2;
			System.out.print(" "+ sum);
			n1=n2;
			n2=sum;
			
		}
		
	}

}
