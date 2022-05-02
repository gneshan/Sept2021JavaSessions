package javaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingNumbersArray {

	public static void main(String[] args) {
		int a[] = {15,3,6,32,68,42,57,57};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for(int j = i+1; j <a.length;j++) {

				if(a[i]>a[j]) {
					temp = a[i];
					a[i] =a[j];
					a[j] =temp;
					
				}

			}

		}
		
		List<Integer> list = new ArrayList<Integer>();
		//printing out sorted array
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
			
		}
		System.out.print("The sorted array is : " + list);
		
		
		//to find duplicate value
		
		Set<Integer> set=new HashSet<Integer>();
		//printing out sorted array
				for(int i=0;i<a.length;i++) {
					if(set.add(a[i])==false) {
						System.out.println("There is a dulicate Value and the Value is : " + a[i]);
					}
					
				}
				
		
	}

}
