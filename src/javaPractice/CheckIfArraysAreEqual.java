package javaPractice;

import java.util.Arrays;

public class CheckIfArraysAreEqual {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7};
		int b[]= {1,2,3,4,5,6,8};
		//
		//		boolean isEqual=Arrays.equals(a, b);
		//
		//		if(isEqual==true) {
		//
		//			System.out.println("Arrays are Equal");
		//		}else {
		//
		//			System.out.println("Arrays are not Equal");
		//		}

		boolean status = false;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
				}
			}
			if (status==true) {
				System.out.println("Arrays are equal");					
			}else {

				System.out.println("Arrays are not equal");	
			}
		}
		else {

			System.out.println("Arrays are not equal");	

		}

	}

}
