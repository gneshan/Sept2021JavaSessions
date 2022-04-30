package javaPractice;

import java.util.Scanner;

public class ReverseSentenceWordByWord {

	

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Sentence to be reversed");
			String sentence = sc.nextLine();
		
		//String sentence = "Java Interview Questions";
		String reversedSentence = reverseSentence(sentence);
		System.out.println(reversedSentence);
		}
		public static String reverseSentence(String sentence){
		String reverse = "";
		String[] words	 = sentence.split("\\s");
		for(int i=words.length-1;i>=0;i--){
		reverse = reverse + words[i] + " ";
		}
		return reverse;
		}
	
}
