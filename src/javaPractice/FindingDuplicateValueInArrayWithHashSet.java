package javaPractice;

import java.util.HashSet;

public class FindingDuplicateValueInArrayWithHashSet {

	public static void main(String[] args) {
		String str[] = {"Java", "Python", "Perl", "C++", "C#", "AS400"}; 

		HashSet<String> languages=new HashSet<String>();
		boolean flag=false;
		for (String val : str) {

			if(languages.add(val)==false) {

				flag=true;
				System.out.println("Duplicate values found are : " + val);
			}

		}
		if(flag==false) {
			System.out.println("No Duplicate values found");
		}

	}

}
