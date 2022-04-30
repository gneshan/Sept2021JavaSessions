package javaPractice;

public class Args {

	public static void main(String[] args){
		//String[] args1 = {"Hi","All"};
		if (args.length > 0) {
		System.out.println("The command line"+ " arguments are:");
		for(String val:args)
		System.out.println(val);
		} else
		System.out.println("No command line "+ "arguments found.");
		}

}
