package javaPractice;

import java.util.Arrays;

public abstract class AssendingSortAndCompare {

	public static void main(String[] args) {


		int a[] = {15,3,6,32,68,42,57};
		int b[] = {32,57,6,42,15,68,3};

//		Arrays.sort(a);
//		String arr1=Arrays.toString(a);
//		System.out.printf("\n\nSorted Array [a] %s",arr1);
//		Arrays.sort(b);
//		String arr2=Arrays.toString(a);
//		System.out.printf("\n\nSorted Array [b] %s",arr2);

		int temp,temp1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;				
				}
			}
		}
		
		for(int i=0;i<a.length;i++)		{
		System.out.print("\n Sorted Array a : " + a[i]);
		}

		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					temp1=b[i];
					b[i]=b[j];
					b[j]=temp1;				
				}
			}
		}

		for(int i=0;i<b.length;i++)		{
			System.out.print("\n Sorted Array b: " + b[i]);
			}



		boolean status=false;


		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++) {

				if(a[i]!=b[i]) {
					status=false;
					System.out.println(status);
				}
			}
			if(status==true) {
				System.out.println("\n Arrays are equal");
			}
			else {
				System.out.println("\n Arrays are not equal");
			}
		}
		else {

			System.out.println("\n Arrays are not equal-Outside");
		}
	}

}
