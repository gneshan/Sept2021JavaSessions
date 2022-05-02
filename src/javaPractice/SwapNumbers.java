package javaPractice;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter value of b : ");
		int b=sc.nextInt();
		System.out.println("Value of a : " + a + " - " + "Value of b : " +b + " before swapping");
		Swapnumbers(a,b);
	}
	
	public static void Swapnumbers(int a, int b) {
		
		//logic 1
		
//		a=a+b; //10+20=30
//		b=a-b; //30-20=10
//		a=a-b; //
//		System.out.println("Value of a : " + a + " - " + "Value of b : " +b + " after swapping in add logic");
//		
		//logic 2
//		int t;
//		t=a; //10
//		a=b; //20
//		b=t; //10
//		System.out.println("Value of a : " + a + " - " + "Value of b : " + b + " after swapping with temp value logic");
		
//		a=a*b; //10*20 =200
//		b=a/b; //200/20=10
//		a=a/b; //200/10=20
//		System.out.println("Value of a : " + a + " - " + "Value of b : " + b + " after swapping with multiply/division logic");
		
//		a=a^b; //10^20=30
//		b=a^b; //30^20=10
//		a=a^b; //30^10=20
//		System.out.println("Value of a : " + a + " - " + "Value of b : " + b + " after swapping with XOR logic");
		
		
		b=a+b-(a=b);
		System.out.println("Value of a : " + a + " - " + "Value of b : " + b + " after swapping with single statement logic");
		
		
	}
	

}
