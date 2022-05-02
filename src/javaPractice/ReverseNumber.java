package javaPractice;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
//reverseNumber(num);
//usingStringBuffer(num);
usingStringBuilder(num);
}


//public static void reverseNumber(int number){
//int reverse = 0;
//while(number!=0){
//int digit = number % 10;
//reverse = reverse * 10 + digit;
//number = number/10;
//}
//System.out.println("Reversed number " + reverse);
//}



//public static void usingStringBuffer(int number) {
//	
//	StringBuffer sb= new StringBuffer(String.valueOf(number));
//	StringBuffer rev=sb.reverse();
//	System.out.println("Reversed number " + rev);	
//}

public static void usingStringBuilder(int number) {

StringBuilder sb= new StringBuilder(String.valueOf(number));
StringBuilder rev=sb.reverse();
System.out.println("Reversed number " + rev);	
}




}