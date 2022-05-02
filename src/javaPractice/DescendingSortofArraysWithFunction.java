package javaPractice;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSortofArraysWithFunction {

	public static void main(String[] args) {
		Integer a[] = {15,3,6,32,68,42,57};
		
		//Arrays.toString(a);
		Arrays.sort(a,Collections.reverseOrder());
		//print sorted array  
        System.out.printf("\n\nSorted Array: %s", 
               Arrays.toString(a)); 
        
        /*Very Important that primitive Types are not allowed for collections.reverse order*/
//		//Collections.reverseOrder do not work for primitive Types 
//        //define an array with Integer
//        Integer[] IntArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};  
// 
//        //print original array
//        System.out.printf("Original Array: %s", 
//                 Arrays.toString(IntArray)); 
// 
//        // Sorts IntArray in descending order 
//        Arrays.sort(IntArray, Collections.reverseOrder()); 
// 
//        //print sorted array  
//        System.out.printf("\n\nSorted Array: %s", 
//               Arrays.toString(IntArray)); 

	}

}
