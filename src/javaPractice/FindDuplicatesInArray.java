package javaPractice;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		String str[] = {"Java", "Python", "Perl", "C++", "C#", "AS400","C++","Perl"}; 
		boolean flag=false;
		for(int i=0; i<str.length; i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equalsIgnoreCase(str[j])) {
					System.out.println("Duplicate Value is : " + str[i]);
					flag=true;											
				}

			}

		}
		if (flag==false) {
			System.out.println("No Duplicate Values found");
		}

	}

}
