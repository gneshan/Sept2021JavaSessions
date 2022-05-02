package javaPractice;

public class MissingNumberinArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,5};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			
			sum1+=a[i];
			
		}
		System.out.println(sum1);
		
		//checking the maximum
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum Value is : " + max);
		
		//checking the min
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Minimum Value is : " + min);
		
		int sum2=0;
		for(int i=min;i<=max;i++) {
			sum2+=i;			
		}
		System.out.println(sum2);
		System.out.println("The missing number is : " + (sum2-sum1));
	}

}
