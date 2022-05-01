package javaPractice;

import java.util.Scanner;

public class FTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		FloydTriangle(num);
	}

	public static void FloydTriangle(int num) {
		int Fnumber=1;
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(Fnumber + " ");
				Fnumber++;
			}
			System.out.println();
			
		}
	
	}
	
}
