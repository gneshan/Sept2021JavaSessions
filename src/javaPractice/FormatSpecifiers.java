package javaPractice;

import java.util.Date;
import java.util.Locale;

public class FormatSpecifiers {

	public static void main(String[] args) {
	
		
//		%c for a character.
//		%d or %i for integer.
//		%e for exponential floating-point number.
//		%f for a float number.
//		%o for octal numbers.
//		%s for a string.
//		%u for unsigned decimal (integer) number.
//		%x for hexadecimal numbers.
//		%t to formats date/time.
//		%n to print on a new line
//		
//		Escape sequence
//		\b –  for backspace.
//		\f – The next line will start from the last character of the current line.
//		\n – For newline.
//		\r – For carriage return.
//		\t – For tab.
		

	        String str = "Prad tutorials";
	        System.out.printf(str+"\n"); //prints string
	        
	        System.out.printf("hello %s\n",str); // prints string after hello
	        
	        System.out.printf("'%20s'\n",str); //adds white spaces before string. Length of Prad tutorials is 14. so this will add 6 white spaces
	        
	        System.out.printf("'%-20s'\n",str); // Same as above only minus sign will adds white spaces after string.
	        
	        System.out.printf("%S %s\n","hello", str); // %S will print hello in uppercase letters.
	        
	        System.out.println("***************************************************************");
	        
	        //Formatting char using printf in Java.
	        
	        char c = 'p';
	        System.out.printf("%c%n",c); // %c will print character in lower case format
	        
	        System.out.printf("%C%n",c); // %c will print character in upper case format
	        
	        System.out.println("***************************************************************");
	        //Formatting integer using printf in Java.
	        
	        System.out.printf("%d\n",1024); // prints number on console

	        System.out.printf(Locale.US,"%,d\n",500000); //prints number in US locale
	        
	        System.out.printf(Locale.ITALY,"%,d\n", 100000); //prints number in italy locale 
	        
	        System.out.println("***************************************************************");
	        
	        //Formatting floating-point number using Java printf function.
	        
	        System.out.printf("%f\n",4.293471); //prints floating point number
	        
	        System.out.printf("%.2f\n",9.257982); //prints 2 digits after floating point
	        
	        System.out.printf("'%6.3f'\n",8.24343); // adds white space same as string
	        
	        System.out.printf("%.2e\n",6.29487); //prints output in scientific notation
	        
	        System.out.printf("'%-10.2e'\n",3.25893); // adds white spaces after number
	        
	        System.out.println("***************************************************************");
	        
	        Date ob = new Date();
	        
	        System.out.printf("%tT\n",ob);
	        
	        System.out.printf("Hours:%tH Minutes:%tM Seconds:%tS \n",ob,ob,ob);
	        
	        System.out.printf("Hours:%tH Minutes:%tM Seconds:%tS Milliseconds:%tL Nanoseconds:%tN \n",ob,ob,ob,ob,ob);
	    
	        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", ob);
	  

	}

}
