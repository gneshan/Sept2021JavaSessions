package javaPractice;

import java.util.Iterator;

public class EvenAndOddInArray {

	public static void main(String[] args) {

		int a[]= {26,13,26,23,45,79	};

		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("The number, " +a[i]+ " is Even");
			}else {
				System.out.println("The number, " +a[i]+ " is Odd");
			}
		}


	}
}