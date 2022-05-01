package javaPractice;

import java.util.Scanner;

public class reversesentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String Sentence=sc.nextLine();
		String rev=reverseSentence(Sentence);
		System.out.println(rev);
				

	}

	
	public static String reverseSentence(String senterncetobereversed) {
		String reverse="";
		String[] words=senterncetobereversed.split("\\s");
		for(int i=words.length-1;i>=0;i--) {
			reverse = reverse + words[i] + " ";
			
		}
		return reverse;
	}
}
