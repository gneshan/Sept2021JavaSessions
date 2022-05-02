package javaPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want to reverse : ");
		String word=sc.next();		
		//String reversedword=reversewording(word);		
		StringBuffer reversedword=reversewording(word);
		System.out.println("Reversed word is : " + reversedword);
		sc.close();

	}

	private static StringBuffer reversewording(String word) {
//		Method 1
//	int	len=word.length();
//	String rev="";
//	for(int i=len-1;i>=0;i--)
//	{
//		rev=rev+word.charAt(i);
//	}
//	return rev;
		
		//Method 2
		
//		char[] ch=word.toCharArray();
//		
//		String rev="";
//		
//		for(int i=ch.length-1;i>=0;i--) {
//			
//			rev=rev+ch[i];
//		}
//		
//		return rev;
		
		
		//Method 3 - String buffer
		
		StringBuffer sb=new StringBuffer(word);
		StringBuffer rev=sb.reverse();
		
		return rev;		
		
		
	}

		
		
		
}
