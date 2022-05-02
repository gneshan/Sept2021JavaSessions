package javaPractice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;


public class RandomNumbersAndStrings {

	public static void main(String[] args) {


//		Random rand = new Random();
//		int randomNumbers=rand.nextInt(100);
//		if(randomNumbers>0) {
//		System.out.println(randomNumbers);
//		}
		
		String randomNumber=RandomStringUtils.randomNumeric(5);
		System.out.println(randomNumber);
		
		//RandomStringUtils.randomAlphabetic(4);
		System.out.println(RandomStringUtils.randomAlphabetic(4));
		System.out.println(RandomStringUtils.randomAlphanumeric(5));
	}

}
