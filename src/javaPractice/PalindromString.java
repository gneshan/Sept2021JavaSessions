package javaPractice;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to check if its a Palindrom : ");
		String word=sc.next();
		isStringPalindrom(word);
		sc.close();

	}

	private static void isStringPalindrom(String word) {
		
		StringBuffer sbBuffer=new StringBuffer(word);
		String rev=sbBuffer.reverse().toString();
		if(rev.equalsIgnoreCase(word)) {
			System.out.println("Entered word, " +word+ " is palindrome");
		}
		else {
			System.out.println("Entered word, " +word+ " is not palindrome");
		}
	}

//	private static void isStringPalindrom(String word) {
//		String rev="";
//		int len=word.length();
//		for(int i=len-1;i>=0;i--) {
//		char ch=word.charAt(i);
//		rev=rev+ch;			
//		}
//		if(rev.equalsIgnoreCase(word)) {
//			System.out.println("Entered word, " +word+ " is palindrome");
//		}
//		else {
//			System.out.println("Entered word, " +word+ " is not palindrome");
//		}
//	}

	
	
}
