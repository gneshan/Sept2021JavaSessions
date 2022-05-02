package javaPractice;

public class CountWordsInSentence {

	public static void main(String[] args) {
		String s = "I love you my darling";
		String[] words=s.split(" ");
		int size= words.length;
		System.out.println("Count of words in a sentence is : " + size);

	}

}
