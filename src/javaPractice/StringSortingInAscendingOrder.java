package javaPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringSortingInAscendingOrder {

	public static void main(String[] args) {
		   String str_Array[] = {"Java", "Python", "Perl", "C++", "C#", "AS400"}; 
		   //Ascending Order
		   Arrays.sort(str_Array);
		   String ascOrder=Arrays.toString(str_Array);
		   System.out.printf("\n\n Ascending order : %s",ascOrder) ;
//		   
//		 //Descending Order
		   Arrays.sort(str_Array,Collections.reverseOrder());
		   String descOrder=Arrays.toString(str_Array);
		   System.out.printf("\n\n Descending order : %s",descOrder) ;
//		   
//		  //Ascending 
	  List<String> arrayList= Arrays.asList(str_Array);
		  
		  Collections.sort(arrayList);
		  for (String lang : arrayList) {
			  System.out.println(" " + lang);
			  }
		//Descending
		Collections.reverse(arrayList);	  
		for (String language : arrayList) {
			  System.out.println(" " + language);
			
		}
		   

	}
	
}
	

